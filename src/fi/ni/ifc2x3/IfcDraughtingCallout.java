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

public class IfcDraughtingCallout extends IfcGeometricRepresentationItem 
{
 // The property attributes
 List<IfcDraughtingCalloutElement> contents = new IfcSet<IfcDraughtingCalloutElement>();
 // The inverse attributes

 InverseLinksList<IfcDraughtingCalloutRelationship> isRelatedFromCallout= new InverseLinksList<IfcDraughtingCalloutRelationship>();
 InverseLinksList<IfcDraughtingCalloutRelationship> isRelatedToCallout= new InverseLinksList<IfcDraughtingCalloutRelationship>();


 // Getters and setters of properties

 public List<IfcDraughtingCalloutElement> getContents() {
   return contents;
 }
 public void setContents(IfcDraughtingCalloutElement value){
   this.contents.add(value);

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcDraughtingCalloutRelationship> getIsRelatedFromCallout() {
   return isRelatedFromCallout;

 }
 public void setIsRelatedFromCallout(IfcDraughtingCalloutRelationship value){
   this.isRelatedFromCallout.add(value);

 }

 public InverseLinksList<IfcDraughtingCalloutRelationship> getIsRelatedToCallout() {
   return isRelatedToCallout;

 }
 public void setIsRelatedToCallout(IfcDraughtingCalloutRelationship value){
   this.isRelatedToCallout.add(value);

 }

}
