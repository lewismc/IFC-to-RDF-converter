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

public class IfcIShapeProfileDef extends IfcParameterizedProfileDef 
{
 // The property attributes
 Double overallWidth;
 Double overallDepth;
 Double webThickness;
 Double flangeThickness;
 Double filletRadius;


 // Getters and setters of properties

 public Double getOverallWidth() {
   return overallWidth;
 }
 public void setOverallWidth(String txt){
   Double value = i.toDouble(txt);
   this.overallWidth=value;

 }

 public Double getOverallDepth() {
   return overallDepth;
 }
 public void setOverallDepth(String txt){
   Double value = i.toDouble(txt);
   this.overallDepth=value;

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

}
