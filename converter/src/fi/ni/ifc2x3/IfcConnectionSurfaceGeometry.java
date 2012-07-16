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

public class IfcConnectionSurfaceGeometry extends IfcConnectionGeometry 
{
 // The property attributes
IfcSurfaceOrFaceSurface surfaceOnRelatingElement;
IfcSurfaceOrFaceSurface surfaceOnRelatedElement;


 // Getters and setters of properties

 public IfcSurfaceOrFaceSurface getSurfaceOnRelatingElement() {
   return surfaceOnRelatingElement;
 }
 public void setSurfaceOnRelatingElement(IfcSurfaceOrFaceSurface value){
   this.surfaceOnRelatingElement=value;

 }

 public IfcSurfaceOrFaceSurface getSurfaceOnRelatedElement() {
   return surfaceOnRelatedElement;
 }
 public void setSurfaceOnRelatedElement(IfcSurfaceOrFaceSurface value){
   this.surfaceOnRelatedElement=value;

 }

}
