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

public class IfcReinforcingMesh extends IfcReinforcingElement 
{
 // The property attributes
 Double meshLength;
 Double meshWidth;
 Double longitudinalBarNominalDiameter;
 Double transverseBarNominalDiameter;
 Double longitudinalBarCrossSectionArea;
 Double transverseBarCrossSectionArea;
 Double longitudinalBarSpacing;
 Double transverseBarSpacing;


 // Getters and setters of properties

 public Double getMeshLength() {
   return meshLength;
 }
 public void setMeshLength(String txt){
   Double value = i.toDouble(txt);
   this.meshLength=value;

 }

 public Double getMeshWidth() {
   return meshWidth;
 }
 public void setMeshWidth(String txt){
   Double value = i.toDouble(txt);
   this.meshWidth=value;

 }

 public Double getLongitudinalBarNominalDiameter() {
   return longitudinalBarNominalDiameter;
 }
 public void setLongitudinalBarNominalDiameter(String txt){
   Double value = i.toDouble(txt);
   this.longitudinalBarNominalDiameter=value;

 }

 public Double getTransverseBarNominalDiameter() {
   return transverseBarNominalDiameter;
 }
 public void setTransverseBarNominalDiameter(String txt){
   Double value = i.toDouble(txt);
   this.transverseBarNominalDiameter=value;

 }

 public Double getLongitudinalBarCrossSectionArea() {
   return longitudinalBarCrossSectionArea;
 }
 public void setLongitudinalBarCrossSectionArea(String txt){
   Double value = i.toDouble(txt);
   this.longitudinalBarCrossSectionArea=value;

 }

 public Double getTransverseBarCrossSectionArea() {
   return transverseBarCrossSectionArea;
 }
 public void setTransverseBarCrossSectionArea(String txt){
   Double value = i.toDouble(txt);
   this.transverseBarCrossSectionArea=value;

 }

 public Double getLongitudinalBarSpacing() {
   return longitudinalBarSpacing;
 }
 public void setLongitudinalBarSpacing(String txt){
   Double value = i.toDouble(txt);
   this.longitudinalBarSpacing=value;

 }

 public Double getTransverseBarSpacing() {
   return transverseBarSpacing;
 }
 public void setTransverseBarSpacing(String txt){
   Double value = i.toDouble(txt);
   this.transverseBarSpacing=value;

 }

}
