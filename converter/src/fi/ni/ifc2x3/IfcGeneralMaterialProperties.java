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

public class IfcGeneralMaterialProperties extends IfcMaterialProperties 
{
 // The property attributes
 Double molecularWeight;
 Double porosity;
 Double massDensity;


 // Getters and setters of properties

 public Double getMolecularWeight() {
   return molecularWeight;
 }
 public void setMolecularWeight(String txt){
   Double value = i.toDouble(txt);
   this.molecularWeight=value;

 }

 public Double getPorosity() {
   return porosity;
 }
 public void setPorosity(String txt){
   Double value = i.toDouble(txt);
   this.porosity=value;

 }

 public Double getMassDensity() {
   return massDensity;
 }
 public void setMassDensity(String txt){
   Double value = i.toDouble(txt);
   this.massDensity=value;

 }

}
