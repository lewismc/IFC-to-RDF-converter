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

public class IfcReinforcingBar extends IfcReinforcingElement 
{
 // The property attributes
 Double nominalDiameter;
 Double crossSectionArea;
 Double barLength;
 String barRole;
 String barSurface;


 // Getters and setters of properties

 public Double getNominalDiameter() {
   return nominalDiameter;
 }
 public void setNominalDiameter(String txt){
   Double value = i.toDouble(txt);
   this.nominalDiameter=value;

 }

 public Double getCrossSectionArea() {
   return crossSectionArea;
 }
 public void setCrossSectionArea(String txt){
   Double value = i.toDouble(txt);
   this.crossSectionArea=value;

 }

 public Double getBarLength() {
   return barLength;
 }
 public void setBarLength(String txt){
   Double value = i.toDouble(txt);
   this.barLength=value;

 }

 public String getBarRole() {
   return barRole;
 }
 public void setBarRole(String value){
   this.barRole=value;

 }

 public String getBarSurface() {
   return barSurface;
 }
 public void setBarSurface(String value){
   this.barSurface=value;

 }

}
