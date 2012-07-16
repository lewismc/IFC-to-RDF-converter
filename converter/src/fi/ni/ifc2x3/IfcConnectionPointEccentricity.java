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

public class IfcConnectionPointEccentricity extends IfcConnectionPointGeometry 
{
 // The property attributes
 Double eccentricityInX;
 Double eccentricityInY;
 Double eccentricityInZ;


 // Getters and setters of properties

 public Double getEccentricityInX() {
   return eccentricityInX;
 }
 public void setEccentricityInX(String txt){
   Double value = i.toDouble(txt);
   this.eccentricityInX=value;

 }

 public Double getEccentricityInY() {
   return eccentricityInY;
 }
 public void setEccentricityInY(String txt){
   Double value = i.toDouble(txt);
   this.eccentricityInY=value;

 }

 public Double getEccentricityInZ() {
   return eccentricityInZ;
 }
 public void setEccentricityInZ(String txt){
   Double value = i.toDouble(txt);
   this.eccentricityInZ=value;

 }

}
