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

public class IfcSurfaceStyleShading extends Thing implements IfcSurfaceStyleElementSelect
{
 // The property attributes
 IfcColourRgb   surfaceColour;


 // Getters and setters of properties

 public IfcColourRgb getSurfaceColour() {
   return surfaceColour;

 }
 public void setSurfaceColour(IfcColourRgb value){
   this.surfaceColour=value;

 }

}
