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

public class IfcRelFillsElement extends IfcRelConnects 
{
 // The property attributes
 IfcOpeningElement   relatingOpeningElement;
 IfcElement   relatedBuildingElement;


 // Getters and setters of properties

 public IfcOpeningElement getRelatingOpeningElement() {
   return relatingOpeningElement;

 }
 public void setRelatingOpeningElement(IfcOpeningElement value){
   this.relatingOpeningElement=value;

 }

 public IfcElement getRelatedBuildingElement() {
   return relatedBuildingElement;

 }
 public void setRelatedBuildingElement(IfcElement value){
   this.relatedBuildingElement=value;

 }

}
