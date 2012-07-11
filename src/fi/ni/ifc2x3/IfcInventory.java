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

public class IfcInventory extends IfcGroup 
{
 // The property attributes
 String inventoryType;
IfcActorSelect jurisdiction;
 List<IfcPerson> responsiblePersons = new IfcSet<IfcPerson>();
 IfcCalendarDate   lastUpdateDate;
 IfcCostValue   currentValue;
 IfcCostValue   originalValue;


 // Getters and setters of properties

 public String getInventoryType() {
   return inventoryType;
 }
 public void setInventoryType(String value){
   this.inventoryType=value;

 }

 public IfcActorSelect getJurisdiction() {
   return jurisdiction;
 }
 public void setJurisdiction(IfcActorSelect value){
   this.jurisdiction=value;

 }

 public List<IfcPerson> getResponsiblePersons() {
   return responsiblePersons;

 }
 public void setResponsiblePersons(IfcPerson value){
   this.responsiblePersons.add(value);

 }

 public IfcCalendarDate getLastUpdateDate() {
   return lastUpdateDate;

 }
 public void setLastUpdateDate(IfcCalendarDate value){
   this.lastUpdateDate=value;

 }

 public IfcCostValue getCurrentValue() {
   return currentValue;

 }
 public void setCurrentValue(IfcCostValue value){
   this.currentValue=value;

 }

 public IfcCostValue getOriginalValue() {
   return originalValue;

 }
 public void setOriginalValue(IfcCostValue value){
   this.originalValue=value;

 }

}
