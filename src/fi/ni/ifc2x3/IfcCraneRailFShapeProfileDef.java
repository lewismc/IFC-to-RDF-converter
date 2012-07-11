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

public class IfcCraneRailFShapeProfileDef extends IfcParameterizedProfileDef 
{
 // The property attributes
 Double overallHeight;
 Double headWidth;
 Double radius;
 Double headDepth2;
 Double headDepth3;
 Double webThickness;
 Double baseDepth1;
 Double baseDepth2;
 Double centreOfGravityInY;


 // Getters and setters of properties

 public Double getOverallHeight() {
   return overallHeight;
 }
 public void setOverallHeight(String txt){
   Double value = i.toDouble(txt);
   this.overallHeight=value;

 }

 public Double getHeadWidth() {
   return headWidth;
 }
 public void setHeadWidth(String txt){
   Double value = i.toDouble(txt);
   this.headWidth=value;

 }

 public Double getRadius() {
   return radius;
 }
 public void setRadius(String txt){
   Double value = i.toDouble(txt);
   this.radius=value;

 }

 public Double getHeadDepth2() {
   return headDepth2;
 }
 public void setHeadDepth2(String txt){
   Double value = i.toDouble(txt);
   this.headDepth2=value;

 }

 public Double getHeadDepth3() {
   return headDepth3;
 }
 public void setHeadDepth3(String txt){
   Double value = i.toDouble(txt);
   this.headDepth3=value;

 }

 public Double getWebThickness() {
   return webThickness;
 }
 public void setWebThickness(String txt){
   Double value = i.toDouble(txt);
   this.webThickness=value;

 }

 public Double getBaseDepth1() {
   return baseDepth1;
 }
 public void setBaseDepth1(String txt){
   Double value = i.toDouble(txt);
   this.baseDepth1=value;

 }

 public Double getBaseDepth2() {
   return baseDepth2;
 }
 public void setBaseDepth2(String txt){
   Double value = i.toDouble(txt);
   this.baseDepth2=value;

 }

 public Double getCentreOfGravityInY() {
   return centreOfGravityInY;
 }
 public void setCentreOfGravityInY(String txt){
   Double value = i.toDouble(txt);
   this.centreOfGravityInY=value;

 }

}
