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

public class IfcFuelProperties extends IfcMaterialProperties 
{
 // The property attributes
 Double combustionTemperature;
 Double carbonContent;
 Double lowerHeatingValue;
 Double higherHeatingValue;


 // Getters and setters of properties

 public Double getCombustionTemperature() {
   return combustionTemperature;
 }
 public void setCombustionTemperature(String txt){
   Double value = i.toDouble(txt);
   this.combustionTemperature=value;

 }

 public Double getCarbonContent() {
   return carbonContent;
 }
 public void setCarbonContent(String txt){
   Double value = i.toDouble(txt);
   this.carbonContent=value;

 }

 public Double getLowerHeatingValue() {
   return lowerHeatingValue;
 }
 public void setLowerHeatingValue(String txt){
   Double value = i.toDouble(txt);
   this.lowerHeatingValue=value;

 }

 public Double getHigherHeatingValue() {
   return higherHeatingValue;
 }
 public void setHigherHeatingValue(String txt){
   Double value = i.toDouble(txt);
   this.higherHeatingValue=value;

 }

}
