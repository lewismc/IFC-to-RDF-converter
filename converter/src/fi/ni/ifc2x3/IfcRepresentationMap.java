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

public class IfcRepresentationMap extends Thing 
{
 // The property attributes
IfcAxis2Placement mappingOrigin;
 IfcRepresentation   mappedRepresentation;
 // The inverse attributes

 InverseLinksList<IfcMappedItem> mapUsage= new InverseLinksList<IfcMappedItem>();


 // Getters and setters of properties

 public IfcAxis2Placement getMappingOrigin() {
   return mappingOrigin;
 }
 public void setMappingOrigin(IfcAxis2Placement value){
   this.mappingOrigin=value;

 }

 public IfcRepresentation getMappedRepresentation() {
   return mappedRepresentation;

 }
 public void setMappedRepresentation(IfcRepresentation value){
   this.mappedRepresentation=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcMappedItem> getMapUsage() {
   return mapUsage;

 }
 public void setMapUsage(IfcMappedItem value){
   this.mapUsage.add(value);

 }

}
