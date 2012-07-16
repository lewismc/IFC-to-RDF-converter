/*
 * @author Jyrki Oraskari
 * 
 * @license This work is licensed under a Creative Commons Attribution 3.0
 * Unported License.
 * http://creativecommons.org/licenses/by/3.0/
 */
package fi.ni.vo;

import fi.ni.Thing;

public class ReturnPair {
    Thing  t;
    public double difference;
    
    public ReturnPair(Thing t, double difference) {
	super();
	this.t = t;
	this.difference = difference;
    }
    public Thing getT() {
        return t;
    }

    public void setT(Thing t) {
        this.t = t;
    }
    public double getDifference() {
        return difference;
    }
    public void setDifference(double difference) {
        this.difference = difference;
    }
    
    @Override
    public String toString() {
	return "ReturnPair [t=" + t + ", difference=" + difference + "]";
    }
    

}
