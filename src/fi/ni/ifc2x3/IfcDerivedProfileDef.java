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

public class IfcDerivedProfileDef extends IfcProfileDef 
{
 // The property attributes
 IfcProfileDef   parentProfile;
 IfcCartesianTransformationOperator2D   operator;
 String label;


 // Getters and setters of properties

 public IfcProfileDef getParentProfile() {
   return parentProfile;

 }
 public void setParentProfile(IfcProfileDef value){
   this.parentProfile=value;

 }

 public IfcCartesianTransformationOperator2D getOperator() {
   return operator;

 }
 public void setOperator(IfcCartesianTransformationOperator2D value){
   this.operator=value;

 }

 public String getLabel() {
   return label;
 }
 public void setLabel(String value){
   this.label=value;

 }

}
