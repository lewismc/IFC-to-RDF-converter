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

public class IfcTimeSeriesSchedule extends IfcControl 
{
 // The property attributes
 List<IfcDateTimeSelect> applicableDates = new IfcList<IfcDateTimeSelect>();
 String timeSeriesScheduleType;
 IfcTimeSeries   timeSeries;


 // Getters and setters of properties

 public List<IfcDateTimeSelect> getApplicableDates() {
   return applicableDates;
 }
 public void setApplicableDates(IfcDateTimeSelect value){
   this.applicableDates.add(value);

 }

 public String getTimeSeriesScheduleType() {
   return timeSeriesScheduleType;
 }
 public void setTimeSeriesScheduleType(String value){
   this.timeSeriesScheduleType=value;

 }

 public IfcTimeSeries getTimeSeries() {
   return timeSeries;

 }
 public void setTimeSeries(IfcTimeSeries value){
   this.timeSeries=value;

 }

}
