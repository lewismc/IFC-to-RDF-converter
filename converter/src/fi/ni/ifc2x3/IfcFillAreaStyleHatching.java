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

public class IfcFillAreaStyleHatching extends IfcGeometricRepresentationItem implements IfcFillStyleSelect
{
 // The property attributes
 IfcCurveStyle   hatchLineAppearance;
IfcHatchLineDistanceSelect startOfNextHatchLine;
 IfcCartesianPoint   pointOfReferenceHatchLine;
 IfcCartesianPoint   patternStart;
 Double hatchLineAngle;


 // Getters and setters of properties

 public IfcCurveStyle getHatchLineAppearance() {
   return hatchLineAppearance;

 }
 public void setHatchLineAppearance(IfcCurveStyle value){
   this.hatchLineAppearance=value;

 }

 public IfcHatchLineDistanceSelect getStartOfNextHatchLine() {
   return startOfNextHatchLine;
 }
 public void setStartOfNextHatchLine(IfcHatchLineDistanceSelect value){
   this.startOfNextHatchLine=value;

 }

 public IfcCartesianPoint getPointOfReferenceHatchLine() {
   return pointOfReferenceHatchLine;

 }
 public void setPointOfReferenceHatchLine(IfcCartesianPoint value){
   this.pointOfReferenceHatchLine=value;

 }

 public IfcCartesianPoint getPatternStart() {
   return patternStart;

 }
 public void setPatternStart(IfcCartesianPoint value){
   this.patternStart=value;

 }

 public Double getHatchLineAngle() {
   return hatchLineAngle;
 }
 public void setHatchLineAngle(String txt){
   Double value = i.toDouble(txt);
   this.hatchLineAngle=value;

 }

}
