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

public class IfcPropertyDependencyRelationship extends Thing 
{
 // The property attributes
 IfcProperty   dependingProperty;
 IfcProperty   dependantProperty;
 String name;
 String description;
 String expression;


 // Getters and setters of properties

 public IfcProperty getDependingProperty() {
   return dependingProperty;

 }
 public void setDependingProperty(IfcProperty value){
   this.dependingProperty=value;

 }

 public IfcProperty getDependantProperty() {
   return dependantProperty;

 }
 public void setDependantProperty(IfcProperty value){
   this.dependantProperty=value;

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

 public String getExpression() {
   return expression;
 }
 public void setExpression(String value){
   this.expression=value;

 }

}
