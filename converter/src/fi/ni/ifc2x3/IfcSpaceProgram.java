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

public class IfcSpaceProgram extends IfcControl 
{
 // The property attributes
 String spaceProgramIdentifier;
 Double maxRequiredArea;
 Double minRequiredArea;
 IfcSpatialStructureElement   requestedLocation;
 Double standardRequiredArea;
 // The inverse attributes

 InverseLinksList<IfcRelInteractionRequirements> hasInteractionReqsFrom= new InverseLinksList<IfcRelInteractionRequirements>();
 InverseLinksList<IfcRelInteractionRequirements> hasInteractionReqsTo= new InverseLinksList<IfcRelInteractionRequirements>();


 // Getters and setters of properties

 public String getSpaceProgramIdentifier() {
   return spaceProgramIdentifier;
 }
 public void setSpaceProgramIdentifier(String value){
   this.spaceProgramIdentifier=value;

 }

 public Double getMaxRequiredArea() {
   return maxRequiredArea;
 }
 public void setMaxRequiredArea(String txt){
   Double value = i.toDouble(txt);
   this.maxRequiredArea=value;

 }

 public Double getMinRequiredArea() {
   return minRequiredArea;
 }
 public void setMinRequiredArea(String txt){
   Double value = i.toDouble(txt);
   this.minRequiredArea=value;

 }

 public IfcSpatialStructureElement getRequestedLocation() {
   return requestedLocation;

 }
 public void setRequestedLocation(IfcSpatialStructureElement value){
   this.requestedLocation=value;

 }

 public Double getStandardRequiredArea() {
   return standardRequiredArea;
 }
 public void setStandardRequiredArea(String txt){
   Double value = i.toDouble(txt);
   this.standardRequiredArea=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelInteractionRequirements> getHasInteractionReqsFrom() {
   return hasInteractionReqsFrom;

 }
 public void setHasInteractionReqsFrom(IfcRelInteractionRequirements value){
   this.hasInteractionReqsFrom.add(value);

 }

 public InverseLinksList<IfcRelInteractionRequirements> getHasInteractionReqsTo() {
   return hasInteractionReqsTo;

 }
 public void setHasInteractionReqsTo(IfcRelInteractionRequirements value){
   this.hasInteractionReqsTo.add(value);

 }

}
