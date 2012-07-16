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

public class IfcDistributionFlowElement extends IfcDistributionElement 
{
 // The inverse attributes

 InverseLinksList<IfcRelFlowControlElements> hasControlElements= new InverseLinksList<IfcRelFlowControlElements>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelFlowControlElements> getHasControlElements() {
   return hasControlElements;

 }
 public void setHasControlElements(IfcRelFlowControlElements value){
   this.hasControlElements.add(value);

 }

}
