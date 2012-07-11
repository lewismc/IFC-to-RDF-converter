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

public class IfcRelConnectsPorts extends IfcRelConnects 
{
 // The property attributes
 IfcPort   relatingPort;
 IfcPort   relatedPort;
 IfcElement   realizingElement;


 // Getters and setters of properties

 public IfcPort getRelatingPort() {
   return relatingPort;

 }
 public void setRelatingPort(IfcPort value){
   this.relatingPort=value;

 }

 public IfcPort getRelatedPort() {
   return relatedPort;

 }
 public void setRelatedPort(IfcPort value){
   this.relatedPort=value;

 }

 public IfcElement getRealizingElement() {
   return realizingElement;

 }
 public void setRealizingElement(IfcElement value){
   this.realizingElement=value;

 }

}
