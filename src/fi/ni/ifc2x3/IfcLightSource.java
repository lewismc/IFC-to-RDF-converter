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

public class IfcLightSource extends IfcGeometricRepresentationItem 
{
 // The property attributes
 String name;
 IfcColourRgb   lightColour;
 Double ambientIntensity;
 Double intensity;


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public IfcColourRgb getLightColour() {
   return lightColour;

 }
 public void setLightColour(IfcColourRgb value){
   this.lightColour=value;

 }

 public Double getAmbientIntensity() {
   return ambientIntensity;
 }
 public void setAmbientIntensity(String txt){
   Double value = i.toDouble(txt);
   this.ambientIntensity=value;

 }

 public Double getIntensity() {
   return intensity;
 }
 public void setIntensity(String txt){
   Double value = i.toDouble(txt);
   this.intensity=value;

 }

}
