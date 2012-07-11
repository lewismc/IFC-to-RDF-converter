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

public class IfcApprovalRelationship extends Thing 
{
 // The property attributes
 IfcApproval   relatedApproval;
 IfcApproval   relatingApproval;
 String description;
 String name;


 // Getters and setters of properties

 public IfcApproval getRelatedApproval() {
   return relatedApproval;

 }
 public void setRelatedApproval(IfcApproval value){
   this.relatedApproval=value;

 }

 public IfcApproval getRelatingApproval() {
   return relatingApproval;

 }
 public void setRelatingApproval(IfcApproval value){
   this.relatingApproval=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

}
