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

public class IfcAsset extends IfcGroup 
{
 // The property attributes
 String assetID;
 IfcCostValue   originalValue;
 IfcCostValue   currentValue;
 IfcCostValue   totalReplacementCost;
IfcActorSelect owner;
IfcActorSelect user;
 IfcPerson   responsiblePerson;
 IfcCalendarDate   incorporationDate;
 IfcCostValue   depreciatedValue;


 // Getters and setters of properties

 public String getAssetID() {
   return assetID;
 }
 public void setAssetID(String value){
   this.assetID=value;

 }

 public IfcCostValue getOriginalValue() {
   return originalValue;

 }
 public void setOriginalValue(IfcCostValue value){
   this.originalValue=value;

 }

 public IfcCostValue getCurrentValue() {
   return currentValue;

 }
 public void setCurrentValue(IfcCostValue value){
   this.currentValue=value;

 }

 public IfcCostValue getTotalReplacementCost() {
   return totalReplacementCost;

 }
 public void setTotalReplacementCost(IfcCostValue value){
   this.totalReplacementCost=value;

 }

 public IfcActorSelect getOwner() {
   return owner;
 }
 public void setOwner(IfcActorSelect value){
   this.owner=value;

 }

 public IfcActorSelect getUser() {
   return user;
 }
 public void setUser(IfcActorSelect value){
   this.user=value;

 }

 public IfcPerson getResponsiblePerson() {
   return responsiblePerson;

 }
 public void setResponsiblePerson(IfcPerson value){
   this.responsiblePerson=value;

 }

 public IfcCalendarDate getIncorporationDate() {
   return incorporationDate;

 }
 public void setIncorporationDate(IfcCalendarDate value){
   this.incorporationDate=value;

 }

 public IfcCostValue getDepreciatedValue() {
   return depreciatedValue;

 }
 public void setDepreciatedValue(IfcCostValue value){
   this.depreciatedValue=value;

 }

}
