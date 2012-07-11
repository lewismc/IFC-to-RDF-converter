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

public class IfcBooleanResult extends IfcGeometricRepresentationItem implements IfcCsgSelect, IfcBooleanOperand
{
 // The property attributes
 String operator;
IfcBooleanOperand firstOperand;
IfcBooleanOperand secondOperand;


 // Getters and setters of properties

 public String getOperator() {
   return operator;
 }
 public void setOperator(String value){
   this.operator=value;

 }

 public IfcBooleanOperand getFirstOperand() {
   return firstOperand;
 }
 public void setFirstOperand(IfcBooleanOperand value){
   this.firstOperand=value;

 }

 public IfcBooleanOperand getSecondOperand() {
   return secondOperand;
 }
 public void setSecondOperand(IfcBooleanOperand value){
   this.secondOperand=value;

 }

}
