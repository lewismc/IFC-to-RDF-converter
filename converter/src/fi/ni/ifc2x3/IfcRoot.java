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

public class IfcRoot extends Thing 
{
 // The property attributes
 String globalId;
 IfcOwnerHistory   ownerHistory;
 String name;
 String description;


 // Getters and setters of properties

 public String getGlobalId() {
   return globalId;
 }
 public void setGlobalId(String value){
   this.globalId=value;

 }

 public IfcOwnerHistory getOwnerHistory() {
   return ownerHistory;

 }
 public void setOwnerHistory(IfcOwnerHistory value){
   this.ownerHistory=value;

 }

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

}
