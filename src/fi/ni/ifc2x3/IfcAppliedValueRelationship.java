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

public class IfcAppliedValueRelationship extends Thing 
{
 // The property attributes
 IfcAppliedValue   componentOfTotal;
 List<IfcAppliedValue> components = new IfcSet<IfcAppliedValue>();
 String arithmeticOperator;
 String name;
 String description;


 // Getters and setters of properties

 public IfcAppliedValue getComponentOfTotal() {
   return componentOfTotal;

 }
 public void setComponentOfTotal(IfcAppliedValue value){
   this.componentOfTotal=value;

 }

 public List<IfcAppliedValue> getComponents() {
   return components;

 }
 public void setComponents(IfcAppliedValue value){
   this.components.add(value);

 }

 public String getArithmeticOperator() {
   return arithmeticOperator;
 }
 public void setArithmeticOperator(String value){
   this.arithmeticOperator=value;

 }

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

}
