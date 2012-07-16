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

public class IfcMaterial extends Thing implements IfcMaterialSelect, IfcObjectReferenceSelect
{
 // The property attributes
 String name;
 // The inverse attributes

 InverseLinksList<IfcMaterialDefinitionRepresentation> hasRepresentation= new InverseLinksList<IfcMaterialDefinitionRepresentation>();
 InverseLinksList<IfcMaterialClassificationRelationship> classifiedAs= new InverseLinksList<IfcMaterialClassificationRelationship>();


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcMaterialDefinitionRepresentation> getHasRepresentation() {
   return hasRepresentation;

 }
 public void setHasRepresentation(IfcMaterialDefinitionRepresentation value){
   this.hasRepresentation.add(value);

 }

 public InverseLinksList<IfcMaterialClassificationRelationship> getClassifiedAs() {
   return classifiedAs;

 }
 public void setClassifiedAs(IfcMaterialClassificationRelationship value){
   this.classifiedAs.add(value);

 }

}
