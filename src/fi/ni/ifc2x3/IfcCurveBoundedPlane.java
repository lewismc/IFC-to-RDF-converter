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

public class IfcCurveBoundedPlane extends IfcBoundedSurface 
{
 // The property attributes
 IfcPlane   basisSurface;
 IfcCurve   outerBoundary;
 List<IfcCurve> innerBoundaries = new IfcSet<IfcCurve>();


 // Getters and setters of properties

 public IfcPlane getBasisSurface() {
   return basisSurface;

 }
 public void setBasisSurface(IfcPlane value){
   this.basisSurface=value;

 }

 public IfcCurve getOuterBoundary() {
   return outerBoundary;

 }
 public void setOuterBoundary(IfcCurve value){
   this.outerBoundary=value;

 }

 public List<IfcCurve> getInnerBoundaries() {
   return innerBoundaries;

 }
 public void setInnerBoundaries(IfcCurve value){
   this.innerBoundaries.add(value);

 }

}
