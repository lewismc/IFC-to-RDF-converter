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

public class IfcPointOnSurface extends IfcPoint 
{
 // The property attributes
 IfcSurface   basisSurface;
 Double pointParameterU;
 Double pointParameterV;


 // Getters and setters of properties

 public IfcSurface getBasisSurface() {
   return basisSurface;

 }
 public void setBasisSurface(IfcSurface value){
   this.basisSurface=value;

 }

 public Double getPointParameterU() {
   return pointParameterU;
 }
 public void setPointParameterU(String txt){
   Double value = i.toDouble(txt);
   this.pointParameterU=value;

 }

 public Double getPointParameterV() {
   return pointParameterV;
 }
 public void setPointParameterV(String txt){
   Double value = i.toDouble(txt);
   this.pointParameterV=value;

 }

}
