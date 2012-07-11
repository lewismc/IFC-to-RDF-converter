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

public class IfcPropertySetDefinition extends IfcPropertyDefinition 
{
 // The inverse attributes

 InverseLinksList<IfcRelDefinesByProperties> propertyDefinitionOf= new InverseLinksList<IfcRelDefinesByProperties>();
 InverseLinksList<IfcTypeObject> definesType= new InverseLinksList<IfcTypeObject>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelDefinesByProperties> getPropertyDefinitionOf() {
   return propertyDefinitionOf;

 }
 public void setPropertyDefinitionOf(IfcRelDefinesByProperties value){
   this.propertyDefinitionOf.add(value);

 }

 public InverseLinksList<IfcTypeObject> getDefinesType() {
   return definesType;

 }
 public void setDefinesType(IfcTypeObject value){
   this.definesType.add(value);

 }

}
