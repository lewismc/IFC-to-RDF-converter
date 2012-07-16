package fi.ni;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0
 *          Unported License.
 *          http://creativecommons.org/licenses/by/3.0/
 */

public class GroundingPathRegistry {
    
    private Map<String,List<GroundingPath>> registry;    

    public GroundingPathRegistry() {
	   registry=new HashMap<String,List<GroundingPath>>();
	}
	
	public boolean register(GroundingPath gp)
	{
	    String key=gp.getGroundingName();
	    if(key==null)
		return false;
	    List<GroundingPath> l=registry.get(key);
	    boolean ret=false;
	    if(l!=null)
	    {
		ret=true;
	    }
	    else
	    {
		l=new LinkedList<GroundingPath>();
		registry.put(key,l);
	    }
	    l.add(gp);
	    if(ret==true)
	    {
		for(int i=0;i<l.size();i++)
		{
		    GroundingPath gpt=l.get(i);
		    gpt.disabled=true;
		}
	    }
	    return ret;
	}
}
