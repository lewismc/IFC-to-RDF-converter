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

public class IfcSpatialStructureElement extends IfcProduct 
{
 // The property attributes
 String longName;
 String compositionType;
 // The inverse attributes

 InverseLinksList<IfcRelReferencedInSpatialStructure> referencesElements= new InverseLinksList<IfcRelReferencedInSpatialStructure>();
 InverseLinksList<IfcRelServicesBuildings> servicedBySystems= new InverseLinksList<IfcRelServicesBuildings>();
 InverseLinksList<IfcRelContainedInSpatialStructure> containsElements= new InverseLinksList<IfcRelContainedInSpatialStructure>();


 // Getters and setters of properties

 public String getLongName() {
   return longName;
 }
 public void setLongName(String value){
   this.longName=value;

 }

 public String getCompositionType() {
   return compositionType;
 }
 public void setCompositionType(String value){
   this.compositionType=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelReferencedInSpatialStructure> getReferencesElements() {
   return referencesElements;

 }
 public void setReferencesElements(IfcRelReferencedInSpatialStructure value){
   this.referencesElements.add(value);

 }

 public InverseLinksList<IfcRelServicesBuildings> getServicedBySystems() {
   return servicedBySystems;

 }
 public void setServicedBySystems(IfcRelServicesBuildings value){
   this.servicedBySystems.add(value);

 }

 public InverseLinksList<IfcRelContainedInSpatialStructure> getContainsElements() {
   return containsElements;

 }
 public void setContainsElements(IfcRelContainedInSpatialStructure value){
   this.containsElements.add(value);

 }

}
