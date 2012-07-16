package fi.ni.vo;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import fi.ni.Thing;
import fi.ni.ifc2x3.IfcRoot;

/**
 * 
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0
 *          Unported License.
 *          http://creativecommons.org/licenses/by/3.0/
 */

public class Link {
    public static Set<Thing> printed = new HashSet<Thing>();

    public boolean used = false;
    public Thing t1;
    public Thing t2;
    public String property;
    private int listIndex=Integer.MIN_VALUE;   // if this is  part of a list, the index it has
    

    public Link(Thing t1, Thing t2, String property) {
	super();
	this.t1 = t1;
	this.t2 = t2;
	this.property = property;
    }

    public Link(Triple t) {
	super();
	this.t1 = t.s;
	if(!t.literal)
	   this.t2 = (Thing)t.o;
	else
	    this.t2 = null;
	this.property = t.p;
    }
    
    public int getListIndex() {
	    return listIndex;
	}
	public void setListIndex(int listIndex) {
	    this.listIndex = listIndex;
	}

    public Thing getTheOtherEnd(Thing t) {
	if (t == t1)
	    return t2;
	else
	    return t1;
    }

    public boolean isTheWay(Thing t) {
	if (t == t1)
	    return true;
	else
	    return false;
    }

    public String nodes2String(Map<String, EntityVO> entities) {
	String retval = "";
	
	String t1_groundings="";
	if(t1.i.drum_getGroudingPath()!=null)
	  t1_groundings+="_"+ t1.i.drum_getGroudingPath().grounded_by.line_number;


	String t2_groundings="";
	if(t2.i.drum_getGroudingPath()!=null)
	  t2_groundings+="_"+ t2.i.drum_getGroudingPath().grounded_by.line_number;


	if (!printed.contains(t1)) {
	    String t1_style = " style=filled, fillcolor=white,color=black ";
	    String t1_label = "i" + t1.line_number + t1.getClass().getSimpleName();
	    String t1_olabel = "i" + t1.line_number + "_" + t1.getClass().getSimpleName()+t1_groundings;
	    /*if (!IfcRoot.class.isInstance(t1)) {
		boolean is_identifier = false;
		EntityVO evo = entities.get(t1.getClass().getSimpleName().toUpperCase());
		if (evo != null) {
		    List<AttributeVO> avolist = evo.getDerived_attribute_list();
		    for (int n = 0; n < avolist.size(); n++) {
			AttributeVO avo = avolist.get(n);
			if (avo.getType().getName().equals("IfcIdentifier"))
			    is_identifier = true;
		    }
		}
		if (is_identifier)
		    t1_style = " style=filled, fillcolor=lightblue,color=black ";

	    }

	    
	      if(IfcShapeModel.class.isInstance(t1))
	      {
	      t1_style=" style=filled, fillcolor=green,color=black ";
	      }
	      
	      if(IfcStyleModel.class.isInstance(t1))
	     {
	      t1_style=" style=filled, fillcolor=green,color=black ";
	     }
	     

	    */

	    if (t1.is_grounded)
		t1_style = " style=filled, fillcolor=yellow,color=black ";

	    if (IfcRoot.class.isInstance(t1))
		t1_style = " style=filled, fillcolor=red,color=black ";

	    retval += " node [label=\"" + t1_olabel + "\" " + t1_style + "] " + t1_label + ";\n";
	    printed.add(t1);
	}

	if (!printed.contains(t2)) {
	    String t2_style = " style=filled, fillcolor=white,color=black ";
	    String t2_label = "i" + t2.line_number + t2.getClass().getSimpleName();
	    String t2_olabel = "i" + t2.line_number + "_" + t2.getClass().getSimpleName()+t2_groundings;

	    /*if (!IfcRoot.class.isInstance(t2)) {
		boolean is_identifier = false;
		EntityVO evo = entities.get(t2.getClass().getSimpleName().toUpperCase());
		if (evo != null) {
		    List<AttributeVO> avolist = evo.getDerived_attribute_list();
		    for (int n = 0; n < avolist.size(); n++) {
			AttributeVO avo = avolist.get(n);
			if (avo.getType().getName().equals("IfcIdentifier"))
			    is_identifier = true;
		    }
		}
		if (is_identifier)
		    t2_style = " style=filled, fillcolor=lightblue,color=black ";

	    }

	    
	    if (IfcShapeModel.class.isInstance(t2)) {
		t2_style = " style=filled, fillcolor=green,color=black ";
	    }

	    if (IfcStyleModel.class.isInstance(t2)) {
		t2_style = " style=filled, fillcolor=green,color=black ";
	    }
	    */


	    if (t2.is_grounded)
		t2_style = " style=filled, fillcolor=yellow,color=black ";

	    if (IfcRoot.class.isInstance(t2))
		t2_style = " style=filled, fillcolor=red,color=black ";

	    retval += " node [label=\"" + t2_olabel + "\" " + t2_style + "] " + t2_label + ";\n";
	    printed.add(t2);
	}
	return retval;

    }

    public String toString() {
	String retval = "";
	String t1_pad = "";
	String t2_pad = "";
	if (IfcRoot.class.isInstance(t1))
	    t1_pad = "_";
	if (IfcRoot.class.isInstance(t2))
	    t2_pad = "_";
	if (t1.is_grounded)
	    t1_pad = ".";
	if (t2.is_grounded)
	    t2_pad = ".";
	
	

	// return " "+t1_pad+t1.line_number+t1_pad + "-"+property+"-" +
	// t2_pad+t2.line_number+t2_pad+" ";
	// return
	// " i"+t1.line_number+"("+t1_pad+t1.getClass().getSimpleName() +
	// ")\t"+property+"\ti" +
	// t2.line_number+"("+t2_pad+t2.getClass().getSimpleName()+") ";
	// //CCMAPTools
	retval += " i" + t1.line_number +""+ t1.getClass().getSimpleName() + "  -> i" + t2.line_number + t2.getClass().getSimpleName() + " [arrowsize=1.0, color=black, label=\"" + property + "\", labelangle=-25, \r\n" + "            labeldistance=0.3, labelfontsize=10, arrowtail=diamond\r\n"
		+ "         ];\r\n";
	return retval;
    }

    public String neatString() {
	String retval = "";
	retval += " " + t1.line_number +"."+ t1.getClass().getSimpleName() + "  -" +property+"- "+
			" " + t2.line_number +"."+ t2.getClass().getSimpleName();
	return retval;
    }

}
