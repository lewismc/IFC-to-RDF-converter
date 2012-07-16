package fi.ni;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import fi.ni.ifc2x3.IfcOwnerHistory;
import fi.ni.ifc2x3.IfcRoot;
import fi.ni.vo.ReturnPair;
import fi.ni.vo.ValuePair;

/**
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0 Unported License.
 * http://creativecommons.org/licenses/by/3.0/
 */

public class IFC_ClassModelLibrary {

    // ========================================================================================================
    /** The static_touched_set. */
    static List<Thing> static_touched_set = new LinkedList<Thing>();

    // ========================================================================================================
    /**
     * Explain_differences.
     *
     * @param model1 The IFC model generated of an IFC file
     * @param model2 The IFC model generated of an IFC file
     * @param line_number1 the line_number1
     * @param line_number2 the line_number2
     * @param common_gids the list of GlobalID's which are common to the two models which are to be compared
     */
    static public void explain_differences(IFC_ClassModel model1, IFC_ClassModel model2, Long line_number1, Long line_number2, List<String> common_gids) {
        Thing thing1 = model1.getLineEntry(line_number1);
        Thing thing2 = model2.getLineEntry(line_number2);
        System.out.println("difference was:");
        explain_this(thing1, thing2, 0, common_gids, "");
        for (int n = 0; n < static_touched_set.size(); n++) {
            Thing t = (Thing) static_touched_set.get(n);
            t.i.setTouched(false);
        }
        static_touched_set.clear();
    }

    /**
     * Explain_this.
     *
     * @param pointer1 the current element at the graph pointing to model 1
     * @param pointer2 the current element at the graph pointing to model 2
     * @param level the iteration count in the recursive run
     * @param common_gids the list of GlobalID's which are common to the two models which are to be compared
     * @param path the path
     */
    static private void explain_this(Thing pointer1, Thing pointer2, int level, List<String> common_gids, String path) {
        path += "." + pointer1.getClass().getSimpleName();
        if (IfcRoot.class.isInstance(pointer1)) {
            String sgid = ((IfcRoot) pointer1).getGlobalId();
            path += "(" + sgid + ")";
        }
        else
            path += "(" + pointer1.i.drum_getLine_number() + ")";
        if (!pointer1.getClass().getSimpleName().equals(pointer2.getClass().getSimpleName()))
            System.out.println("   " + path + " class names differ. " + pointer1.getClass().getSimpleName() + " != " + pointer2.getClass().getSimpleName() + " level:" + level);
    
        if ((level > 0) && (IfcRoot.class.isInstance(pointer1))) {
            String sgid = ((IfcRoot) pointer1).getGlobalId();
            if (common_gids.contains(sgid)) return;
        }
        if ((level > 0) && (IfcRoot.class.isInstance(pointer2))) {
            String sgid = ((IfcRoot) pointer2).getGlobalId();
            if (common_gids.contains(sgid)) return;
        }
    
        if (pointer1.i.isTouched()) return;
        if (pointer2.i.isTouched()) return;
    
        pointer1.i.setTouched(true);
        pointer2.i.setTouched(true);
        static_touched_set.add(pointer1);
        static_touched_set.add(pointer2);
    
        List<ValuePair> l1 = pointer1.i.drum_getParameterAttributes();
        List<ValuePair> l2 = pointer2.i.drum_getParameterAttributes();
        if (l1.size() != l2.size())
            System.out.println("   " + path + " " + " ifc class attribute counts differ.");
        else
            for (int n = 0; n < l1.size(); n++) {
        	ValuePair vp1 = (ValuePair) l1.get(n);
        	ValuePair vp2 = (ValuePair) l2.get(n);
        	if (vp1.getName().equals(IFC_CLassModelConstants.GLOBAL_ID)) continue;
        	if (vp1.getName().equals(IFC_CLassModelConstants.LINE_NUMBER)) continue;
        	if (!vp1.getName().equals(vp2.getName())) System.out.println("   " + path + " " + " Atribute names does not match:" + vp1.getName() + " != " + vp2.getName());
    
        	if (!vp1.getValue().equals(vp2.getValue()))
        	    System.out.println("   " + path + " " + " Atribute " + vp1.getName() + " values does not match:" + vp1.getValue() + " != " + vp2.getValue());
            }
        List<ValuePair> ifcs1 = pointer1.i.drum_getIfcClassAttributes();
        List<ValuePair> ifcs2 = pointer2.i.drum_getIfcClassAttributes();
        if (ifcs1.size() != ifcs2.size())
            System.out.println("   " + path + " " + " ifc class reference counts differ.");
        else
            for (int n = 0; n < ifcs1.size(); n++) {
        	ValuePair vp1 = (ValuePair) ifcs1.get(n);
        	ValuePair vp2 = (ValuePair) ifcs2.get(n);
        	Thing t1 = (Thing) vp1.getValue();
        	Thing t2 = (Thing) vp2.getValue();
        	if (t1.getClass().equals(IfcOwnerHistory.class)) continue;
        	if (t2.getClass().equals(IfcOwnerHistory.class)) continue;
        	explain_this(t1, t2, level + 1, common_gids, path);
            }
    }

    /**
     * Explain_differences.
     *
     * @param model1 The IFC model generated of an IFC file
     * @param model2 The IFC model generated of an IFC file
     * @param line_number1 the line_number1
     * @param line_number2 the line_number2
     */
    static public void explain_differences(IFC_ClassModel model1, IFC_ClassModel model2, Long line_number1, Long line_number2) {
        Thing thing1 = model1.getLineEntry(line_number1);
        Thing thing2 = model2.getLineEntry(line_number2);
    
        explain_this(thing1, thing2, 0);
        for (int n = 0; n < static_touched_set.size(); n++) {
            Thing t = (Thing) static_touched_set.get(n);
            t.i.setTouched(false);
        }
        static_touched_set.clear();
    }

    /**
     * Explain_this.
     *
     * @param pointer1 the current element at the graph pointing to model 1
     * @param pointer2 the current element at the graph pointing to model 2
     * @param level the iteration count in the recursive run
     */
    static private void explain_this(Thing pointer1, Thing pointer2, int level) {
    
        if ((level > 0) && (IfcRoot.class.isInstance(pointer1))) return;
        if ((level > 0) && (IfcRoot.class.isInstance(pointer2))) return;
    
        if (pointer1.i.isTouched()) return;
        if (pointer2.i.isTouched()) return;
    
        pointer1.i.setTouched(true);
        pointer2.i.setTouched(true);
        static_touched_set.add(pointer1);
        static_touched_set.add(pointer2);
    
        List<ValuePair> l1 = pointer1.i.drum_getParameterAttributes();
        List<ValuePair> l2 = pointer2.i.drum_getParameterAttributes();
        if (l1.size() != l2.size())
            System.out.println(pointer1.getClass().getSimpleName() + " ifc class attribute counts differ.");
        else
            for (int n = 0; n < l1.size(); n++) {
        	ValuePair vp1 = (ValuePair) l1.get(n);
        	ValuePair vp2 = (ValuePair) l2.get(n);
        	if (vp1.getName().equals(IFC_CLassModelConstants.GLOBAL_ID)) continue;
        	if (vp1.getName().equals(IFC_CLassModelConstants.LINE_NUMBER)) continue;
        	if (!vp1.getName().equals(vp2.getName())) System.out.println(pointer1.getClass().getSimpleName() + " Atribute names does not match:" + vp1.getName() + " != " + vp2.getName());
    
        	if (!vp1.getValue().equals(vp2.getValue()))
        	    System.out.println(pointer1.getClass().getSimpleName() + " Atribute " + vp1.getName() + " values does not match:" + vp1.getValue() + " != " + vp2.getValue());
            }
        List<ValuePair> ifcs1 = pointer1.i.drum_getIfcClassAttributes();
        List<ValuePair> ifcs2 = pointer2.i.drum_getIfcClassAttributes();
        if (ifcs1.size() != ifcs2.size())
            System.out.println(pointer1.getClass().getSimpleName() + " ifc class reference counts differ.");
        else
            for (int n = 0; n < ifcs1.size(); n++) {
        	ValuePair vp1 = (ValuePair) ifcs1.get(n);
        	ValuePair vp2 = (ValuePair) ifcs2.get(n);
        	Thing t1 = (Thing) vp1.getValue();
        	Thing t2 = (Thing) vp2.getValue();
        	if (t1.getClass().equals(IfcOwnerHistory.class)) continue;
        	if (t2.getClass().equals(IfcOwnerHistory.class)) continue;
        	explain_this(t1, t2, level + 1);
            }
    }

    // ========================================================================================================
    /**
     * Calculate_nearest add from remove set.
     *
     * @param model1 The IFC model generated of an IFC file
     * @param model2 The IFC model generated of an IFC file
     * @param thing_to_compare The object representing to a IFC file line and used as an example to compare other objects to
     * @param common_gids the list of GlobalID's which are common to the two models which are to be compared
     * @param removed_set the removed_set
     * @return the return pair
     */
    static public ReturnPair calculate_nearestAddFromRemoveSet(IFC_ClassModel model1, IFC_ClassModel model2, Thing thing_to_compare, List<String> common_gids, List<String> removed_set) {
	Thing nearest_thing = null;
	int count = 0;
	double nearest_distance = Double.MAX_VALUE;
	for (int i = 0; i < removed_set.size(); i++) {
	    Thing thing2 = model1.gid_map.get(removed_set.get(i));
	    if (thing2 == null) {
		System.err.println("Removed item did not exist at the map. GID: " + removed_set.get(i));
		continue;
	    }
	    if (thing2.i.isTouched()) System.err.println("thing 2 touched already count:" + count);
	    count++;
	    double ret = calculate_difference(thing_to_compare, thing2, 0, common_gids);
	    if (ret < nearest_distance) {
		nearest_thing = thing2;
		nearest_distance = ret;
	    }
	    for (int n = 0; n < static_touched_set.size(); n++) {
		Thing t = (Thing) static_touched_set.get(n);
		t.i.setTouched(false);

	    }
	    static_touched_set.clear();
	}

	return new ReturnPair(nearest_thing, nearest_distance);
    }

    /**
     * Calculate_nearest remove from add set.
     *
     * @param model1 The IFC model generated of an IFC file
     * @param model2 The IFC model generated of an IFC file
     * @param thing_to_compare The object representing to a IFC file line and used as an example to compare other objects to
     * @param common_gids the list of GlobalID's which are common to the two models which are to be compared
     * @param add_set The list of GID's of added elements
     * @return the return pair
     */
    static public ReturnPair calculate_nearestRemoveFromAddSet(IFC_ClassModel model1, IFC_ClassModel model2, Thing thing_to_compare, List<String> common_gids, List<String> add_set) {
	Thing nearest_thing = null;
	int count = 0;
	double nearest_distance = Double.MAX_VALUE;
	for (int i = 0; i < add_set.size(); i++) {
	    Thing thing2 = model2.gid_map.get(add_set.get(i));
	    if (thing2 == null) {
		System.err.println("Removed item did not exist at the map. GID: " + add_set.get(i));
		continue;
	    }
	    if (thing2.i.isTouched()) System.err.println("thing 2 touched already count:" + count);
	    count++;
	    double ret = calculate_difference(thing_to_compare, thing2, 0, common_gids);
	    if (ret < nearest_distance) {
		nearest_thing = thing2;
		nearest_distance = ret;
	    }
	    for (int n = 0; n < static_touched_set.size(); n++) {
		Thing t = (Thing) static_touched_set.get(n);
		t.i.setTouched(false);

	    }
	    static_touched_set.clear();
	}

	return new ReturnPair(nearest_thing, nearest_distance);
    }

    // ========================================================================================================
    // Line number from model 2
    /**
     * Calculate_nearest add.
     *
     * @param model1 The IFC model generated of an IFC file
     * @param model2 The IFC model generated of an IFC file
     * @param thing_to_compare The object representing to a IFC file line and used as an example to compare other objects to
     * @param common_gids the list of GlobalID's which are common to the two models which are to be compared
     * @return the return pair
     */
    static public ReturnPair calculate_nearestAdd(IFC_ClassModel model1, IFC_ClassModel model2, Thing thing_to_compare, List<String> common_gids) {
	Thing nearest_thing = null;
	int count = 0;
	double nearest_distance = Double.MAX_VALUE;
	for (Map.Entry<Long, Thing> entry : model1.getObject_buffer().entrySet()) {
	    Thing thing2 = entry.getValue();
	    if (thing2.i.isTouched()) System.err.println("thing 2 touched already count:" + count);
	    count++;
	    double ret = calculate_difference(thing_to_compare, thing2, 0, common_gids);
	    if (ret < nearest_distance) {
		nearest_thing = thing2;
		nearest_distance = ret;
	    }
	    for (int n = 0; n < static_touched_set.size(); n++) {
		Thing t = (Thing) static_touched_set.get(n);
		t.i.setTouched(false);

	    }
	    static_touched_set.clear();
	}

	return new ReturnPair(nearest_thing, nearest_distance);
    }

    /**
     * Calculate_nearest remove.
     *
     * @param model1 The IFC model generated of an IFC file
     * @param model2 The IFC model generated of an IFC file
     * @param thing_to_compare The object representing to a IFC file line and used as an example to compare other objects to
     * @param common_gids the list of GlobalID's which are common to the two models which are to be compared
     * @return the return pair
     */
    static public ReturnPair calculate_nearestRemove(IFC_ClassModel model1, IFC_ClassModel model2, Thing thing_to_compare, List<String> common_gids) {
	Thing nearest_thing = null;
	int count = 0;
	double nearest_distance = Double.MAX_VALUE;
	for (Map.Entry<Long, Thing> entry : model2.getObject_buffer().entrySet()) {
	    Thing thing2 = entry.getValue();
	    if (thing2.i.isTouched()) System.err.println("thing 2 touched already count:" + count);
	    count++;
	    double ret = calculate_difference(thing_to_compare, thing2, 0, common_gids);
	    if (ret < nearest_distance) {
		nearest_thing = thing2;
		nearest_distance = ret;
	    }
	    for (int n = 0; n < static_touched_set.size(); n++) {
		Thing t = (Thing) static_touched_set.get(n);
		t.i.setTouched(false);

	    }
	    static_touched_set.clear();
	}

	return new ReturnPair(nearest_thing, nearest_distance);
    }

    /**
     * Calculate_difference.
     *
     * @param pointer1 the current element at the graph pointing to model 1
     * @param pointer2 the current element at the graph pointing to model 2
     * @param level the iteration count in the recursive run
     * @param common_gids the list of GlobalID's which are common to the two models which are to be compared
     * @return the double
     */
    static private double calculate_difference(Thing pointer1, Thing pointer2, int level, List<String> common_gids) {

	double difference = 0;
	if (!pointer1.getClass().getSimpleName().equals(pointer2.getClass().getSimpleName())) difference += 50;
	if ((level > 0) && (IfcRoot.class.isInstance(pointer1))) {
	    String sgid = ((IfcRoot) pointer1).getGlobalId();
	    if (common_gids.contains(sgid)) return difference;
	}
	if ((level > 0) && (IfcRoot.class.isInstance(pointer2))) {
	    String sgid = ((IfcRoot) pointer2).getGlobalId();
	    if (common_gids.contains(sgid)) return difference;
	}

	if (pointer1.i.isTouched()) {
	    if (level == 0) System.err.println("calculate diff: Pointer1 touched at level 0 beginning");
	    return difference;
	}
	if (pointer2.i.isTouched()) {
	    if (level == 0) System.err.println("calculate diff: Pointer2 touched at level 0 beginning");
	    return difference;
	}

	if (level > 100) return difference;
	pointer1.i.setTouched(true);
	pointer2.i.setTouched(true);
	static_touched_set.add(pointer1);
	static_touched_set.add(pointer2);

	List<ValuePair> l1 = pointer1.i.drum_getParameterAttributes();
	List<ValuePair> l2 = pointer2.i.drum_getParameterAttributes();
	if (l1.size() != l2.size())
	    difference += Math.abs(l1.size() - l2.size());
	else
	    for (int n = 0; n < l1.size(); n++) {
		ValuePair vp1 = (ValuePair) l1.get(n);
		ValuePair vp2 = (ValuePair) l2.get(n);
		if (vp1.getName().equals(IFC_CLassModelConstants.GLOBAL_ID)) continue;
		if (vp1.getName().equals(IFC_CLassModelConstants.LINE_NUMBER)) continue;
		if (!vp1.getName().equals(vp2.getName())) difference++;

		if (!vp1.getValue().equals(vp2.getValue())) difference++;

		if (vp1.getName().equals(IFC_CLassModelConstants.NAME)) if (!vp1.getValue().equals(vp2.getValue())) difference++;
		if (vp1.getName().equals(IFC_CLassModelConstants.DESCRIPTION)) if (!vp1.getValue().equals(vp2.getValue())) difference++;

	    }
	List<ValuePair> ifcs1 = pointer1.i.drum_getIfcClassAttributes();
	List<ValuePair> ifcs2 = pointer2.i.drum_getIfcClassAttributes();
	if (ifcs1.size() != ifcs2.size())
	    difference += Math.abs(ifcs1.size() - ifcs1.size());
	else
	    for (int n = 0; n < ifcs1.size(); n++) {
		ValuePair vp1 = (ValuePair) ifcs1.get(n);
		ValuePair vp2 = (ValuePair) ifcs2.get(n);
		Thing t1 = (Thing) vp1.getValue();
		Thing t2 = (Thing) vp2.getValue();
		if (t1.getClass().equals(IfcOwnerHistory.class)) continue;
		if (t2.getClass().equals(IfcOwnerHistory.class)) continue;
		difference = difference + 0.8 * calculate_difference(t1, t2, level + 1, common_gids);
	    }
	return difference;
    }

    // ========================================================================================================

}
