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

public class IfcProjectOrderRecord extends IfcControl 
{
 // The property attributes
 List<IfcRelAssignsToProjectOrder> records = new IfcList<IfcRelAssignsToProjectOrder>();
 String predefinedType;


 // Getters and setters of properties

 public List<IfcRelAssignsToProjectOrder> getRecords() {
   return records;

 }
 public void setRecords(IfcRelAssignsToProjectOrder value){
   this.records.add(value);

 }

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

}
