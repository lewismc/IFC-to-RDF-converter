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

public class IfcGeneralProfileProperties extends IfcProfileProperties 
{
 // The property attributes
 Double physicalWeight;
 Double perimeter;
 Double minimumPlateThickness;
 Double maximumPlateThickness;
 Double crossSectionArea;


 // Getters and setters of properties

 public Double getPhysicalWeight() {
   return physicalWeight;
 }
 public void setPhysicalWeight(String txt){
   Double value = i.toDouble(txt);
   this.physicalWeight=value;

 }

 public Double getPerimeter() {
   return perimeter;
 }
 public void setPerimeter(String txt){
   Double value = i.toDouble(txt);
   this.perimeter=value;

 }

 public Double getMinimumPlateThickness() {
   return minimumPlateThickness;
 }
 public void setMinimumPlateThickness(String txt){
   Double value = i.toDouble(txt);
   this.minimumPlateThickness=value;

 }

 public Double getMaximumPlateThickness() {
   return maximumPlateThickness;
 }
 public void setMaximumPlateThickness(String txt){
   Double value = i.toDouble(txt);
   this.maximumPlateThickness=value;

 }

 public Double getCrossSectionArea() {
   return crossSectionArea;
 }
 public void setCrossSectionArea(String txt){
   Double value = i.toDouble(txt);
   this.crossSectionArea=value;

 }

}
