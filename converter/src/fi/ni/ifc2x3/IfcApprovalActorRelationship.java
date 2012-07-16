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

public class IfcApprovalActorRelationship extends Thing 
{
 // The property attributes
IfcActorSelect actor;
 IfcApproval   approval;
 IfcActorRole   role;


 // Getters and setters of properties

 public IfcActorSelect getActor() {
   return actor;
 }
 public void setActor(IfcActorSelect value){
   this.actor=value;

 }

 public IfcApproval getApproval() {
   return approval;

 }
 public void setApproval(IfcApproval value){
   this.approval=value;

 }

 public IfcActorRole getRole() {
   return role;

 }
 public void setRole(IfcActorRole value){
   this.role=value;

 }

}
