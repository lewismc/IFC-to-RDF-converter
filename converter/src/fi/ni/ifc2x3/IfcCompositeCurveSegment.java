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

public class IfcCompositeCurveSegment extends IfcGeometricRepresentationItem 
{
 // The property attributes
 String transition;
 String sameSense;
 IfcCurve   parentCurve;


 // Getters and setters of properties

 public String getTransition() {
   return transition;
 }
 public void setTransition(String value){
   this.transition=value;

 }

 public String getSameSense() {
   return sameSense;
 }
 public void setSameSense(String value){
   this.sameSense=value;

 }

 public IfcCurve getParentCurve() {
   return parentCurve;

 }
 public void setParentCurve(IfcCurve value){
   this.parentCurve=value;

 }

}
