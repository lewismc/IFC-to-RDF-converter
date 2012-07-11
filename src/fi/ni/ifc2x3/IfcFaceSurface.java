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

public class IfcFaceSurface extends IfcFace implements IfcSurfaceOrFaceSurface
{
 // The property attributes
 IfcSurface   faceSurface;
 String sameSense;


 // Getters and setters of properties

 public IfcSurface getFaceSurface() {
   return faceSurface;

 }
 public void setFaceSurface(IfcSurface value){
   this.faceSurface=value;

 }

 public String getSameSense() {
   return sameSense;
 }
 public void setSameSense(String value){
   this.sameSense=value;

 }

}
