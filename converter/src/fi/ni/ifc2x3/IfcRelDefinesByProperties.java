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

public class IfcRelDefinesByProperties extends IfcRelDefines 
{
 // The property attributes
 IfcPropertySetDefinition   relatingPropertyDefinition;


 // Getters and setters of properties

 public IfcPropertySetDefinition getRelatingPropertyDefinition() {
   return relatingPropertyDefinition;

 }
 public void setRelatingPropertyDefinition(IfcPropertySetDefinition value){
   this.relatingPropertyDefinition=value;

 }

}
