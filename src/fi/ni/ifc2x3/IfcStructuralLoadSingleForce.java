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

public class IfcStructuralLoadSingleForce extends IfcStructuralLoadStatic 
{
 // The property attributes
 Double forceX;
 Double forceY;
 Double forceZ;
 Double momentX;
 Double momentY;
 Double momentZ;


 // Getters and setters of properties

 public Double getForceX() {
   return forceX;
 }
 public void setForceX(String txt){
   Double value = i.toDouble(txt);
   this.forceX=value;

 }

 public Double getForceY() {
   return forceY;
 }
 public void setForceY(String txt){
   Double value = i.toDouble(txt);
   this.forceY=value;

 }

 public Double getForceZ() {
   return forceZ;
 }
 public void setForceZ(String txt){
   Double value = i.toDouble(txt);
   this.forceZ=value;

 }

 public Double getMomentX() {
   return momentX;
 }
 public void setMomentX(String txt){
   Double value = i.toDouble(txt);
   this.momentX=value;

 }

 public Double getMomentY() {
   return momentY;
 }
 public void setMomentY(String txt){
   Double value = i.toDouble(txt);
   this.momentY=value;

 }

 public Double getMomentZ() {
   return momentZ;
 }
 public void setMomentZ(String txt){
   Double value = i.toDouble(txt);
   this.momentZ=value;

 }

}
