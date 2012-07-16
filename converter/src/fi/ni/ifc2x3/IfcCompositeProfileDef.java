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

public class IfcCompositeProfileDef extends IfcProfileDef 
{
 // The property attributes
 List<IfcProfileDef> profiles = new IfcSet<IfcProfileDef>();
 String label;


 // Getters and setters of properties

 public List<IfcProfileDef> getProfiles() {
   return profiles;

 }
 public void setProfiles(IfcProfileDef value){
   this.profiles.add(value);

 }

 public String getLabel() {
   return label;
 }
 public void setLabel(String value){
   this.label=value;

 }

}
