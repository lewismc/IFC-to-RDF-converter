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

public class IfcRelFlowControlElements extends IfcRelConnects 
{
 // The property attributes
 List<IfcDistributionControlElement> relatedControlElements = new IfcSet<IfcDistributionControlElement>();
 IfcDistributionFlowElement   relatingFlowElement;


 // Getters and setters of properties

 public List<IfcDistributionControlElement> getRelatedControlElements() {
   return relatedControlElements;

 }
 public void setRelatedControlElements(IfcDistributionControlElement value){
   this.relatedControlElements.add(value);

 }

 public IfcDistributionFlowElement getRelatingFlowElement() {
   return relatingFlowElement;

 }
 public void setRelatingFlowElement(IfcDistributionFlowElement value){
   this.relatingFlowElement=value;

 }

}
