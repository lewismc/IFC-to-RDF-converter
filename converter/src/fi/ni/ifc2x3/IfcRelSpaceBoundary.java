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

public class IfcRelSpaceBoundary extends IfcRelConnects 
{
 // The property attributes
 IfcSpace   relatingSpace;
 IfcElement   relatedBuildingElement;
 IfcConnectionGeometry   connectionGeometry;
 String physicalOrVirtualBoundary;
 String internalOrExternalBoundary;


 // Getters and setters of properties

 public IfcSpace getRelatingSpace() {
   return relatingSpace;

 }
 public void setRelatingSpace(IfcSpace value){
   this.relatingSpace=value;

 }

 public IfcElement getRelatedBuildingElement() {
   return relatedBuildingElement;

 }
 public void setRelatedBuildingElement(IfcElement value){
   this.relatedBuildingElement=value;

 }

 public IfcConnectionGeometry getConnectionGeometry() {
   return connectionGeometry;

 }
 public void setConnectionGeometry(IfcConnectionGeometry value){
   this.connectionGeometry=value;

 }

 public String getPhysicalOrVirtualBoundary() {
   return physicalOrVirtualBoundary;
 }
 public void setPhysicalOrVirtualBoundary(String value){
   this.physicalOrVirtualBoundary=value;

 }

 public String getInternalOrExternalBoundary() {
   return internalOrExternalBoundary;
 }
 public void setInternalOrExternalBoundary(String value){
   this.internalOrExternalBoundary=value;

 }

}
