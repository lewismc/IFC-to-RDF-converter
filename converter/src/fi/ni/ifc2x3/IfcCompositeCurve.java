package fi.ni.ifc2x3;
import fi.ni.ifc2x3.interfaces.*;
import fi.ni.*;
import java.util.*;

/*
 * IFC Java class
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0 Unported License.
 * http://creativecommons.org/licenses/by/3.0/ 
 */

public class IfcCompositeCurve extends IfcBoundedCurve 
{
 // The property attributes
 List<IfcCompositeCurveSegment> segments = new IfcList<IfcCompositeCurveSegment>();
 String selfIntersect;


 // Getters and setters of properties

 public List<IfcCompositeCurveSegment> getSegments() {
   return segments;

 }
 public void setSegments(IfcCompositeCurveSegment value){
   this.segments.add(value);

 }

 public String getSelfIntersect() {
   return selfIntersect;
 }
 public void setSelfIntersect(String value){
   this.selfIntersect=value;

 }

}
