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

public class IfcRelAssignsTasks extends IfcRelAssignsToControl 
{
 // The property attributes
 IfcScheduleTimeControl   timeForTask;


 // Getters and setters of properties

 public IfcScheduleTimeControl getTimeForTask() {
   return timeForTask;

 }
 public void setTimeForTask(IfcScheduleTimeControl value){
   this.timeForTask=value;

 }

}
