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

public class IfcPropertyTableValue extends IfcSimpleProperty 
{
 // The property attributes
 List<String> definingValues = new IfcList<String>();
 List<String> definedValues = new IfcList<String>();
 String expression;
IfcUnit definingUnit;
IfcUnit definedUnit;


 // Getters and setters of properties

 public List<String> getDefiningValues() {
   return definingValues;
 }
 public void setDefiningValues(String value){
   this.definingValues.add(value);

 }

 public List<String> getDefinedValues() {
   return definedValues;
 }
 public void setDefinedValues(String value){
   this.definedValues.add(value);

 }

 public String getExpression() {
   return expression;
 }
 public void setExpression(String value){
   this.expression=value;

 }

 public IfcUnit getDefiningUnit() {
   return definingUnit;
 }
 public void setDefiningUnit(IfcUnit value){
   this.definingUnit=value;

 }

 public IfcUnit getDefinedUnit() {
   return definedUnit;
 }
 public void setDefinedUnit(IfcUnit value){
   this.definedUnit=value;

 }

}
