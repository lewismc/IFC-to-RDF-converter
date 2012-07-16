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

public class IfcRelConnectsPortToElement extends IfcRelConnects 
{
 // The property attributes
 IfcPort   relatingPort;
 IfcElement   relatedElement;


 // Getters and setters of properties

 public IfcPort getRelatingPort() {
   return relatingPort;

 }
 public void setRelatingPort(IfcPort value){
   this.relatingPort=value;

 }

 public IfcElement getRelatedElement() {
   return relatedElement;

 }
 public void setRelatedElement(IfcElement value){
   this.relatedElement=value;

 }

}
