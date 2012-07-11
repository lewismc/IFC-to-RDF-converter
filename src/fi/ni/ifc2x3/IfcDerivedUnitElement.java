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

public class IfcDerivedUnitElement extends Thing 
{
 // The property attributes
 IfcNamedUnit   unit;
 Long exponent;


 // Getters and setters of properties

 public IfcNamedUnit getUnit() {
   return unit;

 }
 public void setUnit(IfcNamedUnit value){
   this.unit=value;

 }

 public Long getExponent() {
   return exponent;
 }
 public void setExponent(String txt){
   Long value = i.toLong(txt);
   this.exponent=value;

 }

}
