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

public class IfcDerivedUnit extends Thing implements IfcUnit
{
 // The property attributes
 List<IfcDerivedUnitElement> elements = new IfcSet<IfcDerivedUnitElement>();
 String unitType;
 String userDefinedType;


 // Getters and setters of properties

 public List<IfcDerivedUnitElement> getElements() {
   return elements;

 }
 public void setElements(IfcDerivedUnitElement value){
   this.elements.add(value);

 }

 public String getUnitType() {
   return unitType;
 }
 public void setUnitType(String value){
   this.unitType=value;

 }

 public String getUserDefinedType() {
   return userDefinedType;
 }
 public void setUserDefinedType(String value){
   this.userDefinedType=value;

 }

}
