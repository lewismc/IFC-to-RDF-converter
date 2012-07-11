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

public class IfcObjectPlacement extends Thing 
{
 // The inverse attributes

 InverseLinksList<IfcProduct> placesObject= new InverseLinksList<IfcProduct>();
 InverseLinksList<IfcLocalPlacement> referencedByPlacements= new InverseLinksList<IfcLocalPlacement>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcProduct> getPlacesObject() {
   return placesObject;

 }
 public void setPlacesObject(IfcProduct value){
   this.placesObject.add(value);

 }

 public InverseLinksList<IfcLocalPlacement> getReferencedByPlacements() {
   return referencedByPlacements;

 }
 public void setReferencedByPlacements(IfcLocalPlacement value){
   this.referencedByPlacements.add(value);

 }

}
