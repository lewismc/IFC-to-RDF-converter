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

public class IfcSoundProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 String isAttenuating;
 String soundScale;
 List<IfcSoundValue> soundValues = new IfcList<IfcSoundValue>();


 // Getters and setters of properties

 public String getIsAttenuating() {
   return isAttenuating;
 }
 public void setIsAttenuating(String value){
   this.isAttenuating=value;

 }

 public String getSoundScale() {
   return soundScale;
 }
 public void setSoundScale(String value){
   this.soundScale=value;

 }

 public List<IfcSoundValue> getSoundValues() {
   return soundValues;

 }
 public void setSoundValues(IfcSoundValue value){
   this.soundValues.add(value);

 }

}
