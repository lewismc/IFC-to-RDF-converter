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

public class IfcRelConnectsStructuralMember extends IfcRelConnects 
{
 // The property attributes
 IfcStructuralMember   relatingStructuralMember;
 IfcStructuralConnection   relatedStructuralConnection;
 IfcBoundaryCondition   appliedCondition;
 IfcStructuralConnectionCondition   additionalConditions;
 Double supportedLength;
 IfcAxis2Placement3D   conditionCoordinateSystem;


 // Getters and setters of properties

 public IfcStructuralMember getRelatingStructuralMember() {
   return relatingStructuralMember;

 }
 public void setRelatingStructuralMember(IfcStructuralMember value){
   this.relatingStructuralMember=value;

 }

 public IfcStructuralConnection getRelatedStructuralConnection() {
   return relatedStructuralConnection;

 }
 public void setRelatedStructuralConnection(IfcStructuralConnection value){
   this.relatedStructuralConnection=value;

 }

 public IfcBoundaryCondition getAppliedCondition() {
   return appliedCondition;

 }
 public void setAppliedCondition(IfcBoundaryCondition value){
   this.appliedCondition=value;

 }

 public IfcStructuralConnectionCondition getAdditionalConditions() {
   return additionalConditions;

 }
 public void setAdditionalConditions(IfcStructuralConnectionCondition value){
   this.additionalConditions=value;

 }

 public Double getSupportedLength() {
   return supportedLength;
 }
 public void setSupportedLength(String txt){
   Double value = i.toDouble(txt);
   this.supportedLength=value;

 }

 public IfcAxis2Placement3D getConditionCoordinateSystem() {
   return conditionCoordinateSystem;

 }
 public void setConditionCoordinateSystem(IfcAxis2Placement3D value){
   this.conditionCoordinateSystem=value;

 }

}
