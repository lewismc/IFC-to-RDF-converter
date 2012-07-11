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

public class IfcSurfaceStyleLighting extends Thing implements IfcSurfaceStyleElementSelect
{
 // The property attributes
 IfcColourRgb   diffuseTransmissionColour;
 IfcColourRgb   diffuseReflectionColour;
 IfcColourRgb   transmissionColour;
 IfcColourRgb   reflectanceColour;


 // Getters and setters of properties

 public IfcColourRgb getDiffuseTransmissionColour() {
   return diffuseTransmissionColour;

 }
 public void setDiffuseTransmissionColour(IfcColourRgb value){
   this.diffuseTransmissionColour=value;

 }

 public IfcColourRgb getDiffuseReflectionColour() {
   return diffuseReflectionColour;

 }
 public void setDiffuseReflectionColour(IfcColourRgb value){
   this.diffuseReflectionColour=value;

 }

 public IfcColourRgb getTransmissionColour() {
   return transmissionColour;

 }
 public void setTransmissionColour(IfcColourRgb value){
   this.transmissionColour=value;

 }

 public IfcColourRgb getReflectanceColour() {
   return reflectanceColour;

 }
 public void setReflectanceColour(IfcColourRgb value){
   this.reflectanceColour=value;

 }

}
