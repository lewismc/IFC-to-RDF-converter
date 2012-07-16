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

public class IfcMechanicalMaterialProperties extends IfcMaterialProperties 
{
 // The property attributes
 Double dynamicViscosity;
 Double youngModulus;
 Double shearModulus;
 Double poissonRatio;
 Double thermalExpansionCoefficient;


 // Getters and setters of properties

 public Double getDynamicViscosity() {
   return dynamicViscosity;
 }
 public void setDynamicViscosity(String txt){
   Double value = i.toDouble(txt);
   this.dynamicViscosity=value;

 }

 public Double getYoungModulus() {
   return youngModulus;
 }
 public void setYoungModulus(String txt){
   Double value = i.toDouble(txt);
   this.youngModulus=value;

 }

 public Double getShearModulus() {
   return shearModulus;
 }
 public void setShearModulus(String txt){
   Double value = i.toDouble(txt);
   this.shearModulus=value;

 }

 public Double getPoissonRatio() {
   return poissonRatio;
 }
 public void setPoissonRatio(String txt){
   Double value = i.toDouble(txt);
   this.poissonRatio=value;

 }

 public Double getThermalExpansionCoefficient() {
   return thermalExpansionCoefficient;
 }
 public void setThermalExpansionCoefficient(String txt){
   Double value = i.toDouble(txt);
   this.thermalExpansionCoefficient=value;

 }

}
