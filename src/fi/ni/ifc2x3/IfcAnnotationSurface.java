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

public class IfcAnnotationSurface extends IfcGeometricRepresentationItem 
{
 // The property attributes
 IfcGeometricRepresentationItem   item;
 IfcTextureCoordinate   textureCoordinates;


 // Getters and setters of properties

 public IfcGeometricRepresentationItem getItem() {
   return item;

 }
 public void setItem(IfcGeometricRepresentationItem value){
   this.item=value;

 }

 public IfcTextureCoordinate getTextureCoordinates() {
   return textureCoordinates;

 }
 public void setTextureCoordinates(IfcTextureCoordinate value){
   this.textureCoordinates=value;

 }

}
