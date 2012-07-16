/*
 * @author Jyrki Oraskari
 * 
 * @license This work is licensed under a Creative Commons Attribution 3.0
 * Unported License.
 * http://creativecommons.org/licenses/by/3.0/
 */
package fi.ni;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import fi.ni.InverseLinksList;
import fi.ni.ifc2x3.IfcRoot;
import fi.ni.vo.Link;
import fi.ni.vo.ValuePair;

public class Thing {

    public int incoming_count=0;
    
    String thing_name;
    String thing_uri;
    public Long line_number;
    BigInteger global_id_value;

    // int pointed_count=0;
    Set<Thing> pointing_nodes = new HashSet<Thing>();
    public boolean is_grounded = false;
    public String grounding_name=null;
    public GroundingPath grounding_path=null;
    
    boolean literal_msg_done=false;
    
    LinkedList<GroundingPath> incoming_groundLinks_lists = new LinkedList<GroundingPath>();
    int min_path_score=Integer.MAX_VALUE;
    long last_paths_crc=Long.MAX_VALUE;  // to test the change
    Set<Long>  linkcrcs = new HashSet<Long>();
    int distance_from_element_tree=100;
    
    public internals i =new internals(this);;
    public class internals
    {
	    Thing host;
	    
	    public internals(Thing host) {
		super();
		this.host = host;
	    }

	    public GroundingPath drum_getGroudingPath()
	    {
		if(grounding_path!=null)
		    return grounding_path;
		if(incoming_groundLinks_lists.size()==0)
	          return null;
		if(incoming_groundLinks_lists.size()==1)
		{
		        incoming_groundLinks_lists.get(0).same_score_count=1;
		        if(!incoming_groundLinks_lists.get(0).disabled)
			return incoming_groundLinks_lists.get(0);
		}
		
		int min_score=Integer.MAX_VALUE;
		int same_score_count=0;
		GroundingPath result=null;
		for(int n=0;n<incoming_groundLinks_lists.size();n++)
		{
		    GroundingPath tmplist=incoming_groundLinks_lists.get(n);
		    if(!tmplist.disabled)
		    {
		     if(tmplist.score==min_score)
		     {
		        same_score_count++;
		     }	   
		     else if(tmplist.score<min_score)
		     {
			min_score=tmplist.score;
			same_score_count=1;
			result=tmplist;
		     }
		    }
		    
		}
	        if(result==null)
	            return null;
		
	        // The winners same count.. the others can have zero values
	        result.same_score_count=same_score_count;
	        grounding_path=result;
		return result;
	    }
	
	    public long drum_getpathsCRC()
	    {
		long ret=0;
		for(int n=0;n<incoming_groundLinks_lists.size();n++)
		{
		    GroundingPath tl=incoming_groundLinks_lists.get(n);
		    ret+=tl.getCRC32();
		}
	       return ret;
	    }
	    

	    private boolean ready = true;
	    private boolean touched = false;

	    public void printOutIncomingLinks()
	    {
		GroundingPath gpath=drum_getGroudingPath();
		if(gpath!=null)
		if(gpath.same_score_count>1)
		{
		if(incoming_groundLinks_lists.size()==0)
		    return;
		System.out.println("---------------------------------------------------------");
		System.out.println(host.line_number+": min score:"+host.min_path_score+" grounded:"+host.is_grounded+" by: "+drum_getGroudingPath().grounded_by.line_number);
		for(int n=0;n<incoming_groundLinks_lists.size();n++)
		{
		    GroundingPath tmplist=incoming_groundLinks_lists.get(n);
		    Thing gb=tmplist.grounded_by;
		    System.out.print(gb.line_number+" s:"+tmplist.score+" same:"+tmplist.same_score_count);
		    Thing lstart=gb;
		    for(int i=0;i<tmplist.getList().size();i++)
		    {
			Link l=tmplist.getList().get(i);
			Thing lend=l.getTheOtherEnd(lstart);
			System.out.print(" "+lstart.line_number+"->"+l.property+"("+l.isTheWay(lstart)+")"+"->"+lend.line_number);	
			lstart=lend;
		    }
		    System.out.println();
		}
		}
	       
	    }
	    
	    public String drum_getName()
	    {
		if(IfcRoot.class.isInstance(this))
		    return ((IfcRoot)host).getGlobalId();
		else
		    return line_number.toString();
		
	    }
	    
	    public BigInteger drum_getGlobal_id_value() {
		return global_id_value;
	    }

	    public void drum_setGlobal_id_value(BigInteger param) {
		global_id_value = param;
	    }

	    public Long drum_getLine_number() {	
		return line_number;
	    }

	    public void drum_setLine_number(Long param) {
		line_number = param;
	    }

	    public boolean isTouched() {
		return touched;
	    }

	    public void setTouched(boolean touched) {
		this.touched = touched;
	    }

	    public boolean isReady() {
		return ready;
	    }

	    public void setReady(boolean ready) {
		this.ready = ready;
	    }

	    @SuppressWarnings("unchecked")
	    public List<ValuePair> drum_getParameterAttributes() {
		List<ValuePair> ret = new ArrayList<ValuePair>();
		ret.add(new ValuePair("line_number", line_number));
		Method method[] = host.getClass().getMethods();
		for (int j = 0; j < method.length; j++) {
		    try {
			if (method[j].getName().startsWith("get")) {
			    Object o = method[j].invoke(host);
			    if (List.class.isInstance(o)) {
				for (int n = 0; n < ((List<Object>) o).size(); n++) {
				    Object o1 = ((List<Object>) o).get(n);
				    if (String.class.isInstance(o1))
					ret.add(new ValuePair(method[j].getName().substring(3), o1));
				    if (Double.class.isInstance(o1))
					ret.add(new ValuePair(method[j].getName().substring(3), o1));
				    if (Long.class.isInstance(o1))
					ret.add(new ValuePair(method[j].getName().substring(3), o1));
				    if (Date.class.isInstance(o1))
					ret.add(new ValuePair(method[j].getName().substring(3), o1));

				}
			    } else {
				if (String.class.isInstance(o))
				    ret.add(new ValuePair(method[j].getName().substring(3), o));
				if (Double.class.isInstance(o))
				    ret.add(new ValuePair(method[j].getName().substring(3), o));
				if (Long.class.isInstance(o))
				    ret.add(new ValuePair(method[j].getName().substring(3), o));
				if (Date.class.isInstance(o))
				    ret.add(new ValuePair(method[j].getName().substring(3), o));
			    }

			}
		    } catch (Exception e) {
			e.printStackTrace();
		    }

		}
		return ret;
	    }

	    @SuppressWarnings("unchecked")
	    public List<ValuePair> drum_getParameterAttributeValues() {
		List<ValuePair> ret = new ArrayList<ValuePair>();
		ret.add(new ValuePair("line_number", line_number));
		Method method[] = host.getClass().getMethods();
		for (int j = 0; j < method.length; j++) {
		    try {
			if (method[j].getName().startsWith("get")) {
			    Object o = method[j].invoke(host);
			    if (List.class.isInstance(o))
				ret.add(new ValuePair(method[j].getName().substring(3), o));
			    if (String.class.isInstance(o))
				ret.add(new ValuePair(method[j].getName().substring(3), o));
			    if (Double.class.isInstance(o))
				ret.add(new ValuePair(method[j].getName().substring(3), o));
			    if (Long.class.isInstance(o))
				ret.add(new ValuePair(method[j].getName().substring(3), o));
			    if (Date.class.isInstance(o))
				ret.add(new ValuePair(method[j].getName().substring(3), o));

			}
		    } catch (Exception e) {
			e.printStackTrace();
		    }

		}
		return ret;
	    }

	    @SuppressWarnings("unchecked")
	    public List<ValuePair> drum_getIfcClassAttributes() {
		List<ValuePair> ret = new ArrayList<ValuePair>();
		Method method[] = host.getClass().getMethods();
		for (int j = 0; j < method.length; j++) {
		    try {
			if (method[j].getName().startsWith("get")) {
			    Object o = method[j].invoke(host);
			    if (Thing.class.isInstance(o))
				ret.add(new ValuePair(method[j].getName().substring(3), o));
			    if (List.class.isInstance(o)) {
				for (int n = 0; n < ((List<Object>) o).size(); n++) {
				    Object o1 = ((List<Object>) o).get(n);
				    if (Thing.class.isInstance(o1))
					ret.add(new ValuePair(method[j].getName().substring(3), o1));

				}
			    }
			}

		    } catch (Exception e) {
			e.printStackTrace();
		    }

		}
		return ret;
	    }

	    
	    public List<Link> drum_getIfcClassAttributes_notInverses() {
		List<Link> ret = new ArrayList<Link>();
		Method method[] = host.getClass().getMethods();
		for (int j = 0; j < method.length; j++) {
		    try {
			if (method[j].getName().startsWith("get")) {
			    Object o = method[j].invoke(host);
			    if (Thing.class.isInstance(o))
				ret.add(new Link(host,(Thing)o,method[j].getName().substring(3)));
			    if (List.class.isInstance(o)) {
				if (!InverseLinksList.class.isInstance(o))
				{
				     if (IfcList.class.isInstance(o))
				     {
                                       // LIST
				       for (int n = 0; n < ((List<Object>) o).size(); n++) {
				         Object o1 = ((List<Object>) o).get(n);
				         if (Thing.class.isInstance(o1))
					    ret.add(new Link(host,(Thing)o1,method[j].getName().substring(3)+"."+n));
				       }
				     }
				     else
				     {
					 //SET
			  	        for (int n = 0; n < ((List<Object>) o).size(); n++) {
				          Object o1 = ((List<Object>) o).get(n);
					  if (Thing.class.isInstance(o1))
				            ret.add(new Link(host,(Thing)o1,method[j].getName().substring(3)));
					   
				         }
				     }
				}
				
			    }
			}

		    } catch (Exception e) {
			e.printStackTrace();
		    }

		}
		return ret;
	    }

	    @SuppressWarnings("unchecked")
	    public List<ValuePair> drum_getIfcClassAttributes_2_CHKSUM() {
		List<ValuePair> ret = new ArrayList<ValuePair>();
		Method method[] = host.getClass().getMethods();
		for (int j = 0; j < method.length; j++) {
		    try {
			if (method[j].getName().startsWith("get")) {
			    Object o = method[j].invoke(host);
			    if (Thing.class.isInstance(o))
				ret.add(new ValuePair(method[j].getName().substring(3), o));
			    if (List.class.isInstance(o)) {
				//if (!InverseLinksList.class.isInstance(o))
				    for (int n = 0; n < ((List<Object>) o).size(); n++) {
					Object o1 = ((List<Object>) o).get(n);
					if (Thing.class.isInstance(o1))
					    ret.add(new ValuePair(method[j].getName().substring(3), o1));

				    }
			    }
			}

		    } catch (Exception e) {
			e.printStackTrace();
		    }

		}
		return ret;
	    }


	    public Long toLong(String txt) {
		try {
		    if (Long.valueOf(txt) == null)
			System.out.println("Long?=" + txt);
		    return Long.valueOf(txt);
		} catch (Exception e) {
		    e.printStackTrace();
		    return Long.MIN_VALUE;
		}
	    }

	    public List<Long> toLongList(String txt) {
		List<Long> ret_value = new ArrayList<Long>();
		String[] txtlist = txt.split(",");
		for (int n = 0; n < txtlist.length; n++) {
		    try {
			if (Long.valueOf(txtlist[n]) == null)
			    System.out.println("Long?=" + txtlist[n]);
			ret_value.add(Long.valueOf(txtlist[n]));
		    } catch (Exception e) {
			e.printStackTrace();
		    }
		}

		return ret_value;
	    }

	    public double toDouble(String txt) {
		try {
		    return Double.valueOf(format_number(txt));
		} catch (Exception e) {
		    e.printStackTrace();
		    return Double.MIN_VALUE;
		}
	    }

	    public List<Double> toDoubleList(String txt) {
		List<Double> ret_value = new ArrayList<Double>();
		String[] txtlist = txt.split(",");
		for (int n = 0; n < txtlist.length; n++) {
		    try {
			ret_value.add(Double.valueOf(format_number(txtlist[n])));
		    } catch (Exception e) {
			e.printStackTrace();
		    }
		}

		return ret_value;
	    }

	    private String format_number(String txt) {
		StringBuffer sb = new StringBuffer();
		for (int n = 0; n < txt.length(); n++) {
		    char ch = txt.charAt(n);
		    switch (ch) {
		    case '_':
			sb.append('.');
			break;
		    default:
			sb.append(ch);
		    }
		}
		return sb.toString();
	    }

	    // Get possible groundables no list or set is allowed
	    public List<ValuePair> ifcObjectList() {
		List<ValuePair> ret = new ArrayList<ValuePair>();
		Method method[] = host.getClass().getMethods();
		for (int j = 0; j < method.length; j++) {
		    try {
			if (method[j].getName().startsWith("get")) {
			    Object o = method[j].invoke(host);
			    if (Thing.class.isInstance(o))
				ret.add(new ValuePair(method[j].getName().substring(3), o));
			}

		    } catch (Exception e) {
			e.printStackTrace();
		    }

		}
		return ret;
	    }

	    // Only lists or sets which have 0 or 1 members are allowed here
	    public List<Link> ifcAnyObjectListOfLimitedCardinality() {
		List<Link> ret = new ArrayList<Link>();
		Method method[] = host.getClass().getMethods();
		for (int j = 0; j < method.length; j++) {
		    try {
			if (method[j].getName().startsWith("get")) {
			    Object o = method[j].invoke(host);
			    if (Thing.class.isInstance(o))				
				ret.add(new Link(host,(Thing)o,method[j].getName().substring(3)));

			    if (List.class.isInstance(o)) {
				     if (IfcList.class.isInstance(o))
				     {
					      for (int n = 0; n < ((List<Object>) o).size(); n++) {
							Object o1 = ((List<Object>) o).get(n);
							if (Thing.class.isInstance(o1))
							{
							    Link l=new Link(host,(Thing)o1,method[j].getName().substring(3));
							    l.setListIndex(n);
							    ret.add(l);
							}
					      }
				     }
				     else
				    {
				    if(((List<Object>) o).size()<2)  // no more than 0 or 1
					      for (int n = 0; n < ((List<Object>) o).size(); n++) {
							Object o1 = ((List<Object>) o).get(n);
							if (Thing.class.isInstance(o1))
							    ret.add(new Link(host,(Thing)o1,method[j].getName().substring(3)));
					      }
				    }
			    }

			    
			}

		    } catch (Exception e) {
			e.printStackTrace();
		    }

		}
		return ret;
	    }

	    
	    @SuppressWarnings("unchecked")
	    public List<ValuePair> drum_getGroundablesInversesList() {
		List<ValuePair> ret = new ArrayList<ValuePair>();
		Method method[] = host.getClass().getMethods();
		for (int j = 0; j < method.length; j++) {
		    try {
			if (method[j].getName().startsWith("get")) {
			    Object o = method[j].invoke(host);
			    if (InverseLinksList.class.isInstance(o))
				for (int n = 0; n < ((List<Object>) o).size(); n++) {
				    Object o1 = ((List<Object>) o).get(n);
				    if (Thing.class.isInstance(o1))
					ret.add(new ValuePair(method[j].getName().substring(3), o1));

				}
			}

		    } catch (Exception e) {
			e.printStackTrace();
		    }

		}
		return ret;

	    }

    }
    
    @Override
    public String toString() {
	if (IfcRoot.class.isInstance(this))
	    return this.getClass().getSimpleName() + "(" + ((IfcRoot) this).getGlobalId() + ")";
	else
	    return this.getClass().getSimpleName() + "(" + line_number + ")";
    }

    
}
