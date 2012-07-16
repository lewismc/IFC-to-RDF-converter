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

public class IfcUShapeProfileDef extends IfcParameterizedProfileDef 
{
 // The property attributes
 Double depth;
 Double flangeWidth;
 Double webThickness;
 Double flangeThickness;
 Double filletRadius;
 Double edgeRadius;
 Double flangeSlope;
 Double centreOfGravityInX;


 // Getters and setters of properties

 public Double getDepth() {
   return depth;
 }
 public void setDepth(String txt){
   Double value = i.toDouble(txt);
   this.depth=value;

 }

 public Double getFlangeWidth() {
   return flangeWidth;
 }
 public void setFlangeWidth(String txt){
   Double value = i.toDouble(txt);
   this.flangeWidth=value;

 }

 public Double getWebThickness() {
   return webThickness;
 }
 public void setWebThickness(String txt){
   Double value = i.toDouble(txt);
   this.webThickness=value;

 }

 public Double getFlangeThickness() {
   return flangeThickness;
 }
 public void setFlangeThickness(String txt){
   Double value = i.toDouble(txt);
   this.flangeThickness=value;

 }

 public Double getFilletRadius() {
   return filletRadius;
 }
 public void setFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.filletRadius=value;

 }

 public Double getEdgeRadius() {
   return edgeRadius;
 }
 public void setEdgeRadius(String txt){
   Double value = i.toDouble(txt);
   this.edgeRadius=value;

 }

 public Double getFlangeSlope() {
   return flangeSlope;
 }
 public void setFlangeSlope(String txt){
   Double value = i.toDouble(txt);
   this.flangeSlope=value;

 }

 public Double getCentreOfGravityInX() {
   return centreOfGravityInX;
 }
 public void setCentreOfGravityInX(String txt){
   Double value = i.toDouble(txt);
   this.centreOfGravityInX=value;

 }

}
