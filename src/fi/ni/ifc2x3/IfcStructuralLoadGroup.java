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

public class IfcStructuralLoadGroup extends IfcGroup 
{
 // The property attributes
 String predefinedType;
 String actionType;
 String actionSource;
 Double coefficient;
 String purpose;
 // The inverse attributes

 InverseLinksList<IfcStructuralResultGroup> sourceOfResultGroup= new InverseLinksList<IfcStructuralResultGroup>();
 InverseLinksList<IfcStructuralAnalysisModel> loadGroupFor= new InverseLinksList<IfcStructuralAnalysisModel>();


 // Getters and setters of properties

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

 public String getActionType() {
   return actionType;
 }
 public void setActionType(String value){
   this.actionType=value;

 }

 public String getActionSource() {
   return actionSource;
 }
 public void setActionSource(String value){
   this.actionSource=value;

 }

 public Double getCoefficient() {
   return coefficient;
 }
 public void setCoefficient(String txt){
   Double value = i.toDouble(txt);
   this.coefficient=value;

 }

 public String getPurpose() {
   return purpose;
 }
 public void setPurpose(String value){
   this.purpose=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcStructuralResultGroup> getSourceOfResultGroup() {
   return sourceOfResultGroup;

 }
 public void setSourceOfResultGroup(IfcStructuralResultGroup value){
   this.sourceOfResultGroup.add(value);

 }

 public InverseLinksList<IfcStructuralAnalysisModel> getLoadGroupFor() {
   return loadGroupFor;

 }
 public void setLoadGroupFor(IfcStructuralAnalysisModel value){
   this.loadGroupFor.add(value);

 }

}
