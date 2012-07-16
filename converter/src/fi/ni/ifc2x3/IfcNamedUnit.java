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

public class IfcNamedUnit extends Thing implements IfcUnit
{
 // The property attributes
 IfcDimensionalExponents   dimensions;
 String unitType;


 // Getters and setters of properties

 public IfcDimensionalExponents getDimensions() {
   return dimensions;

 }
 public void setDimensions(IfcDimensionalExponents value){
   this.dimensions=value;

 }

 public String getUnitType() {
   return unitType;
 }
 public void setUnitType(String value){
   this.unitType=value;

 }

}
