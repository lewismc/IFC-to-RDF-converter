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

public class IfcActorRole extends Thing 
{
 // The property attributes
 String role;
 String userDefinedRole;
 String description;


 // Getters and setters of properties

 public String getRole() {
   return role;
 }
 public void setRole(String value){
   this.role=value;

 }

 public String getUserDefinedRole() {
   return userDefinedRole;
 }
 public void setUserDefinedRole(String value){
   this.userDefinedRole=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

}
