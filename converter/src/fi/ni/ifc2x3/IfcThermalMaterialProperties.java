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

public class IfcThermalMaterialProperties extends IfcMaterialProperties 
{
 // The property attributes
 Double specificHeatCapacity;
 Double boilingPoint;
 Double freezingPoint;
 Double thermalConductivity;


 // Getters and setters of properties

 public Double getSpecificHeatCapacity() {
   return specificHeatCapacity;
 }
 public void setSpecificHeatCapacity(String txt){
   Double value = i.toDouble(txt);
   this.specificHeatCapacity=value;

 }

 public Double getBoilingPoint() {
   return boilingPoint;
 }
 public void setBoilingPoint(String txt){
   Double value = i.toDouble(txt);
   this.boilingPoint=value;

 }

 public Double getFreezingPoint() {
   return freezingPoint;
 }
 public void setFreezingPoint(String txt){
   Double value = i.toDouble(txt);
   this.freezingPoint=value;

 }

 public Double getThermalConductivity() {
   return thermalConductivity;
 }
 public void setThermalConductivity(String txt){
   Double value = i.toDouble(txt);
   this.thermalConductivity=value;

 }

}
