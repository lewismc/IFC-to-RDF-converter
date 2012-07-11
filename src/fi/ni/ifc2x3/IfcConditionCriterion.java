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

public class IfcConditionCriterion extends IfcControl 
{
 // The property attributes
IfcConditionCriterionSelect criterion;
IfcDateTimeSelect criterionDateTime;


 // Getters and setters of properties

 public IfcConditionCriterionSelect getCriterion() {
   return criterion;
 }
 public void setCriterion(IfcConditionCriterionSelect value){
   this.criterion=value;

 }

 public IfcDateTimeSelect getCriterionDateTime() {
   return criterionDateTime;
 }
 public void setCriterionDateTime(IfcDateTimeSelect value){
   this.criterionDateTime=value;

 }

}
