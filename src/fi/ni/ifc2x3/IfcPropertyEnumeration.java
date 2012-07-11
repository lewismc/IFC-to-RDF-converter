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

public class IfcPropertyEnumeration extends Thing 
{
 // The property attributes
 String name;
 List<String> enumerationValues = new IfcList<String>();
IfcUnit unit;


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public List<String> getEnumerationValues() {
   return enumerationValues;
 }
 public void setEnumerationValues(String value){
   this.enumerationValues.add(value);

 }

 public IfcUnit getUnit() {
   return unit;
 }
 public void setUnit(IfcUnit value){
   this.unit=value;

 }

}
