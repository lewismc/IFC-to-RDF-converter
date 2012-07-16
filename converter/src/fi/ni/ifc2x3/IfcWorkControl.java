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

public class IfcWorkControl extends IfcControl 
{
 // The property attributes
 String identifier;
IfcDateTimeSelect creationDate;
 List<IfcPerson> creators = new IfcSet<IfcPerson>();
 String purpose;
 Double duration;
 Double totalFloat;
IfcDateTimeSelect startTime;
IfcDateTimeSelect finishTime;
 String workControlType;
 String userDefinedControlType;


 // Getters and setters of properties

 public String getIdentifier() {
   return identifier;
 }
 public void setIdentifier(String value){
   this.identifier=value;

 }

 public IfcDateTimeSelect getCreationDate() {
   return creationDate;
 }
 public void setCreationDate(IfcDateTimeSelect value){
   this.creationDate=value;

 }

 public List<IfcPerson> getCreators() {
   return creators;

 }
 public void setCreators(IfcPerson value){
   this.creators.add(value);

 }

 public String getPurpose() {
   return purpose;
 }
 public void setPurpose(String value){
   this.purpose=value;

 }

 public Double getDuration() {
   return duration;
 }
 public void setDuration(String txt){
   Double value = i.toDouble(txt);
   this.duration=value;

 }

 public Double getTotalFloat() {
   return totalFloat;
 }
 public void setTotalFloat(String txt){
   Double value = i.toDouble(txt);
   this.totalFloat=value;

 }

 public IfcDateTimeSelect getStartTime() {
   return startTime;
 }
 public void setStartTime(IfcDateTimeSelect value){
   this.startTime=value;

 }

 public IfcDateTimeSelect getFinishTime() {
   return finishTime;
 }
 public void setFinishTime(IfcDateTimeSelect value){
   this.finishTime=value;

 }

 public String getWorkControlType() {
   return workControlType;
 }
 public void setWorkControlType(String value){
   this.workControlType=value;

 }

 public String getUserDefinedControlType() {
   return userDefinedControlType;
 }
 public void setUserDefinedControlType(String value){
   this.userDefinedControlType=value;

 }

}
