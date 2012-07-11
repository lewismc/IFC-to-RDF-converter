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

public class IfcSurfaceCurveSweptAreaSolid extends IfcSweptAreaSolid 
{
 // The property attributes
 IfcCurve   directrix;
 Double startParam;
 Double endParam;
 IfcSurface   referenceSurface;


 // Getters and setters of properties

 public IfcCurve getDirectrix() {
   return directrix;

 }
 public void setDirectrix(IfcCurve value){
   this.directrix=value;

 }

 public Double getStartParam() {
   return startParam;
 }
 public void setStartParam(String txt){
   Double value = i.toDouble(txt);
   this.startParam=value;

 }

 public Double getEndParam() {
   return endParam;
 }
 public void setEndParam(String txt){
   Double value = i.toDouble(txt);
   this.endParam=value;

 }

 public IfcSurface getReferenceSurface() {
   return referenceSurface;

 }
 public void setReferenceSurface(IfcSurface value){
   this.referenceSurface=value;

 }

}
