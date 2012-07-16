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

public class IfcConnectionPortGeometry extends IfcConnectionGeometry 
{
 // The property attributes
IfcAxis2Placement locationAtRelatingElement;
IfcAxis2Placement locationAtRelatedElement;
 IfcProfileDef   profileOfPort;


 // Getters and setters of properties

 public IfcAxis2Placement getLocationAtRelatingElement() {
   return locationAtRelatingElement;
 }
 public void setLocationAtRelatingElement(IfcAxis2Placement value){
   this.locationAtRelatingElement=value;

 }

 public IfcAxis2Placement getLocationAtRelatedElement() {
   return locationAtRelatedElement;
 }
 public void setLocationAtRelatedElement(IfcAxis2Placement value){
   this.locationAtRelatedElement=value;

 }

 public IfcProfileDef getProfileOfPort() {
   return profileOfPort;

 }
 public void setProfileOfPort(IfcProfileDef value){
   this.profileOfPort=value;

 }

}
