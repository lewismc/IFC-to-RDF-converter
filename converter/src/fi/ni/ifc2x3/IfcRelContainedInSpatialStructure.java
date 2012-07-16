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

public class IfcRelContainedInSpatialStructure extends IfcRelConnects 
{
 // The property attributes
 List<IfcProduct> relatedElements = new IfcSet<IfcProduct>();
 IfcSpatialStructureElement   relatingStructure;


 // Getters and setters of properties

 public List<IfcProduct> getRelatedElements() {
   return relatedElements;

 }
 public void setRelatedElements(IfcProduct value){
   this.relatedElements.add(value);

 }

 public IfcSpatialStructureElement getRelatingStructure() {
   return relatingStructure;

 }
 public void setRelatingStructure(IfcSpatialStructureElement value){
   this.relatingStructure=value;

 }

}
