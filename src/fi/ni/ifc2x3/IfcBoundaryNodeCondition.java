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

public class IfcBoundaryNodeCondition extends IfcBoundaryCondition 
{
 // The property attributes
 Double linearStiffnessX;
 Double linearStiffnessY;
 Double linearStiffnessZ;
 Double rotationalStiffnessX;
 Double rotationalStiffnessY;
 Double rotationalStiffnessZ;


 // Getters and setters of properties

 public Double getLinearStiffnessX() {
   return linearStiffnessX;
 }
 public void setLinearStiffnessX(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessX=value;

 }

 public Double getLinearStiffnessY() {
   return linearStiffnessY;
 }
 public void setLinearStiffnessY(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessY=value;

 }

 public Double getLinearStiffnessZ() {
   return linearStiffnessZ;
 }
 public void setLinearStiffnessZ(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessZ=value;

 }

 public Double getRotationalStiffnessX() {
   return rotationalStiffnessX;
 }
 public void setRotationalStiffnessX(String txt){
   Double value = i.toDouble(txt);
   this.rotationalStiffnessX=value;

 }

 public Double getRotationalStiffnessY() {
   return rotationalStiffnessY;
 }
 public void setRotationalStiffnessY(String txt){
   Double value = i.toDouble(txt);
   this.rotationalStiffnessY=value;

 }

 public Double getRotationalStiffnessZ() {
   return rotationalStiffnessZ;
 }
 public void setRotationalStiffnessZ(String txt){
   Double value = i.toDouble(txt);
   this.rotationalStiffnessZ=value;

 }

}
