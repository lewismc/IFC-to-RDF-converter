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

public class IfcRectangleHollowProfileDef extends IfcRectangleProfileDef 
{
 // The property attributes
 Double wallThickness;
 Double innerFilletRadius;
 Double outerFilletRadius;


 // Getters and setters of properties

 public Double getWallThickness() {
   return wallThickness;
 }
 public void setWallThickness(String txt){
   Double value = i.toDouble(txt);
   this.wallThickness=value;

 }

 public Double getInnerFilletRadius() {
   return innerFilletRadius;
 }
 public void setInnerFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.innerFilletRadius=value;

 }

 public Double getOuterFilletRadius() {
   return outerFilletRadius;
 }
 public void setOuterFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.outerFilletRadius=value;

 }

}
