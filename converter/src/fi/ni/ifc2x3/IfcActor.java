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

public class IfcActor extends IfcObject 
{
 // The property attributes
IfcActorSelect theActor;
 // The inverse attributes

 InverseLinksList<IfcRelAssignsToActor> isActingUpon= new InverseLinksList<IfcRelAssignsToActor>();


 // Getters and setters of properties

 public IfcActorSelect getTheActor() {
   return theActor;
 }
 public void setTheActor(IfcActorSelect value){
   this.theActor=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelAssignsToActor> getIsActingUpon() {
   return isActingUpon;

 }
 public void setIsActingUpon(IfcRelAssignsToActor value){
   this.isActingUpon.add(value);

 }

}
