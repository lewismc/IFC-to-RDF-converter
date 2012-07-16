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

public class IfcStructuralLoadTemperature extends IfcStructuralLoadStatic 
{
 // The property attributes
 Double deltaT_Constant;
 Double deltaT_Y;
 Double deltaT_Z;


 // Getters and setters of properties

 public Double getDeltaT_Constant() {
   return deltaT_Constant;
 }
 public void setDeltaT_Constant(String txt){
   Double value = i.toDouble(txt);
   this.deltaT_Constant=value;

 }

 public Double getDeltaT_Y() {
   return deltaT_Y;
 }
 public void setDeltaT_Y(String txt){
   Double value = i.toDouble(txt);
   this.deltaT_Y=value;

 }

 public Double getDeltaT_Z() {
   return deltaT_Z;
 }
 public void setDeltaT_Z(String txt){
   Double value = i.toDouble(txt);
   this.deltaT_Z=value;

 }

}
