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

public class IfcPropertyBoundedValue extends IfcSimpleProperty 
{
 // The property attributes
 String upperBoundValue;
 String lowerBoundValue;
IfcUnit unit;


 // Getters and setters of properties

 public String getUpperBoundValue() {
   return upperBoundValue;
 }
 public void setUpperBoundValue(String value){
   this.upperBoundValue=value;

 }

 public String getLowerBoundValue() {
   return lowerBoundValue;
 }
 public void setLowerBoundValue(String value){
   this.lowerBoundValue=value;

 }

 public IfcUnit getUnit() {
   return unit;
 }
 public void setUnit(IfcUnit value){
   this.unit=value;

 }

}
