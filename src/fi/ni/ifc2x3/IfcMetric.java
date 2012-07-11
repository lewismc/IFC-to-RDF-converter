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

public class IfcMetric extends IfcConstraint 
{
 // The property attributes
 String benchmark;
 String valueSource;
IfcMetricValueSelect dataValue;


 // Getters and setters of properties

 public String getBenchmark() {
   return benchmark;
 }
 public void setBenchmark(String value){
   this.benchmark=value;

 }

 public String getValueSource() {
   return valueSource;
 }
 public void setValueSource(String value){
   this.valueSource=value;

 }

 public IfcMetricValueSelect getDataValue() {
   return dataValue;
 }
 public void setDataValue(IfcMetricValueSelect value){
   this.dataValue=value;

 }

}
