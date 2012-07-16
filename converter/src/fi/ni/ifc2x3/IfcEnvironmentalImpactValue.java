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

public class IfcEnvironmentalImpactValue extends IfcAppliedValue 
{
 // The property attributes
 String impactType;
 String category;
 String userDefinedCategory;


 // Getters and setters of properties

 public String getImpactType() {
   return impactType;
 }
 public void setImpactType(String value){
   this.impactType=value;

 }

 public String getCategory() {
   return category;
 }
 public void setCategory(String value){
   this.category=value;

 }

 public String getUserDefinedCategory() {
   return userDefinedCategory;
 }
 public void setUserDefinedCategory(String value){
   this.userDefinedCategory=value;

 }

}
