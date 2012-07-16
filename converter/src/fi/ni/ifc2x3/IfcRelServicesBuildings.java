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

public class IfcRelServicesBuildings extends IfcRelConnects 
{
 // The property attributes
 IfcSystem   relatingSystem;
 List<IfcSpatialStructureElement> relatedBuildings = new IfcSet<IfcSpatialStructureElement>();


 // Getters and setters of properties

 public IfcSystem getRelatingSystem() {
   return relatingSystem;

 }
 public void setRelatingSystem(IfcSystem value){
   this.relatingSystem=value;

 }

 public List<IfcSpatialStructureElement> getRelatedBuildings() {
   return relatedBuildings;

 }
 public void setRelatedBuildings(IfcSpatialStructureElement value){
   this.relatedBuildings.add(value);

 }

}
