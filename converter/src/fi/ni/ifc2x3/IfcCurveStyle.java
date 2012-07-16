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

public class IfcCurveStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect
{
 // The property attributes
IfcCurveFontOrScaledCurveFontSelect curveFont;
 String curveWidth;
IfcColour curveColour;


 // Getters and setters of properties

 public IfcCurveFontOrScaledCurveFontSelect getCurveFont() {
   return curveFont;
 }
 public void setCurveFont(IfcCurveFontOrScaledCurveFontSelect value){
   this.curveFont=value;

 }

 public String getCurveWidth() {
   return curveWidth;
 }
 public void setCurveWidth(String value){
   this.curveWidth=value;

 }

 public IfcColour getCurveColour() {
   return curveColour;
 }
 public void setCurveColour(IfcColour value){
   this.curveColour=value;

 }

}
