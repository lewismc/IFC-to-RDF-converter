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

public class IfcRelAssigns extends IfcRelationship 
{
 // The property attributes
 List<IfcObjectDefinition> relatedObjects = new IfcSet<IfcObjectDefinition>();
 String relatedObjectsType;


 // Getters and setters of properties

 public List<IfcObjectDefinition> getRelatedObjects() {
   return relatedObjects;

 }
 public void setRelatedObjects(IfcObjectDefinition value){
   this.relatedObjects.add(value);

 }

 public String getRelatedObjectsType() {
   return relatedObjectsType;
 }
 public void setRelatedObjectsType(String value){
   this.relatedObjectsType=value;

 }

}
