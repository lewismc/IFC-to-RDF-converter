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

public class IfcSurfaceStyleRefraction extends Thing implements IfcSurfaceStyleElementSelect
{
 // The property attributes
 Double refractionIndex;
 Double dispersionFactor;


 // Getters and setters of properties

 public Double getRefractionIndex() {
   return refractionIndex;
 }
 public void setRefractionIndex(String txt){
   Double value = i.toDouble(txt);
   this.refractionIndex=value;

 }

 public Double getDispersionFactor() {
   return dispersionFactor;
 }
 public void setDispersionFactor(String txt){
   Double value = i.toDouble(txt);
   this.dispersionFactor=value;

 }

}
