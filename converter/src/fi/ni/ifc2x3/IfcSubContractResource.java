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

public class IfcSubContractResource extends IfcConstructionResource 
{
 // The property attributes
IfcActorSelect subContractor;
 String jobDescription;


 // Getters and setters of properties

 public IfcActorSelect getSubContractor() {
   return subContractor;
 }
 public void setSubContractor(IfcActorSelect value){
   this.subContractor=value;

 }

 public String getJobDescription() {
   return jobDescription;
 }
 public void setJobDescription(String value){
   this.jobDescription=value;

 }

}
