package fi.ni.vo;

/**
 * 
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0
 *          Unported License.
 *          http://creativecommons.org/licenses/by/3.0/
 */

import java.util.HashSet;
import java.util.Set;

import fi.ni.Thing;

public class Triple {
    static Set<Thing> printed = new HashSet<Thing>();

    boolean used = false;
    public Thing  s;
    public Object o;
    public String p;
    
    public boolean literal=false;
    
    public Triple(Link l) {
	this.s = l.t1;
	this.p = l.property;
	this.o = l.t2;
    }

    public Triple(Thing subject, String property,Object object) {
	this.s = subject;
	this.p = property;
	this.o = object;
	literal=true;
    }


}
