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

public class IfcProduct extends IfcObject 
{
 // The property attributes
 IfcObjectPlacement   objectPlacement;
 IfcProductRepresentation   representation;
 // The inverse attributes

 InverseLinksList<IfcRelAssignsToProduct> referencedBy= new InverseLinksList<IfcRelAssignsToProduct>();


 // Getters and setters of properties

 public IfcObjectPlacement getObjectPlacement() {
   return objectPlacement;

 }
 public void setObjectPlacement(IfcObjectPlacement value){
   this.objectPlacement=value;

 }

 public IfcProductRepresentation getRepresentation() {
   return representation;

 }
 public void setRepresentation(IfcProductRepresentation value){
   this.representation=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelAssignsToProduct> getReferencedBy() {
   return referencedBy;

 }
 public void setReferencedBy(IfcRelAssignsToProduct value){
   this.referencedBy.add(value);

 }

}
