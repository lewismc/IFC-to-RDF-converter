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

public class IfcElementAssembly extends IfcElement 
{
 // The property attributes
 String assemblyPlace;
 String predefinedType;


 // Getters and setters of properties

 public String getAssemblyPlace() {
   return assemblyPlace;
 }
 public void setAssemblyPlace(String value){
   this.assemblyPlace=value;

 }

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

}
