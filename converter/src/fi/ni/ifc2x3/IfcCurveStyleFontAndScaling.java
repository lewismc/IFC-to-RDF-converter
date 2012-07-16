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

public class IfcCurveStyleFontAndScaling extends Thing implements IfcCurveFontOrScaledCurveFontSelect
{
 // The property attributes
 String name;
IfcCurveFontOrScaledCurveFontSelect curveFont;
 Double curveFontScaling;


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public IfcCurveFontOrScaledCurveFontSelect getCurveFont() {
   return curveFont;
 }
 public void setCurveFont(IfcCurveFontOrScaledCurveFontSelect value){
   this.curveFont=value;

 }

 public Double getCurveFontScaling() {
   return curveFontScaling;
 }
 public void setCurveFontScaling(String txt){
   Double value = i.toDouble(txt);
   this.curveFontScaling=value;

 }

}
