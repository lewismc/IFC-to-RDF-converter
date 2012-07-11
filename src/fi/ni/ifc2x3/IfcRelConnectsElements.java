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

public class IfcRelConnectsElements extends IfcRelConnects 
{
 // The property attributes
 IfcConnectionGeometry   connectionGeometry;
 IfcElement   relatingElement;
 IfcElement   relatedElement;


 // Getters and setters of properties

 public IfcConnectionGeometry getConnectionGeometry() {
   return connectionGeometry;

 }
 public void setConnectionGeometry(IfcConnectionGeometry value){
   this.connectionGeometry=value;

 }

 public IfcElement getRelatingElement() {
   return relatingElement;

 }
 public void setRelatingElement(IfcElement value){
   this.relatingElement=value;

 }

 public IfcElement getRelatedElement() {
   return relatedElement;

 }
 public void setRelatedElement(IfcElement value){
   this.relatedElement=value;

 }

}
