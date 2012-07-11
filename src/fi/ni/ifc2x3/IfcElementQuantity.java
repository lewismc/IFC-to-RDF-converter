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

public class IfcElementQuantity extends IfcPropertySetDefinition 
{
 // The property attributes
 String methodOfMeasurement;
 List<IfcPhysicalQuantity> quantities = new IfcSet<IfcPhysicalQuantity>();


 // Getters and setters of properties

 public String getMethodOfMeasurement() {
   return methodOfMeasurement;
 }
 public void setMethodOfMeasurement(String value){
   this.methodOfMeasurement=value;

 }

 public List<IfcPhysicalQuantity> getQuantities() {
   return quantities;

 }
 public void setQuantities(IfcPhysicalQuantity value){
   this.quantities.add(value);

 }

}
