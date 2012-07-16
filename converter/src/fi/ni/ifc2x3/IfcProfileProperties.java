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

public class IfcProfileProperties extends Thing 
{
 // The property attributes
 String profileName;
 IfcProfileDef   profileDefinition;


 // Getters and setters of properties

 public String getProfileName() {
   return profileName;
 }
 public void setProfileName(String value){
   this.profileName=value;

 }

 public IfcProfileDef getProfileDefinition() {
   return profileDefinition;

 }
 public void setProfileDefinition(IfcProfileDef value){
   this.profileDefinition=value;

 }

}
