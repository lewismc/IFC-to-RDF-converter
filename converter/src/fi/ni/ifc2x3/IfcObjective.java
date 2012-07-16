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

public class IfcObjective extends IfcConstraint 
{
 // The property attributes
 IfcMetric   benchmarkValues;
 IfcMetric   resultValues;
 String objectiveQualifier;
 String userDefinedQualifier;


 // Getters and setters of properties

 public IfcMetric getBenchmarkValues() {
   return benchmarkValues;

 }
 public void setBenchmarkValues(IfcMetric value){
   this.benchmarkValues=value;

 }

 public IfcMetric getResultValues() {
   return resultValues;

 }
 public void setResultValues(IfcMetric value){
   this.resultValues=value;

 }

 public String getObjectiveQualifier() {
   return objectiveQualifier;
 }
 public void setObjectiveQualifier(String value){
   this.objectiveQualifier=value;

 }

 public String getUserDefinedQualifier() {
   return userDefinedQualifier;
 }
 public void setUserDefinedQualifier(String value){
   this.userDefinedQualifier=value;

 }

}
