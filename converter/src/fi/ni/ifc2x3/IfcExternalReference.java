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

public class IfcExternalReference extends Thing implements IfcLightDistributionDataSourceSelect, IfcObjectReferenceSelect
{
 // The property attributes
 String location;
 String itemReference;
 String name;


 // Getters and setters of properties

 public String getLocation() {
   return location;
 }
 public void setLocation(String value){
   this.location=value;

 }

 public String getItemReference() {
   return itemReference;
 }
 public void setItemReference(String value){
   this.itemReference=value;

 }

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

}
