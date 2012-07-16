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

public class IfcTendon extends IfcReinforcingElement 
{
 // The property attributes
 String predefinedType;
 Double nominalDiameter;
 Double crossSectionArea;
 Double tensionForce;
 Double preStress;
 Double frictionCoefficient;
 Double anchorageSlip;
 Double minCurvatureRadius;


 // Getters and setters of properties

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

 public Double getNominalDiameter() {
   return nominalDiameter;
 }
 public void setNominalDiameter(String txt){
   Double value = i.toDouble(txt);
   this.nominalDiameter=value;

 }

 public Double getCrossSectionArea() {
   return crossSectionArea;
 }
 public void setCrossSectionArea(String txt){
   Double value = i.toDouble(txt);
   this.crossSectionArea=value;

 }

 public Double getTensionForce() {
   return tensionForce;
 }
 public void setTensionForce(String txt){
   Double value = i.toDouble(txt);
   this.tensionForce=value;

 }

 public Double getPreStress() {
   return preStress;
 }
 public void setPreStress(String txt){
   Double value = i.toDouble(txt);
   this.preStress=value;

 }

 public Double getFrictionCoefficient() {
   return frictionCoefficient;
 }
 public void setFrictionCoefficient(String txt){
   Double value = i.toDouble(txt);
   this.frictionCoefficient=value;

 }

 public Double getAnchorageSlip() {
   return anchorageSlip;
 }
 public void setAnchorageSlip(String txt){
   Double value = i.toDouble(txt);
   this.anchorageSlip=value;

 }

 public Double getMinCurvatureRadius() {
   return minCurvatureRadius;
 }
 public void setMinCurvatureRadius(String txt){
   Double value = i.toDouble(txt);
   this.minCurvatureRadius=value;

 }

}
