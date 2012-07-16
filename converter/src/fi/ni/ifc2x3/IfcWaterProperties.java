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

public class IfcWaterProperties extends IfcMaterialProperties 
{
 // The property attributes
 String isPotable;
 Double hardness;
 Double alkalinityConcentration;
 Double acidityConcentration;
 Double impuritiesContent;
 Double pHLevel;
 Double dissolvedSolidsContent;


 // Getters and setters of properties

 public String getIsPotable() {
   return isPotable;
 }
 public void setIsPotable(String value){
   this.isPotable=value;

 }

 public Double getHardness() {
   return hardness;
 }
 public void setHardness(String txt){
   Double value = i.toDouble(txt);
   this.hardness=value;

 }

 public Double getAlkalinityConcentration() {
   return alkalinityConcentration;
 }
 public void setAlkalinityConcentration(String txt){
   Double value = i.toDouble(txt);
   this.alkalinityConcentration=value;

 }

 public Double getAcidityConcentration() {
   return acidityConcentration;
 }
 public void setAcidityConcentration(String txt){
   Double value = i.toDouble(txt);
   this.acidityConcentration=value;

 }

 public Double getImpuritiesContent() {
   return impuritiesContent;
 }
 public void setImpuritiesContent(String txt){
   Double value = i.toDouble(txt);
   this.impuritiesContent=value;

 }

 public Double getPHLevel() {
   return pHLevel;
 }
 public void setPHLevel(String txt){
   Double value = i.toDouble(txt);
   this.pHLevel=value;

 }

 public Double getDissolvedSolidsContent() {
   return dissolvedSolidsContent;
 }
 public void setDissolvedSolidsContent(String txt){
   Double value = i.toDouble(txt);
   this.dissolvedSolidsContent=value;

 }

}
