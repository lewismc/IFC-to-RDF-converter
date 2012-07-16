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

public class IfcCalendarDate extends Thing implements IfcDateTimeSelect, IfcObjectReferenceSelect
{
 // The property attributes
 Long dayComponent;
 Long monthComponent;
 Long yearComponent;


 // Getters and setters of properties

 public Long getDayComponent() {
   return dayComponent;
 }
 public void setDayComponent(String txt){
   Long value = i.toLong(txt);
   this.dayComponent=value;

 }

 public Long getMonthComponent() {
   return monthComponent;
 }
 public void setMonthComponent(String txt){
   Long value = i.toLong(txt);
   this.monthComponent=value;

 }

 public Long getYearComponent() {
   return yearComponent;
 }
 public void setYearComponent(String txt){
   Long value = i.toLong(txt);
   this.yearComponent=value;

 }

}
