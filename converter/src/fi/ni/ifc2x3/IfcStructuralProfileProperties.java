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

public class IfcStructuralProfileProperties extends IfcGeneralProfileProperties 
{
 // The property attributes
 Double torsionalConstantX;
 Double momentOfInertiaYZ;
 Double momentOfInertiaY;
 Double momentOfInertiaZ;
 Double warpingConstant;
 Double shearCentreZ;
 Double shearCentreY;
 Double shearDeformationAreaZ;
 Double shearDeformationAreaY;
 Double maximumSectionModulusY;
 Double minimumSectionModulusY;
 Double maximumSectionModulusZ;
 Double minimumSectionModulusZ;
 Double torsionalSectionModulus;
 Double centreOfGravityInX;
 Double centreOfGravityInY;


 // Getters and setters of properties

 public Double getTorsionalConstantX() {
   return torsionalConstantX;
 }
 public void setTorsionalConstantX(String txt){
   Double value = i.toDouble(txt);
   this.torsionalConstantX=value;

 }

 public Double getMomentOfInertiaYZ() {
   return momentOfInertiaYZ;
 }
 public void setMomentOfInertiaYZ(String txt){
   Double value = i.toDouble(txt);
   this.momentOfInertiaYZ=value;

 }

 public Double getMomentOfInertiaY() {
   return momentOfInertiaY;
 }
 public void setMomentOfInertiaY(String txt){
   Double value = i.toDouble(txt);
   this.momentOfInertiaY=value;

 }

 public Double getMomentOfInertiaZ() {
   return momentOfInertiaZ;
 }
 public void setMomentOfInertiaZ(String txt){
   Double value = i.toDouble(txt);
   this.momentOfInertiaZ=value;

 }

 public Double getWarpingConstant() {
   return warpingConstant;
 }
 public void setWarpingConstant(String txt){
   Double value = i.toDouble(txt);
   this.warpingConstant=value;

 }

 public Double getShearCentreZ() {
   return shearCentreZ;
 }
 public void setShearCentreZ(String txt){
   Double value = i.toDouble(txt);
   this.shearCentreZ=value;

 }

 public Double getShearCentreY() {
   return shearCentreY;
 }
 public void setShearCentreY(String txt){
   Double value = i.toDouble(txt);
   this.shearCentreY=value;

 }

 public Double getShearDeformationAreaZ() {
   return shearDeformationAreaZ;
 }
 public void setShearDeformationAreaZ(String txt){
   Double value = i.toDouble(txt);
   this.shearDeformationAreaZ=value;

 }

 public Double getShearDeformationAreaY() {
   return shearDeformationAreaY;
 }
 public void setShearDeformationAreaY(String txt){
   Double value = i.toDouble(txt);
   this.shearDeformationAreaY=value;

 }

 public Double getMaximumSectionModulusY() {
   return maximumSectionModulusY;
 }
 public void setMaximumSectionModulusY(String txt){
   Double value = i.toDouble(txt);
   this.maximumSectionModulusY=value;

 }

 public Double getMinimumSectionModulusY() {
   return minimumSectionModulusY;
 }
 public void setMinimumSectionModulusY(String txt){
   Double value = i.toDouble(txt);
   this.minimumSectionModulusY=value;

 }

 public Double getMaximumSectionModulusZ() {
   return maximumSectionModulusZ;
 }
 public void setMaximumSectionModulusZ(String txt){
   Double value = i.toDouble(txt);
   this.maximumSectionModulusZ=value;

 }

 public Double getMinimumSectionModulusZ() {
   return minimumSectionModulusZ;
 }
 public void setMinimumSectionModulusZ(String txt){
   Double value = i.toDouble(txt);
   this.minimumSectionModulusZ=value;

 }

 public Double getTorsionalSectionModulus() {
   return torsionalSectionModulus;
 }
 public void setTorsionalSectionModulus(String txt){
   Double value = i.toDouble(txt);
   this.torsionalSectionModulus=value;

 }

 public Double getCentreOfGravityInX() {
   return centreOfGravityInX;
 }
 public void setCentreOfGravityInX(String txt){
   Double value = i.toDouble(txt);
   this.centreOfGravityInX=value;

 }

 public Double getCentreOfGravityInY() {
   return centreOfGravityInY;
 }
 public void setCentreOfGravityInY(String txt){
   Double value = i.toDouble(txt);
   this.centreOfGravityInY=value;

 }

}
