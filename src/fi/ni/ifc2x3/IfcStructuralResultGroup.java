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

public class IfcStructuralResultGroup extends IfcGroup 
{
 // The property attributes
 String theoryType;
 IfcStructuralLoadGroup   resultForLoadGroup;
 String isLinear;
 // The inverse attributes

 InverseLinksList<IfcStructuralAnalysisModel> resultGroupFor= new InverseLinksList<IfcStructuralAnalysisModel>();


 // Getters and setters of properties

 public String getTheoryType() {
   return theoryType;
 }
 public void setTheoryType(String value){
   this.theoryType=value;

 }

 public IfcStructuralLoadGroup getResultForLoadGroup() {
   return resultForLoadGroup;

 }
 public void setResultForLoadGroup(IfcStructuralLoadGroup value){
   this.resultForLoadGroup=value;

 }

 public String getIsLinear() {
   return isLinear;
 }
 public void setIsLinear(String value){
   this.isLinear=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcStructuralAnalysisModel> getResultGroupFor() {
   return resultGroupFor;

 }
 public void setResultGroupFor(IfcStructuralAnalysisModel value){
   this.resultGroupFor.add(value);

 }

}
