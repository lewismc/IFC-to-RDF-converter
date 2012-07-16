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

public class IfcRightCircularCylinder extends IfcCsgPrimitive3D 
{
 // The property attributes
 Double height;
 Double radius;


 // Getters and setters of properties

 public Double getHeight() {
   return height;
 }
 public void setHeight(String txt){
   Double value = i.toDouble(txt);
   this.height=value;

 }

 public Double getRadius() {
   return radius;
 }
 public void setRadius(String txt){
   Double value = i.toDouble(txt);
   this.radius=value;

 }

}
