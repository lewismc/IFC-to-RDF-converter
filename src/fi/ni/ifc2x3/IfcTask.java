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

public class IfcTask extends IfcProcess 
{
 // The property attributes
 String taskId;
 String status;
 String workMethod;
 String isMilestone;
 Long priority;


 // Getters and setters of properties

 public String getTaskId() {
   return taskId;
 }
 public void setTaskId(String value){
   this.taskId=value;

 }

 public String getStatus() {
   return status;
 }
 public void setStatus(String value){
   this.status=value;

 }

 public String getWorkMethod() {
   return workMethod;
 }
 public void setWorkMethod(String value){
   this.workMethod=value;

 }

 public String getIsMilestone() {
   return isMilestone;
 }
 public void setIsMilestone(String value){
   this.isMilestone=value;

 }

 public Long getPriority() {
   return priority;
 }
 public void setPriority(String txt){
   Long value = i.toLong(txt);
   this.priority=value;

 }

}
