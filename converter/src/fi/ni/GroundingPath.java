package fi.ni;

import java.util.LinkedList;
import java.util.List;
import java.util.zip.CRC32;

import fi.ni.vo.Link;

/**
 * 
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0
 *          Unported License.
 *          http://creativecommons.org/licenses/by/3.0/
 */


public class GroundingPath
{
	private LinkedList<Link> list=new LinkedList<Link>();
	int score;
	int  same_score_count;
	public Thing grounded_by;
	private CRC32 pathcrc32 = new CRC32();
	boolean disabled=false;

		
	public GroundingPath(Thing g_by) {
	    this.score = 0;
	    this.grounded_by = g_by;
	}

	public int getSame_count() {
	    return same_score_count;
	}
	public void setSame_count(int same_count) {
	    this.same_score_count = same_count;
	}
		

	public void addAll(List<Link> list)
	{
	    for(int n=0;n<list.size();n++)
		add(list.get(n));
	}

	public void add(Link l)
	{
	    pathcrc32.update(l.t1.getClass().getSimpleName().getBytes());
	    pathcrc32.update(l.t1.i.drum_getName().getBytes());
	    pathcrc32.update(l.property.getBytes());
	    pathcrc32.update(l.t2.getClass().getSimpleName().getBytes());
	    pathcrc32.update(l.t2.i.drum_getName().getBytes());
	    list.add(l);
	}

	public LinkedList<Link> getList() {
	    return list;
	}

	public void setList(LinkedList<Link> list) {
	    this.list = list;
	}
	
	public long getCRC32()
	{
	    return pathcrc32.getValue();
	   
	}
	
	public String getGroundingName()
	{
	    if(disabled)
		return null;
	    StringBuffer sb=new StringBuffer();
	    sb.append(grounded_by.grounding_name);
	    
	    for(int i=0;i<list.size();i++)
	    {
		Link l=list.get(i);
		sb.append('.');
		sb.append(l.property);
		
	    }
	    return sb.toString();
	}
}
