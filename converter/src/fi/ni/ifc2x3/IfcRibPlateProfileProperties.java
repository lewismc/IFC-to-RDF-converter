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

public class IfcRibPlateProfileProperties extends IfcProfileProperties 
{
 // The property attributes
 Double thickness;
 Double ribHeight;
 Double ribWidth;
 Double ribSpacing;
 String direction;


 // Getters and setters of properties

 public Double getThickness() {
   return thickness;
 }
 public void setThickness(String txt){
   Double value = i.toDouble(txt);
   this.thickness=value;

 }

 public Double getRibHeight() {
   return ribHeight;
 }
 public void setRibHeight(String txt){
   Double value = i.toDouble(txt);
   this.ribHeight=value;

 }

 public Double getRibWidth() {
   return ribWidth;
 }
 public void setRibWidth(String txt){
   Double value = i.toDouble(txt);
   this.ribWidth=value;

 }

 public Double getRibSpacing() {
   return ribSpacing;
 }
 public void setRibSpacing(String txt){
   Double value = i.toDouble(txt);
   this.ribSpacing=value;

 }

 public String getDirection() {
   return direction;
 }
 public void setDirection(String value){
   this.direction=value;

 }

}
