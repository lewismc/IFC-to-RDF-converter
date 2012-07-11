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

public class IfcRelAssociatesProfileProperties extends IfcRelAssociates 
{
 // The property attributes
 IfcProfileProperties   relatingProfileProperties;
 IfcShapeAspect   profileSectionLocation;
IfcOrientationSelect profileOrientation;


 // Getters and setters of properties

 public IfcProfileProperties getRelatingProfileProperties() {
   return relatingProfileProperties;

 }
 public void setRelatingProfileProperties(IfcProfileProperties value){
   this.relatingProfileProperties=value;

 }

 public IfcShapeAspect getProfileSectionLocation() {
   return profileSectionLocation;

 }
 public void setProfileSectionLocation(IfcShapeAspect value){
   this.profileSectionLocation=value;

 }

 public IfcOrientationSelect getProfileOrientation() {
   return profileOrientation;
 }
 public void setProfileOrientation(IfcOrientationSelect value){
   this.profileOrientation=value;

 }

}
