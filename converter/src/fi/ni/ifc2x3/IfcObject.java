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

public class IfcObject extends IfcObjectDefinition 
{
 // The property attributes
 String objectType;
 // The inverse attributes

 InverseLinksList<IfcRelDefines> isDefinedBy= new InverseLinksList<IfcRelDefines>();


 // Getters and setters of properties

 public String getObjectType() {
   return objectType;
 }
 public void setObjectType(String value){
   this.objectType=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelDefines> getIsDefinedBy() {
   return isDefinedBy;

 }
 public void setIsDefinedBy(IfcRelDefines value){
   this.isDefinedBy.add(value);

 }

}
