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

public class IfcRelVoidsElement extends IfcRelConnects 
{
 // The property attributes
 IfcElement   relatingBuildingElement;
 IfcFeatureElementSubtraction   relatedOpeningElement;


 // Getters and setters of properties

 public IfcElement getRelatingBuildingElement() {
   return relatingBuildingElement;

 }
 public void setRelatingBuildingElement(IfcElement value){
   this.relatingBuildingElement=value;

 }

 public IfcFeatureElementSubtraction getRelatedOpeningElement() {
   return relatedOpeningElement;

 }
 public void setRelatedOpeningElement(IfcFeatureElementSubtraction value){
   this.relatedOpeningElement=value;

 }

}
