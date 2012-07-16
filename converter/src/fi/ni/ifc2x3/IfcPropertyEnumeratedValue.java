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

public class IfcPropertyEnumeratedValue extends IfcSimpleProperty 
{
 // The property attributes
 List<String> enumerationValues = new IfcList<String>();
 IfcPropertyEnumeration   enumerationReference;


 // Getters and setters of properties

 public List<String> getEnumerationValues() {
   return enumerationValues;
 }
 public void setEnumerationValues(String value){
   this.enumerationValues.add(value);

 }

 public IfcPropertyEnumeration getEnumerationReference() {
   return enumerationReference;

 }
 public void setEnumerationReference(IfcPropertyEnumeration value){
   this.enumerationReference=value;

 }

}
