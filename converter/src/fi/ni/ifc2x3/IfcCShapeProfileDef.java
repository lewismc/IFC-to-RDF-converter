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

public class IfcCShapeProfileDef extends IfcParameterizedProfileDef 
{
 // The property attributes
 Double depth;
 Double width;
 Double wallThickness;
 Double girth;
 Double internalFilletRadius;
 Double centreOfGravityInX;


 // Getters and setters of properties

 public Double getDepth() {
   return depth;
 }
 public void setDepth(String txt){
   Double value = i.toDouble(txt);
   this.depth=value;

 }

 public Double getWidth() {
   return width;
 }
 public void setWidth(String txt){
   Double value = i.toDouble(txt);
   this.width=value;

 }

 public Double getWallThickness() {
   return wallThickness;
 }
 public void setWallThickness(String txt){
   Double value = i.toDouble(txt);
   this.wallThickness=value;

 }

 public Double getGirth() {
   return girth;
 }
 public void setGirth(String txt){
   Double value = i.toDouble(txt);
   this.girth=value;

 }

 public Double getInternalFilletRadius() {
   return internalFilletRadius;
 }
 public void setInternalFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.internalFilletRadius=value;

 }

 public Double getCentreOfGravityInX() {
   return centreOfGravityInX;
 }
 public void setCentreOfGravityInX(String txt){
   Double value = i.toDouble(txt);
   this.centreOfGravityInX=value;

 }

}
