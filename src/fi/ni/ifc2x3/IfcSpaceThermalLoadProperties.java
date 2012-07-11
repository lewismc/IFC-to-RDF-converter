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

public class IfcSpaceThermalLoadProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 Double applicableValueRatio;
 String thermalLoadSource;
 String propertySource;
 String sourceDescription;
 Double maximumValue;
 Double minimumValue;
 IfcTimeSeries   thermalLoadTimeSeriesValues;
 String userDefinedThermalLoadSource;
 String userDefinedPropertySource;
 String thermalLoadType;


 // Getters and setters of properties

 public Double getApplicableValueRatio() {
   return applicableValueRatio;
 }
 public void setApplicableValueRatio(String txt){
   Double value = i.toDouble(txt);
   this.applicableValueRatio=value;

 }

 public String getThermalLoadSource() {
   return thermalLoadSource;
 }
 public void setThermalLoadSource(String value){
   this.thermalLoadSource=value;

 }

 public String getPropertySource() {
   return propertySource;
 }
 public void setPropertySource(String value){
   this.propertySource=value;

 }

 public String getSourceDescription() {
   return sourceDescription;
 }
 public void setSourceDescription(String value){
   this.sourceDescription=value;

 }

 public Double getMaximumValue() {
   return maximumValue;
 }
 public void setMaximumValue(String txt){
   Double value = i.toDouble(txt);
   this.maximumValue=value;

 }

 public Double getMinimumValue() {
   return minimumValue;
 }
 public void setMinimumValue(String txt){
   Double value = i.toDouble(txt);
   this.minimumValue=value;

 }

 public IfcTimeSeries getThermalLoadTimeSeriesValues() {
   return thermalLoadTimeSeriesValues;

 }
 public void setThermalLoadTimeSeriesValues(IfcTimeSeries value){
   this.thermalLoadTimeSeriesValues=value;

 }

 public String getUserDefinedThermalLoadSource() {
   return userDefinedThermalLoadSource;
 }
 public void setUserDefinedThermalLoadSource(String value){
   this.userDefinedThermalLoadSource=value;

 }

 public String getUserDefinedPropertySource() {
   return userDefinedPropertySource;
 }
 public void setUserDefinedPropertySource(String value){
   this.userDefinedPropertySource=value;

 }

 public String getThermalLoadType() {
   return thermalLoadType;
 }
 public void setThermalLoadType(String value){
   this.thermalLoadType=value;

 }

}
