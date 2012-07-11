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

public class IfcSectionProperties extends Thing 
{
 // The property attributes
 String sectionType;
 IfcProfileDef   startProfile;
 IfcProfileDef   endProfile;


 // Getters and setters of properties

 public String getSectionType() {
   return sectionType;
 }
 public void setSectionType(String value){
   this.sectionType=value;

 }

 public IfcProfileDef getStartProfile() {
   return startProfile;

 }
 public void setStartProfile(IfcProfileDef value){
   this.startProfile=value;

 }

 public IfcProfileDef getEndProfile() {
   return endProfile;

 }
 public void setEndProfile(IfcProfileDef value){
   this.endProfile=value;

 }

}
