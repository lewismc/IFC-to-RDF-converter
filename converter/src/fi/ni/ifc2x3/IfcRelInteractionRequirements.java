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

public class IfcRelInteractionRequirements extends IfcRelConnects 
{
 // The property attributes
 String dailyInteraction;
 Double importanceRating;
 IfcSpatialStructureElement   locationOfInteraction;
 IfcSpaceProgram   relatedSpaceProgram;
 IfcSpaceProgram   relatingSpaceProgram;


 // Getters and setters of properties

 public String getDailyInteraction() {
   return dailyInteraction;
 }
 public void setDailyInteraction(String value){
   this.dailyInteraction=value;

 }

 public Double getImportanceRating() {
   return importanceRating;
 }
 public void setImportanceRating(String txt){
   Double value = i.toDouble(txt);
   this.importanceRating=value;

 }

 public IfcSpatialStructureElement getLocationOfInteraction() {
   return locationOfInteraction;

 }
 public void setLocationOfInteraction(IfcSpatialStructureElement value){
   this.locationOfInteraction=value;

 }

 public IfcSpaceProgram getRelatedSpaceProgram() {
   return relatedSpaceProgram;

 }
 public void setRelatedSpaceProgram(IfcSpaceProgram value){
   this.relatedSpaceProgram=value;

 }

 public IfcSpaceProgram getRelatingSpaceProgram() {
   return relatingSpaceProgram;

 }
 public void setRelatingSpaceProgram(IfcSpaceProgram value){
   this.relatingSpaceProgram=value;

 }

}
