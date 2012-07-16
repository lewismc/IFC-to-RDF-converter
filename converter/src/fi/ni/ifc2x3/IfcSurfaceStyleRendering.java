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

public class IfcSurfaceStyleRendering extends IfcSurfaceStyleShading 
{
 // The property attributes
 Double transparency;
IfcColourOrFactor diffuseColour;
IfcColourOrFactor transmissionColour;
IfcColourOrFactor diffuseTransmissionColour;
IfcColourOrFactor reflectionColour;
IfcColourOrFactor specularColour;
 String specularHighlight;
 String reflectanceMethod;


 // Getters and setters of properties

 public Double getTransparency() {
   return transparency;
 }
 public void setTransparency(String txt){
   Double value = i.toDouble(txt);
   this.transparency=value;

 }

 public IfcColourOrFactor getDiffuseColour() {
   return diffuseColour;
 }
 public void setDiffuseColour(IfcColourOrFactor value){
   this.diffuseColour=value;

 }

 public IfcColourOrFactor getTransmissionColour() {
   return transmissionColour;
 }
 public void setTransmissionColour(IfcColourOrFactor value){
   this.transmissionColour=value;

 }

 public IfcColourOrFactor getDiffuseTransmissionColour() {
   return diffuseTransmissionColour;
 }
 public void setDiffuseTransmissionColour(IfcColourOrFactor value){
   this.diffuseTransmissionColour=value;

 }

 public IfcColourOrFactor getReflectionColour() {
   return reflectionColour;
 }
 public void setReflectionColour(IfcColourOrFactor value){
   this.reflectionColour=value;

 }

 public IfcColourOrFactor getSpecularColour() {
   return specularColour;
 }
 public void setSpecularColour(IfcColourOrFactor value){
   this.specularColour=value;

 }

 public String getSpecularHighlight() {
   return specularHighlight;
 }
 public void setSpecularHighlight(String value){
   this.specularHighlight=value;

 }

 public String getReflectanceMethod() {
   return reflectanceMethod;
 }
 public void setReflectanceMethod(String value){
   this.reflectanceMethod=value;

 }

}
