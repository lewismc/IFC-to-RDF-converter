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

public class IfcDoorLiningProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 Double liningDepth;
 Double liningThickness;
 Double thresholdDepth;
 Double thresholdThickness;
 Double transomThickness;
 Double transomOffset;
 Double liningOffset;
 Double thresholdOffset;
 Double casingThickness;
 Double casingDepth;
 IfcShapeAspect   shapeAspectStyle;


 // Getters and setters of properties

 public Double getLiningDepth() {
   return liningDepth;
 }
 public void setLiningDepth(String txt){
   Double value = i.toDouble(txt);
   this.liningDepth=value;

 }

 public Double getLiningThickness() {
   return liningThickness;
 }
 public void setLiningThickness(String txt){
   Double value = i.toDouble(txt);
   this.liningThickness=value;

 }

 public Double getThresholdDepth() {
   return thresholdDepth;
 }
 public void setThresholdDepth(String txt){
   Double value = i.toDouble(txt);
   this.thresholdDepth=value;

 }

 public Double getThresholdThickness() {
   return thresholdThickness;
 }
 public void setThresholdThickness(String txt){
   Double value = i.toDouble(txt);
   this.thresholdThickness=value;

 }

 public Double getTransomThickness() {
   return transomThickness;
 }
 public void setTransomThickness(String txt){
   Double value = i.toDouble(txt);
   this.transomThickness=value;

 }

 public Double getTransomOffset() {
   return transomOffset;
 }
 public void setTransomOffset(String txt){
   Double value = i.toDouble(txt);
   this.transomOffset=value;

 }

 public Double getLiningOffset() {
   return liningOffset;
 }
 public void setLiningOffset(String txt){
   Double value = i.toDouble(txt);
   this.liningOffset=value;

 }

 public Double getThresholdOffset() {
   return thresholdOffset;
 }
 public void setThresholdOffset(String txt){
   Double value = i.toDouble(txt);
   this.thresholdOffset=value;

 }

 public Double getCasingThickness() {
   return casingThickness;
 }
 public void setCasingThickness(String txt){
   Double value = i.toDouble(txt);
   this.casingThickness=value;

 }

 public Double getCasingDepth() {
   return casingDepth;
 }
 public void setCasingDepth(String txt){
   Double value = i.toDouble(txt);
   this.casingDepth=value;

 }

 public IfcShapeAspect getShapeAspectStyle() {
   return shapeAspectStyle;

 }
 public void setShapeAspectStyle(IfcShapeAspect value){
   this.shapeAspectStyle=value;

 }

}
