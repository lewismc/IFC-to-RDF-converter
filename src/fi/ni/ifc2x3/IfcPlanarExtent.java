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

public class IfcPlanarExtent extends IfcGeometricRepresentationItem 
{
 // The property attributes
 Double sizeInX;
 Double sizeInY;


 // Getters and setters of properties

 public Double getSizeInX() {
   return sizeInX;
 }
 public void setSizeInX(String txt){
   Double value = i.toDouble(txt);
   this.sizeInX=value;

 }

 public Double getSizeInY() {
   return sizeInY;
 }
 public void setSizeInY(String txt){
   Double value = i.toDouble(txt);
   this.sizeInY=value;

 }

}
