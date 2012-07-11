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

public class IfcMeasureWithUnit extends Thing implements IfcMetricValueSelect, IfcConditionCriterionSelect, IfcAppliedValueSelect
{
 // The property attributes
 String valueComponent;
IfcUnit unitComponent;


 // Getters and setters of properties

 public String getValueComponent() {
   return valueComponent;
 }
 public void setValueComponent(String value){
   this.valueComponent=value;

 }

 public IfcUnit getUnitComponent() {
   return unitComponent;
 }
 public void setUnitComponent(IfcUnit value){
   this.unitComponent=value;

 }

}
