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

public class IfcSectionedSpine extends IfcGeometricRepresentationItem 
{
 // The property attributes
 IfcCompositeCurve   spineCurve;
 List<IfcProfileDef> crossSections = new IfcList<IfcProfileDef>();
 List<IfcAxis2Placement3D> crossSectionPositions = new IfcList<IfcAxis2Placement3D>();


 // Getters and setters of properties

 public IfcCompositeCurve getSpineCurve() {
   return spineCurve;

 }
 public void setSpineCurve(IfcCompositeCurve value){
   this.spineCurve=value;

 }

 public List<IfcProfileDef> getCrossSections() {
   return crossSections;

 }
 public void setCrossSections(IfcProfileDef value){
   this.crossSections.add(value);

 }

 public List<IfcAxis2Placement3D> getCrossSectionPositions() {
   return crossSectionPositions;

 }
 public void setCrossSectionPositions(IfcAxis2Placement3D value){
   this.crossSectionPositions.add(value);

 }

}
