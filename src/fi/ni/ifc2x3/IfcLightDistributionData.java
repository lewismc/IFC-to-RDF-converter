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

public class IfcLightDistributionData extends Thing 
{
 // The property attributes
 Double mainPlaneAngle;
 List<Double> secondaryPlaneAngle = new IfcList<Double>();
 List<Double> luminousIntensity = new IfcList<Double>();


 // Getters and setters of properties

 public Double getMainPlaneAngle() {
   return mainPlaneAngle;
 }
 public void setMainPlaneAngle(String txt){
   Double value = i.toDouble(txt);
   this.mainPlaneAngle=value;

 }

 public List<Double> getSecondaryPlaneAngle() {
   return secondaryPlaneAngle;
 }
 public void setSecondaryPlaneAngle(String txt){
   List<Double> value = i.toDoubleList(txt);
   this.secondaryPlaneAngle=value;

 }

 public List<Double> getLuminousIntensity() {
   return luminousIntensity;
 }
 public void setLuminousIntensity(String txt){
   List<Double> value = i.toDoubleList(txt);
   this.luminousIntensity=value;

 }

}
