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

public class IfcHygroscopicMaterialProperties extends IfcMaterialProperties 
{
 // The property attributes
 Double upperVaporResistanceFactor;
 Double lowerVaporResistanceFactor;
 Double isothermalMoistureCapacity;
 Double vaporPermeability;
 Double moistureDiffusivity;


 // Getters and setters of properties

 public Double getUpperVaporResistanceFactor() {
   return upperVaporResistanceFactor;
 }
 public void setUpperVaporResistanceFactor(String txt){
   Double value = i.toDouble(txt);
   this.upperVaporResistanceFactor=value;

 }

 public Double getLowerVaporResistanceFactor() {
   return lowerVaporResistanceFactor;
 }
 public void setLowerVaporResistanceFactor(String txt){
   Double value = i.toDouble(txt);
   this.lowerVaporResistanceFactor=value;

 }

 public Double getIsothermalMoistureCapacity() {
   return isothermalMoistureCapacity;
 }
 public void setIsothermalMoistureCapacity(String txt){
   Double value = i.toDouble(txt);
   this.isothermalMoistureCapacity=value;

 }

 public Double getVaporPermeability() {
   return vaporPermeability;
 }
 public void setVaporPermeability(String txt){
   Double value = i.toDouble(txt);
   this.vaporPermeability=value;

 }

 public Double getMoistureDiffusivity() {
   return moistureDiffusivity;
 }
 public void setMoistureDiffusivity(String txt){
   Double value = i.toDouble(txt);
   this.moistureDiffusivity=value;

 }

}
