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

public class IfcExtendedMaterialProperties extends IfcMaterialProperties 
{
 // The property attributes
 List<IfcProperty> extendedProperties = new IfcSet<IfcProperty>();
 String description;
 String name;


 // Getters and setters of properties

 public List<IfcProperty> getExtendedProperties() {
   return extendedProperties;

 }
 public void setExtendedProperties(IfcProperty value){
   this.extendedProperties.add(value);

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

}
