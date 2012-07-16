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

public class IfcStructuralLoadLinearForce extends IfcStructuralLoadStatic 
{
 // The property attributes
 Double linearForceX;
 Double linearForceY;
 Double linearForceZ;
 Double linearMomentX;
 Double linearMomentY;
 Double linearMomentZ;


 // Getters and setters of properties

 public Double getLinearForceX() {
   return linearForceX;
 }
 public void setLinearForceX(String txt){
   Double value = i.toDouble(txt);
   this.linearForceX=value;

 }

 public Double getLinearForceY() {
   return linearForceY;
 }
 public void setLinearForceY(String txt){
   Double value = i.toDouble(txt);
   this.linearForceY=value;

 }

 public Double getLinearForceZ() {
   return linearForceZ;
 }
 public void setLinearForceZ(String txt){
   Double value = i.toDouble(txt);
   this.linearForceZ=value;

 }

 public Double getLinearMomentX() {
   return linearMomentX;
 }
 public void setLinearMomentX(String txt){
   Double value = i.toDouble(txt);
   this.linearMomentX=value;

 }

 public Double getLinearMomentY() {
   return linearMomentY;
 }
 public void setLinearMomentY(String txt){
   Double value = i.toDouble(txt);
   this.linearMomentY=value;

 }

 public Double getLinearMomentZ() {
   return linearMomentZ;
 }
 public void setLinearMomentZ(String txt){
   Double value = i.toDouble(txt);
   this.linearMomentZ=value;

 }

}
