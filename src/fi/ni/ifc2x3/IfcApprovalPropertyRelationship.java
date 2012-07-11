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

public class IfcApprovalPropertyRelationship extends Thing 
{
 // The property attributes
 List<IfcProperty> approvedProperties = new IfcSet<IfcProperty>();
 IfcApproval   approval;


 // Getters and setters of properties

 public List<IfcProperty> getApprovedProperties() {
   return approvedProperties;

 }
 public void setApprovedProperties(IfcProperty value){
   this.approvedProperties.add(value);

 }

 public IfcApproval getApproval() {
   return approval;

 }
 public void setApproval(IfcApproval value){
   this.approval=value;

 }

}
