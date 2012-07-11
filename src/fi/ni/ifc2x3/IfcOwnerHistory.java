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

public class IfcOwnerHistory extends Thing 
{
 // The property attributes
 IfcPersonAndOrganization   owningUser;
 IfcApplication   owningApplication;
 String state;
 String changeAction;
 Date lastModifiedDate;
 IfcPersonAndOrganization   lastModifyingUser;
 IfcApplication   lastModifyingApplication;
 Date creationDate;


 // Getters and setters of properties

 public IfcPersonAndOrganization getOwningUser() {
   return owningUser;

 }
 public void setOwningUser(IfcPersonAndOrganization value){
   this.owningUser=value;

 }

 public IfcApplication getOwningApplication() {
   return owningApplication;

 }
 public void setOwningApplication(IfcApplication value){
   this.owningApplication=value;

 }

 public String getState() {
   return state;
 }
 public void setState(String value){
   this.state=value;

 }

 public String getChangeAction() {
   return changeAction;
 }
 public void setChangeAction(String value){
   this.changeAction=value;

 }

 public Date getLastModifiedDate() {
   return lastModifiedDate;
 }
 public void setLastModifiedDate(String txt){
   Date value = new Date(1000l * i.toLong(txt) );
   this.lastModifiedDate=value;

 }

 public IfcPersonAndOrganization getLastModifyingUser() {
   return lastModifyingUser;

 }
 public void setLastModifyingUser(IfcPersonAndOrganization value){
   this.lastModifyingUser=value;

 }

 public IfcApplication getLastModifyingApplication() {
   return lastModifyingApplication;

 }
 public void setLastModifyingApplication(IfcApplication value){
   this.lastModifyingApplication=value;

 }

 public Date getCreationDate() {
   return creationDate;
 }
 public void setCreationDate(String txt){
   Date value = new Date(1000l * i.toLong(txt) );
   this.creationDate=value;

 }

}
