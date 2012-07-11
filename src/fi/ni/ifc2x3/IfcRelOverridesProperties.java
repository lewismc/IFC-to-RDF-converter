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

public class IfcRelOverridesProperties extends IfcRelDefinesByProperties 
{
 // The property attributes
 List<IfcProperty> overridingProperties = new IfcSet<IfcProperty>();


 // Getters and setters of properties

 public List<IfcProperty> getOverridingProperties() {
   return overridingProperties;

 }
 public void setOverridingProperties(IfcProperty value){
   this.overridingProperties.add(value);

 }

}
