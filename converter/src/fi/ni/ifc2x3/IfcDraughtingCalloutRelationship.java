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

public class IfcDraughtingCalloutRelationship extends Thing 
{
 // The property attributes
 String name;
 String description;
 IfcDraughtingCallout   relatingDraughtingCallout;
 IfcDraughtingCallout   relatedDraughtingCallout;


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 public IfcDraughtingCallout getRelatingDraughtingCallout() {
   return relatingDraughtingCallout;

 }
 public void setRelatingDraughtingCallout(IfcDraughtingCallout value){
   this.relatingDraughtingCallout=value;

 }

 public IfcDraughtingCallout getRelatedDraughtingCallout() {
   return relatedDraughtingCallout;

 }
 public void setRelatedDraughtingCallout(IfcDraughtingCallout value){
   this.relatedDraughtingCallout=value;

 }

}
