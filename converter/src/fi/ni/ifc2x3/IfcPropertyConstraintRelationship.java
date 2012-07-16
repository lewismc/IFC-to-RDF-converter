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

public class IfcPropertyConstraintRelationship extends Thing 
{
 // The property attributes
 IfcConstraint   relatingConstraint;
 List<IfcProperty> relatedProperties = new IfcSet<IfcProperty>();
 String name;
 String description;


 // Getters and setters of properties

 public IfcConstraint getRelatingConstraint() {
   return relatingConstraint;

 }
 public void setRelatingConstraint(IfcConstraint value){
   this.relatingConstraint=value;

 }

 public List<IfcProperty> getRelatedProperties() {
   return relatedProperties;

 }
 public void setRelatedProperties(IfcProperty value){
   this.relatedProperties.add(value);

 }

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

}
