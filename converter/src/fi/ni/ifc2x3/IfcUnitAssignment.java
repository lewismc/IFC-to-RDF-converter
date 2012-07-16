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

public class IfcUnitAssignment extends Thing 
{
 // The property attributes
 List<IfcUnit> units = new IfcSet<IfcUnit>();


 // Getters and setters of properties

 public List<IfcUnit> getUnits() {
   return units;
 }
 public void setUnits(IfcUnit value){
   this.units.add(value);

 }

}
