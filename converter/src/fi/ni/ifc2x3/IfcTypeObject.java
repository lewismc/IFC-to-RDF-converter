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

public class IfcTypeObject extends IfcObjectDefinition 
{
 // The property attributes
 String applicableOccurrence;
 List<IfcPropertySetDefinition> hasPropertySets = new IfcSet<IfcPropertySetDefinition>();
 // The inverse attributes

 InverseLinksList<IfcRelDefinesByType> objectTypeOf= new InverseLinksList<IfcRelDefinesByType>();


 // Getters and setters of properties

 public String getApplicableOccurrence() {
   return applicableOccurrence;
 }
 public void setApplicableOccurrence(String value){
   this.applicableOccurrence=value;

 }

 public List<IfcPropertySetDefinition> getHasPropertySets() {
   return hasPropertySets;

 }
 public void setHasPropertySets(IfcPropertySetDefinition value){
   this.hasPropertySets.add(value);

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelDefinesByType> getObjectTypeOf() {
   return objectTypeOf;

 }
 public void setObjectTypeOf(IfcRelDefinesByType value){
   this.objectTypeOf.add(value);

 }

}
