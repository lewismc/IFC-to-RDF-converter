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

public class IfcMechanicalFastener extends IfcFastener 
{
 // The property attributes
 Double nominalDiameter;
 Double nominalLength;


 // Getters and setters of properties

 public Double getNominalDiameter() {
   return nominalDiameter;
 }
 public void setNominalDiameter(String txt){
   Double value = i.toDouble(txt);
   this.nominalDiameter=value;

 }

 public Double getNominalLength() {
   return nominalLength;
 }
 public void setNominalLength(String txt){
   Double value = i.toDouble(txt);
   this.nominalLength=value;

 }

}
