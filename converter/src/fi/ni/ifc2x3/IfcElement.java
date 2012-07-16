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

public class IfcElement extends IfcProduct implements IfcStructuralActivityAssignmentSelect
{
 // The property attributes
 String tag;
 // The inverse attributes

 InverseLinksList<IfcRelConnectsStructuralElement> hasStructuralMember= new InverseLinksList<IfcRelConnectsStructuralElement>();
 InverseLinksList<IfcRelFillsElement> fillsVoids= new InverseLinksList<IfcRelFillsElement>();
 InverseLinksList<IfcRelConnectsElements> connectedTo= new InverseLinksList<IfcRelConnectsElements>();
 InverseLinksList<IfcRelCoversBldgElements> hasCoverings= new InverseLinksList<IfcRelCoversBldgElements>();
 InverseLinksList<IfcRelProjectsElement> hasProjections= new InverseLinksList<IfcRelProjectsElement>();
 InverseLinksList<IfcRelReferencedInSpatialStructure> referencedInStructures= new InverseLinksList<IfcRelReferencedInSpatialStructure>();
 InverseLinksList<IfcRelConnectsPortToElement> hasPorts= new InverseLinksList<IfcRelConnectsPortToElement>();
 InverseLinksList<IfcRelVoidsElement> hasOpenings= new InverseLinksList<IfcRelVoidsElement>();
 InverseLinksList<IfcRelConnectsWithRealizingElements> isConnectionRealization= new InverseLinksList<IfcRelConnectsWithRealizingElements>();
 InverseLinksList<IfcRelSpaceBoundary> providesBoundaries= new InverseLinksList<IfcRelSpaceBoundary>();
 InverseLinksList<IfcRelConnectsElements> connectedFrom= new InverseLinksList<IfcRelConnectsElements>();
 InverseLinksList<IfcRelContainedInSpatialStructure> containedInStructure= new InverseLinksList<IfcRelContainedInSpatialStructure>();


 // Getters and setters of properties

 public String getTag() {
   return tag;
 }
 public void setTag(String value){
   this.tag=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelConnectsStructuralElement> getHasStructuralMember() {
   return hasStructuralMember;

 }
 public void setHasStructuralMember(IfcRelConnectsStructuralElement value){
   this.hasStructuralMember.add(value);

 }

 public InverseLinksList<IfcRelFillsElement> getFillsVoids() {
   return fillsVoids;

 }
 public void setFillsVoids(IfcRelFillsElement value){
   this.fillsVoids.add(value);

 }

 public InverseLinksList<IfcRelConnectsElements> getConnectedTo() {
   return connectedTo;

 }
 public void setConnectedTo(IfcRelConnectsElements value){
   this.connectedTo.add(value);

 }

 public InverseLinksList<IfcRelCoversBldgElements> getHasCoverings() {
   return hasCoverings;

 }
 public void setHasCoverings(IfcRelCoversBldgElements value){
   this.hasCoverings.add(value);

 }

 public InverseLinksList<IfcRelProjectsElement> getHasProjections() {
   return hasProjections;

 }
 public void setHasProjections(IfcRelProjectsElement value){
   this.hasProjections.add(value);

 }

 public InverseLinksList<IfcRelReferencedInSpatialStructure> getReferencedInStructures() {
   return referencedInStructures;

 }
 public void setReferencedInStructures(IfcRelReferencedInSpatialStructure value){
   this.referencedInStructures.add(value);

 }

 public InverseLinksList<IfcRelConnectsPortToElement> getHasPorts() {
   return hasPorts;

 }
 public void setHasPorts(IfcRelConnectsPortToElement value){
   this.hasPorts.add(value);

 }

 public InverseLinksList<IfcRelVoidsElement> getHasOpenings() {
   return hasOpenings;

 }
 public void setHasOpenings(IfcRelVoidsElement value){
   this.hasOpenings.add(value);

 }

 public InverseLinksList<IfcRelConnectsWithRealizingElements> getIsConnectionRealization() {
   return isConnectionRealization;

 }
 public void setIsConnectionRealization(IfcRelConnectsWithRealizingElements value){
   this.isConnectionRealization.add(value);

 }

 public InverseLinksList<IfcRelSpaceBoundary> getProvidesBoundaries() {
   return providesBoundaries;

 }
 public void setProvidesBoundaries(IfcRelSpaceBoundary value){
   this.providesBoundaries.add(value);

 }

 public InverseLinksList<IfcRelConnectsElements> getConnectedFrom() {
   return connectedFrom;

 }
 public void setConnectedFrom(IfcRelConnectsElements value){
   this.connectedFrom.add(value);

 }

 public InverseLinksList<IfcRelContainedInSpatialStructure> getContainedInStructure() {
   return containedInStructure;

 }
 public void setContainedInStructure(IfcRelContainedInSpatialStructure value){
   this.containedInStructure.add(value);

 }

}
