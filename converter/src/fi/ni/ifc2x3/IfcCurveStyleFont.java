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

public class IfcCurveStyleFont extends Thing implements IfcCurveFontOrScaledCurveFontSelect
{
 // The property attributes
 String name;
 List<IfcCurveStyleFontPattern> patternList = new IfcList<IfcCurveStyleFontPattern>();


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public List<IfcCurveStyleFontPattern> getPatternList() {
   return patternList;

 }
 public void setPatternList(IfcCurveStyleFontPattern value){
   this.patternList.add(value);

 }

}
