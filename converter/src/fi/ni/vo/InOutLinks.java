package fi.ni.vo;

/**
 * 
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0
 *          Unported License.
 *          http://creativecommons.org/licenses/by/3.0/
 */

public class InOutLinks implements Comparable<InOutLinks>
{
	int in;
	int out;
	public InOutLinks(int in, int out) {
	    super();
	    this.in = in;
	    this.out = out;
	}
		
	private String f(int n)
	{
	    return String.format("%06d", n);
	}
	public String toString() {
	    return f(out)+","+f(in);
	}
	
    public boolean equals(Object obj) {
        InOutLinks i=(InOutLinks)obj;
        if((i.in==this.in)&&(i.out==this.out))
    	    return true;
        else
    	     return false;
    }
    
	public int compareTo(InOutLinks o) {
        return -o.toString().compareTo(this.toString());
	}
	
	public int distance(InOutLinks o)
	{
	    return Math.abs(o.in-this.in) + Math.abs(o.out - this.out);
	}
}
