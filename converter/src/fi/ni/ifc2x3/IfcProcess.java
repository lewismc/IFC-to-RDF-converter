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

public class IfcProcess extends IfcObject 
{
 // The inverse attributes

 InverseLinksList<IfcRelAssignsToProcess> operatesOn= new InverseLinksList<IfcRelAssignsToProcess>();
 InverseLinksList<IfcRelSequence> isSuccessorFrom= new InverseLinksList<IfcRelSequence>();
 InverseLinksList<IfcRelSequence> isPredecessorTo= new InverseLinksList<IfcRelSequence>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelAssignsToProcess> getOperatesOn() {
   return operatesOn;

 }
 public void setOperatesOn(IfcRelAssignsToProcess value){
   this.operatesOn.add(value);

 }

 public InverseLinksList<IfcRelSequence> getIsSuccessorFrom() {
   return isSuccessorFrom;

 }
 public void setIsSuccessorFrom(IfcRelSequence value){
   this.isSuccessorFrom.add(value);

 }

 public InverseLinksList<IfcRelSequence> getIsPredecessorTo() {
   return isPredecessorTo;

 }
 public void setIsPredecessorTo(IfcRelSequence value){
   this.isPredecessorTo.add(value);

 }

}
