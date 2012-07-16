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

public class IfcAppliedValue extends Thing implements IfcObjectReferenceSelect
{
 // The property attributes
 String name;
 String description;
IfcAppliedValueSelect appliedValue;
 IfcMeasureWithUnit   unitBasis;
IfcDateTimeSelect applicableDate;
IfcDateTimeSelect fixedUntilDate;
 // The inverse attributes

 InverseLinksList<IfcReferencesValueDocument> valuesReferenced= new InverseLinksList<IfcReferencesValueDocument>();
 InverseLinksList<IfcAppliedValueRelationship> valueOfComponents= new InverseLinksList<IfcAppliedValueRelationship>();
 InverseLinksList<IfcAppliedValueRelationship> isComponentIn= new InverseLinksList<IfcAppliedValueRelationship>();


 // Getters and setters of properties

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

 public IfcAppliedValueSelect getAppliedValue() {
   return appliedValue;
 }
 public void setAppliedValue(IfcAppliedValueSelect value){
   this.appliedValue=value;

 }

 public IfcMeasureWithUnit getUnitBasis() {
   return unitBasis;

 }
 public void setUnitBasis(IfcMeasureWithUnit value){
   this.unitBasis=value;

 }

 public IfcDateTimeSelect getApplicableDate() {
   return applicableDate;
 }
 public void setApplicableDate(IfcDateTimeSelect value){
   this.applicableDate=value;

 }

 public IfcDateTimeSelect getFixedUntilDate() {
   return fixedUntilDate;
 }
 public void setFixedUntilDate(IfcDateTimeSelect value){
   this.fixedUntilDate=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcReferencesValueDocument> getValuesReferenced() {
   return valuesReferenced;

 }
 public void setValuesReferenced(IfcReferencesValueDocument value){
   this.valuesReferenced.add(value);

 }

 public InverseLinksList<IfcAppliedValueRelationship> getValueOfComponents() {
   return valueOfComponents;

 }
 public void setValueOfComponents(IfcAppliedValueRelationship value){
   this.valueOfComponents.add(value);

 }

 public InverseLinksList<IfcAppliedValueRelationship> getIsComponentIn() {
   return isComponentIn;

 }
 public void setIsComponentIn(IfcAppliedValueRelationship value){
   this.isComponentIn.add(value);

 }

}
