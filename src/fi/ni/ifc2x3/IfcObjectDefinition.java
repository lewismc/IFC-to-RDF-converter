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

public class IfcObjectDefinition extends IfcRoot 
{
 // The inverse attributes

 InverseLinksList<IfcRelAssigns> hasAssignments= new InverseLinksList<IfcRelAssigns>();
 InverseLinksList<IfcRelDecomposes> isDecomposedBy= new InverseLinksList<IfcRelDecomposes>();
 InverseLinksList<IfcRelDecomposes> decomposes= new InverseLinksList<IfcRelDecomposes>();
 InverseLinksList<IfcRelAssociates> hasAssociations= new InverseLinksList<IfcRelAssociates>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelAssigns> getHasAssignments() {
   return hasAssignments;

 }
 public void setHasAssignments(IfcRelAssigns value){
   this.hasAssignments.add(value);

 }

 public InverseLinksList<IfcRelDecomposes> getIsDecomposedBy() {
   return isDecomposedBy;

 }
 public void setIsDecomposedBy(IfcRelDecomposes value){
   this.isDecomposedBy.add(value);

 }

 public InverseLinksList<IfcRelDecomposes> getDecomposes() {
   return decomposes;

 }
 public void setDecomposes(IfcRelDecomposes value){
   this.decomposes.add(value);

 }

 public InverseLinksList<IfcRelAssociates> getHasAssociations() {
   return hasAssociations;

 }
 public void setHasAssociations(IfcRelAssociates value){
   this.hasAssociations.add(value);

 }

}
