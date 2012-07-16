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

public class IfcServiceLifeFactor extends IfcPropertySetDefinition 
{
 // The property attributes
 String predefinedType;
 String upperValue;
 String mostUsedValue;
 String lowerValue;


 // Getters and setters of properties

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

 public String getUpperValue() {
   return upperValue;
 }
 public void setUpperValue(String value){
   this.upperValue=value;

 }

 public String getMostUsedValue() {
   return mostUsedValue;
 }
 public void setMostUsedValue(String value){
   this.mostUsedValue=value;

 }

 public String getLowerValue() {
   return lowerValue;
 }
 public void setLowerValue(String value){
   this.lowerValue=value;

 }

}
