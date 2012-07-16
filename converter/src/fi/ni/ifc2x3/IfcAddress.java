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

public class IfcAddress extends Thing implements IfcObjectReferenceSelect
{
 // The property attributes
 String purpose;
 String description;
 String userDefinedPurpose;
 // The inverse attributes

 InverseLinksList<IfcPerson> ofPerson= new InverseLinksList<IfcPerson>();
 InverseLinksList<IfcOrganization> ofOrganization= new InverseLinksList<IfcOrganization>();


 // Getters and setters of properties

 public String getPurpose() {
   return purpose;
 }
 public void setPurpose(String value){
   this.purpose=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 public String getUserDefinedPurpose() {
   return userDefinedPurpose;
 }
 public void setUserDefinedPurpose(String value){
   this.userDefinedPurpose=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcPerson> getOfPerson() {
   return ofPerson;

 }
 public void setOfPerson(IfcPerson value){
   this.ofPerson.add(value);

 }

 public InverseLinksList<IfcOrganization> getOfOrganization() {
   return ofOrganization;

 }
 public void setOfOrganization(IfcOrganization value){
   this.ofOrganization.add(value);

 }

}
