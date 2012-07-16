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

public class IfcOrganizationRelationship extends Thing 
{
 // The property attributes
 String name;
 String description;
 IfcOrganization   relatingOrganization;
 List<IfcOrganization> relatedOrganizations = new IfcSet<IfcOrganization>();


 // Getters and setters of properties

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

 public IfcOrganization getRelatingOrganization() {
   return relatingOrganization;

 }
 public void setRelatingOrganization(IfcOrganization value){
   this.relatingOrganization=value;

 }

 public List<IfcOrganization> getRelatedOrganizations() {
   return relatedOrganizations;

 }
 public void setRelatedOrganizations(IfcOrganization value){
   this.relatedOrganizations.add(value);

 }

}
