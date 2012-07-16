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

public class IfcConstructionMaterialResource extends IfcConstructionResource 
{
 // The property attributes
 List<IfcActorSelect> suppliers = new IfcSet<IfcActorSelect>();
 Double usageRatio;


 // Getters and setters of properties

 public List<IfcActorSelect> getSuppliers() {
   return suppliers;
 }
 public void setSuppliers(IfcActorSelect value){
   this.suppliers.add(value);

 }

 public Double getUsageRatio() {
   return usageRatio;
 }
 public void setUsageRatio(String txt){
   Double value = i.toDouble(txt);
   this.usageRatio=value;

 }

}
