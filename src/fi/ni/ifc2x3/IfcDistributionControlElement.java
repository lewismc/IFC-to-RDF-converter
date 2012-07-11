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

public class IfcDistributionControlElement extends IfcDistributionElement 
{
 // The property attributes
 String controlElementId;
 // The inverse attributes

 InverseLinksList<IfcRelFlowControlElements> assignedToFlowElement= new InverseLinksList<IfcRelFlowControlElements>();


 // Getters and setters of properties

 public String getControlElementId() {
   return controlElementId;
 }
 public void setControlElementId(String value){
   this.controlElementId=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelFlowControlElements> getAssignedToFlowElement() {
   return assignedToFlowElement;

 }
 public void setAssignedToFlowElement(IfcRelFlowControlElements value){
   this.assignedToFlowElement.add(value);

 }

}
