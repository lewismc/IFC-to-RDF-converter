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

public class IfcWindowLiningProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 Double liningDepth;
 Double liningThickness;
 Double transomThickness;
 Double mullionThickness;
 Double firstTransomOffset;
 Double secondTransomOffset;
 Double firstMullionOffset;
 Double secondMullionOffset;
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

 public Double getTransomThickness() {
   return transomThickness;
 }
 public void setTransomThickness(String txt){
   Double value = i.toDouble(txt);
   this.transomThickness=value;

 }

 public Double getMullionThickness() {
   return mullionThickness;
 }
 public void setMullionThickness(String txt){
   Double value = i.toDouble(txt);
   this.mullionThickness=value;

 }

 public Double getFirstTransomOffset() {
   return firstTransomOffset;
 }
 public void setFirstTransomOffset(String txt){
   Double value = i.toDouble(txt);
   this.firstTransomOffset=value;

 }

 public Double getSecondTransomOffset() {
   return secondTransomOffset;
 }
 public void setSecondTransomOffset(String txt){
   Double value = i.toDouble(txt);
   this.secondTransomOffset=value;

 }

 public Double getFirstMullionOffset() {
   return firstMullionOffset;
 }
 public void setFirstMullionOffset(String txt){
   Double value = i.toDouble(txt);
   this.firstMullionOffset=value;

 }

 public Double getSecondMullionOffset() {
   return secondMullionOffset;
 }
 public void setSecondMullionOffset(String txt){
   Double value = i.toDouble(txt);
   this.secondMullionOffset=value;

 }

 public IfcShapeAspect getShapeAspectStyle() {
   return shapeAspectStyle;

 }
 public void setShapeAspectStyle(IfcShapeAspect value){
   this.shapeAspectStyle=value;

 }

}
