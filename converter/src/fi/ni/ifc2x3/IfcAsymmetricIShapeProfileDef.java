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

public class IfcAsymmetricIShapeProfileDef extends IfcIShapeProfileDef 
{
 // The property attributes
 Double topFlangeWidth;
 Double topFlangeThickness;
 Double topFlangeFilletRadius;
 Double centreOfGravityInY;


 // Getters and setters of properties

 public Double getTopFlangeWidth() {
   return topFlangeWidth;
 }
 public void setTopFlangeWidth(String txt){
   Double value = i.toDouble(txt);
   this.topFlangeWidth=value;

 }

 public Double getTopFlangeThickness() {
   return topFlangeThickness;
 }
 public void setTopFlangeThickness(String txt){
   Double value = i.toDouble(txt);
   this.topFlangeThickness=value;

 }

 public Double getTopFlangeFilletRadius() {
   return topFlangeFilletRadius;
 }
 public void setTopFlangeFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.topFlangeFilletRadius=value;

 }

 public Double getCentreOfGravityInY() {
   return centreOfGravityInY;
 }
 public void setCentreOfGravityInY(String txt){
   Double value = i.toDouble(txt);
   this.centreOfGravityInY=value;

 }

}
