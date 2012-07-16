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

public class IfcCurveStyleFontPattern extends Thing 
{
 // The property attributes
 Double visibleSegmentLength;
 Double invisibleSegmentLength;


 // Getters and setters of properties

 public Double getVisibleSegmentLength() {
   return visibleSegmentLength;
 }
 public void setVisibleSegmentLength(String txt){
   Double value = i.toDouble(txt);
   this.visibleSegmentLength=value;

 }

 public Double getInvisibleSegmentLength() {
   return invisibleSegmentLength;
 }
 public void setInvisibleSegmentLength(String txt){
   Double value = i.toDouble(txt);
   this.invisibleSegmentLength=value;

 }

}
