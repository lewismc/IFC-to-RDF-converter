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

public class IfcProjectOrder extends IfcControl 
{
 // The property attributes
 String iD;
 String predefinedType;
 String status;


 // Getters and setters of properties

 public String getID() {
   return iD;
 }
 public void setID(String value){
   this.iD=value;

 }

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

 public String getStatus() {
   return status;
 }
 public void setStatus(String value){
   this.status=value;

 }

}
