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

public class IfcPersonAndOrganization extends Thing implements IfcActorSelect, IfcObjectReferenceSelect
{
 // The property attributes
 IfcPerson   thePerson;
 IfcOrganization   theOrganization;
 List<IfcActorRole> roles = new IfcList<IfcActorRole>();


 // Getters and setters of properties

 public IfcPerson getThePerson() {
   return thePerson;

 }
 public void setThePerson(IfcPerson value){
   this.thePerson=value;

 }

 public IfcOrganization getTheOrganization() {
   return theOrganization;

 }
 public void setTheOrganization(IfcOrganization value){
   this.theOrganization=value;

 }

 public List<IfcActorRole> getRoles() {
   return roles;

 }
 public void setRoles(IfcActorRole value){
   this.roles.add(value);

 }

}
