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

public class IfcPropertySet extends IfcPropertySetDefinition 
{
 // The property attributes
 List<IfcProperty> hasProperties = new IfcSet<IfcProperty>();


 // Getters and setters of properties

 public List<IfcProperty> getHasProperties() {
   return hasProperties;

 }
 public void setHasProperties(IfcProperty value){
   this.hasProperties.add(value);

 }

}
