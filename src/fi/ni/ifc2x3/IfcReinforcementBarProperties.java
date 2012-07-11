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

public class IfcReinforcementBarProperties extends Thing 
{
 // The property attributes
 Double totalCrossSectionArea;
 String steelGrade;
 String barSurface;
 Double effectiveDepth;
 Double nominalBarDiameter;
 String barCount;


 // Getters and setters of properties

 public Double getTotalCrossSectionArea() {
   return totalCrossSectionArea;
 }
 public void setTotalCrossSectionArea(String txt){
   Double value = i.toDouble(txt);
   this.totalCrossSectionArea=value;

 }

 public String getSteelGrade() {
   return steelGrade;
 }
 public void setSteelGrade(String value){
   this.steelGrade=value;

 }

 public String getBarSurface() {
   return barSurface;
 }
 public void setBarSurface(String value){
   this.barSurface=value;

 }

 public Double getEffectiveDepth() {
   return effectiveDepth;
 }
 public void setEffectiveDepth(String txt){
   Double value = i.toDouble(txt);
   this.effectiveDepth=value;

 }

 public Double getNominalBarDiameter() {
   return nominalBarDiameter;
 }
 public void setNominalBarDiameter(String txt){
   Double value = i.toDouble(txt);
   this.nominalBarDiameter=value;

 }

 public String getBarCount() {
   return barCount;
 }
 public void setBarCount(String value){
   this.barCount=value;

 }

}
