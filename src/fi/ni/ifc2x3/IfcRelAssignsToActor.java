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

public class IfcRelAssignsToActor extends IfcRelAssigns 
{
 // The property attributes
 IfcActor   relatingActor;
 IfcActorRole   actingRole;


 // Getters and setters of properties

 public IfcActor getRelatingActor() {
   return relatingActor;

 }
 public void setRelatingActor(IfcActor value){
   this.relatingActor=value;

 }

 public IfcActorRole getActingRole() {
   return actingRole;

 }
 public void setActingRole(IfcActorRole value){
   this.actingRole=value;

 }

}
