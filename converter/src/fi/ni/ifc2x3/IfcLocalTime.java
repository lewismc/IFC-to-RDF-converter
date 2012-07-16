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

public class IfcLocalTime extends Thing implements IfcDateTimeSelect, IfcObjectReferenceSelect
{
 // The property attributes
 Long hourComponent;
 Long minuteComponent;
 Double secondComponent;
 IfcCoordinatedUniversalTimeOffset   zone;
 Long daylightSavingOffset;


 // Getters and setters of properties

 public Long getHourComponent() {
   return hourComponent;
 }
 public void setHourComponent(String txt){
   Long value = i.toLong(txt);
   this.hourComponent=value;

 }

 public Long getMinuteComponent() {
   return minuteComponent;
 }
 public void setMinuteComponent(String txt){
   Long value = i.toLong(txt);
   this.minuteComponent=value;

 }

 public Double getSecondComponent() {
   return secondComponent;
 }
 public void setSecondComponent(String txt){
   Double value = i.toDouble(txt);
   this.secondComponent=value;

 }

 public IfcCoordinatedUniversalTimeOffset getZone() {
   return zone;

 }
 public void setZone(IfcCoordinatedUniversalTimeOffset value){
   this.zone=value;

 }

 public Long getDaylightSavingOffset() {
   return daylightSavingOffset;
 }
 public void setDaylightSavingOffset(String txt){
   Long value = i.toLong(txt);
   this.daylightSavingOffset=value;

 }

}
