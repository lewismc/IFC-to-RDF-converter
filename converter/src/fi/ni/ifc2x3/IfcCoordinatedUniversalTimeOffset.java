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

public class IfcCoordinatedUniversalTimeOffset extends Thing 
{
 // The property attributes
 Long hourOffset;
 Long minuteOffset;
 String sense;


 // Getters and setters of properties

 public Long getHourOffset() {
   return hourOffset;
 }
 public void setHourOffset(String txt){
   Long value = i.toLong(txt);
   this.hourOffset=value;

 }

 public Long getMinuteOffset() {
   return minuteOffset;
 }
 public void setMinuteOffset(String txt){
   Long value = i.toLong(txt);
   this.minuteOffset=value;

 }

 public String getSense() {
   return sense;
 }
 public void setSense(String value){
   this.sense=value;

 }

}
