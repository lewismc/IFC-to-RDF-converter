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

public class IfcOrganization extends Thing implements IfcActorSelect, IfcObjectReferenceSelect
{
 // The property attributes
 String id;
 String name;
 String description;
 List<IfcActorRole> roles = new IfcList<IfcActorRole>();
 List<IfcAddress> addresses = new IfcList<IfcAddress>();
 // The inverse attributes

 InverseLinksList<IfcOrganizationRelationship> isRelatedBy= new InverseLinksList<IfcOrganizationRelationship>();
 InverseLinksList<IfcOrganizationRelationship> relates= new InverseLinksList<IfcOrganizationRelationship>();
 InverseLinksList<IfcPersonAndOrganization> engages= new InverseLinksList<IfcPersonAndOrganization>();


 // Getters and setters of properties

 public String getId() {
   return id;
 }
 public void setId(String value){
   this.id=value;

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

 public List<IfcActorRole> getRoles() {
   return roles;

 }
 public void setRoles(IfcActorRole value){
   this.roles.add(value);

 }

 public List<IfcAddress> getAddresses() {
   return addresses;

 }
 public void setAddresses(IfcAddress value){
   this.addresses.add(value);

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcOrganizationRelationship> getIsRelatedBy() {
   return isRelatedBy;

 }
 public void setIsRelatedBy(IfcOrganizationRelationship value){
   this.isRelatedBy.add(value);

 }

 public InverseLinksList<IfcOrganizationRelationship> getRelates() {
   return relates;

 }
 public void setRelates(IfcOrganizationRelationship value){
   this.relates.add(value);

 }

 public InverseLinksList<IfcPersonAndOrganization> getEngages() {
   return engages;

 }
 public void setEngages(IfcPersonAndOrganization value){
   this.engages.add(value);

 }

}
