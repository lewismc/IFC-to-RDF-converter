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

public class IfcSoundValue extends IfcPropertySetDefinition 
{
 // The property attributes
 IfcTimeSeries   soundLevelTimeSeries;
 Double frequency;
 String soundLevelSingleValue;


 // Getters and setters of properties

 public IfcTimeSeries getSoundLevelTimeSeries() {
   return soundLevelTimeSeries;

 }
 public void setSoundLevelTimeSeries(IfcTimeSeries value){
   this.soundLevelTimeSeries=value;

 }

 public Double getFrequency() {
   return frequency;
 }
 public void setFrequency(String txt){
   Double value = i.toDouble(txt);
   this.frequency=value;

 }

 public String getSoundLevelSingleValue() {
   return soundLevelSingleValue;
 }
 public void setSoundLevelSingleValue(String value){
   this.soundLevelSingleValue=value;

 }

}
