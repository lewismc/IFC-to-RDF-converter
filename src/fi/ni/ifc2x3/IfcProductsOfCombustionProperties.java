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

public class IfcProductsOfCombustionProperties extends IfcMaterialProperties 
{
 // The property attributes
 Double specificHeatCapacity;
 Double n20Content;
 Double cOContent;
 Double cO2Content;


 // Getters and setters of properties

 public Double getSpecificHeatCapacity() {
   return specificHeatCapacity;
 }
 public void setSpecificHeatCapacity(String txt){
   Double value = i.toDouble(txt);
   this.specificHeatCapacity=value;

 }

 public Double getN20Content() {
   return n20Content;
 }
 public void setN20Content(String txt){
   Double value = i.toDouble(txt);
   this.n20Content=value;

 }

 public Double getCOContent() {
   return cOContent;
 }
 public void setCOContent(String txt){
   Double value = i.toDouble(txt);
   this.cOContent=value;

 }

 public Double getCO2Content() {
   return cO2Content;
 }
 public void setCO2Content(String txt){
   Double value = i.toDouble(txt);
   this.cO2Content=value;

 }

}
