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

public class IfcTextureCoordinate extends Thing 
{
 // The inverse attributes

 InverseLinksList<IfcAnnotationSurface> annotatedSurface= new InverseLinksList<IfcAnnotationSurface>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcAnnotationSurface> getAnnotatedSurface() {
   return annotatedSurface;

 }
 public void setAnnotatedSurface(IfcAnnotationSurface value){
   this.annotatedSurface.add(value);

 }

}
