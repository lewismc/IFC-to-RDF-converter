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

public class IfcCostSchedule extends IfcControl 
{
 // The property attributes
IfcActorSelect submittedBy;
IfcActorSelect preparedBy;
IfcDateTimeSelect submittedOn;
 String status;
 List<IfcActorSelect> targetUsers = new IfcSet<IfcActorSelect>();
IfcDateTimeSelect updateDate;
 String iD;
 String predefinedType;


 // Getters and setters of properties

 public IfcActorSelect getSubmittedBy() {
   return submittedBy;
 }
 public void setSubmittedBy(IfcActorSelect value){
   this.submittedBy=value;

 }

 public IfcActorSelect getPreparedBy() {
   return preparedBy;
 }
 public void setPreparedBy(IfcActorSelect value){
   this.preparedBy=value;

 }

 public IfcDateTimeSelect getSubmittedOn() {
   return submittedOn;
 }
 public void setSubmittedOn(IfcDateTimeSelect value){
   this.submittedOn=value;

 }

 public String getStatus() {
   return status;
 }
 public void setStatus(String value){
   this.status=value;

 }

 public List<IfcActorSelect> getTargetUsers() {
   return targetUsers;
 }
 public void setTargetUsers(IfcActorSelect value){
   this.targetUsers.add(value);

 }

 public IfcDateTimeSelect getUpdateDate() {
   return updateDate;
 }
 public void setUpdateDate(IfcDateTimeSelect value){
   this.updateDate=value;

 }

 public String getID() {
   return iD;
 }
 public void setID(String value){
   this.iD=value;

 }

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

}
