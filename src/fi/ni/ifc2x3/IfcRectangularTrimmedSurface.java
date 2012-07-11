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

public class IfcRectangularTrimmedSurface extends IfcBoundedSurface 
{
 // The property attributes
 IfcSurface   basisSurface;
 Double u1;
 Double v1;
 Double u2;
 Double v2;
 String usense;
 String vsense;


 // Getters and setters of properties

 public IfcSurface getBasisSurface() {
   return basisSurface;

 }
 public void setBasisSurface(IfcSurface value){
   this.basisSurface=value;

 }

 public Double getU1() {
   return u1;
 }
 public void setU1(String txt){
   Double value = i.toDouble(txt);
   this.u1=value;

 }

 public Double getV1() {
   return v1;
 }
 public void setV1(String txt){
   Double value = i.toDouble(txt);
   this.v1=value;

 }

 public Double getU2() {
   return u2;
 }
 public void setU2(String txt){
   Double value = i.toDouble(txt);
   this.u2=value;

 }

 public Double getV2() {
   return v2;
 }
 public void setV2(String txt){
   Double value = i.toDouble(txt);
   this.v2=value;

 }

 public String getUsense() {
   return usense;
 }
 public void setUsense(String value){
   this.usense=value;

 }

 public String getVsense() {
   return vsense;
 }
 public void setVsense(String value){
   this.vsense=value;

 }

}
