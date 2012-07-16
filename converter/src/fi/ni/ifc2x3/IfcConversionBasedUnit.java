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

public class IfcConversionBasedUnit extends IfcNamedUnit 
{
 // The property attributes
 String name;
 IfcMeasureWithUnit   conversionFactor;


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public IfcMeasureWithUnit getConversionFactor() {
   return conversionFactor;

 }
 public void setConversionFactor(IfcMeasureWithUnit value){
   this.conversionFactor=value;

 }

}
