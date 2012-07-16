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

public class IfcWindow extends IfcBuildingElement 
{
 // The property attributes
 Double overallHeight;
 Double overallWidth;


 // Getters and setters of properties

 public Double getOverallHeight() {
   return overallHeight;
 }
 public void setOverallHeight(String txt){
   Double value = i.toDouble(txt);
   this.overallHeight=value;

 }

 public Double getOverallWidth() {
   return overallWidth;
 }
 public void setOverallWidth(String txt){
   Double value = i.toDouble(txt);
   this.overallWidth=value;

 }

}
