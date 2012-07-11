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

public class IfcRelProjectsElement extends IfcRelConnects 
{
 // The property attributes
 IfcElement   relatingElement;
 IfcFeatureElementAddition   relatedFeatureElement;


 // Getters and setters of properties

 public IfcElement getRelatingElement() {
   return relatingElement;

 }
 public void setRelatingElement(IfcElement value){
   this.relatingElement=value;

 }

 public IfcFeatureElementAddition getRelatedFeatureElement() {
   return relatedFeatureElement;

 }
 public void setRelatedFeatureElement(IfcFeatureElementAddition value){
   this.relatedFeatureElement=value;

 }

}
