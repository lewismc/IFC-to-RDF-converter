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

public class IfcStructuralSteelProfileProperties extends IfcStructuralProfileProperties 
{
 // The property attributes
 Double shearAreaZ;
 Double shearAreaY;
 Double plasticShapeFactorY;
 Double plasticShapeFactorZ;


 // Getters and setters of properties

 public Double getShearAreaZ() {
   return shearAreaZ;
 }
 public void setShearAreaZ(String txt){
   Double value = i.toDouble(txt);
   this.shearAreaZ=value;

 }

 public Double getShearAreaY() {
   return shearAreaY;
 }
 public void setShearAreaY(String txt){
   Double value = i.toDouble(txt);
   this.shearAreaY=value;

 }

 public Double getPlasticShapeFactorY() {
   return plasticShapeFactorY;
 }
 public void setPlasticShapeFactorY(String txt){
   Double value = i.toDouble(txt);
   this.plasticShapeFactorY=value;

 }

 public Double getPlasticShapeFactorZ() {
   return plasticShapeFactorZ;
 }
 public void setPlasticShapeFactorZ(String txt){
   Double value = i.toDouble(txt);
   this.plasticShapeFactorZ=value;

 }

}
