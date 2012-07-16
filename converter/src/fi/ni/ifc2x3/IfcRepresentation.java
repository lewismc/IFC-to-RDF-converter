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

public class IfcRepresentation extends Thing implements IfcLayeredItem
{
 // The property attributes
 IfcRepresentationContext   contextOfItems;
 String representationIdentifier;
 String representationType;
 List<IfcRepresentationItem> items = new IfcSet<IfcRepresentationItem>();
 // The inverse attributes

 InverseLinksList<IfcRepresentationMap> representationMap= new InverseLinksList<IfcRepresentationMap>();
 InverseLinksList<IfcPresentationLayerAssignment> layerAssignments= new InverseLinksList<IfcPresentationLayerAssignment>();
 InverseLinksList<IfcProductRepresentation> ofProductRepresentation= new InverseLinksList<IfcProductRepresentation>();


 // Getters and setters of properties

 public IfcRepresentationContext getContextOfItems() {
   return contextOfItems;

 }
 public void setContextOfItems(IfcRepresentationContext value){
   this.contextOfItems=value;

 }

 public String getRepresentationIdentifier() {
   return representationIdentifier;
 }
 public void setRepresentationIdentifier(String value){
   this.representationIdentifier=value;

 }

 public String getRepresentationType() {
   return representationType;
 }
 public void setRepresentationType(String value){
   this.representationType=value;

 }

 public List<IfcRepresentationItem> getItems() {
   return items;

 }
 public void setItems(IfcRepresentationItem value){
   this.items.add(value);

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRepresentationMap> getRepresentationMap() {
   return representationMap;

 }
 public void setRepresentationMap(IfcRepresentationMap value){
   this.representationMap.add(value);

 }

 public InverseLinksList<IfcPresentationLayerAssignment> getLayerAssignments() {
   return layerAssignments;

 }
 public void setLayerAssignments(IfcPresentationLayerAssignment value){
   this.layerAssignments.add(value);

 }

 public InverseLinksList<IfcProductRepresentation> getOfProductRepresentation() {
   return ofProductRepresentation;

 }
 public void setOfProductRepresentation(IfcProductRepresentation value){
   this.ofProductRepresentation.add(value);

 }

}
