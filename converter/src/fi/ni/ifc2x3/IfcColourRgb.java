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

public class IfcColourRgb extends IfcColourSpecification implements IfcColourOrFactor
{
 // The property attributes
 Double red;
 Double green;
 Double blue;


 // Getters and setters of properties

 public Double getRed() {
   return red;
 }
 public void setRed(String txt){
   Double value = i.toDouble(txt);
   this.red=value;

 }

 public Double getGreen() {
   return green;
 }
 public void setGreen(String txt){
   Double value = i.toDouble(txt);
   this.green=value;

 }

 public Double getBlue() {
   return blue;
 }
 public void setBlue(String txt){
   Double value = i.toDouble(txt);
   this.blue=value;

 }

}
