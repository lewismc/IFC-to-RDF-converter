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

public class IfcApproval extends Thing 
{
 // The property attributes
 String description;
IfcDateTimeSelect approvalDateTime;
 String approvalStatus;
 String approvalLevel;
 String approvalQualifier;
 String name;
 String identifier;
 // The inverse attributes

 InverseLinksList<IfcApprovalActorRelationship> actors= new InverseLinksList<IfcApprovalActorRelationship>();
 InverseLinksList<IfcApprovalRelationship> isRelatedWith= new InverseLinksList<IfcApprovalRelationship>();
 InverseLinksList<IfcApprovalRelationship> relates= new InverseLinksList<IfcApprovalRelationship>();


 // Getters and setters of properties

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 public IfcDateTimeSelect getApprovalDateTime() {
   return approvalDateTime;
 }
 public void setApprovalDateTime(IfcDateTimeSelect value){
   this.approvalDateTime=value;

 }

 public String getApprovalStatus() {
   return approvalStatus;
 }
 public void setApprovalStatus(String value){
   this.approvalStatus=value;

 }

 public String getApprovalLevel() {
   return approvalLevel;
 }
 public void setApprovalLevel(String value){
   this.approvalLevel=value;

 }

 public String getApprovalQualifier() {
   return approvalQualifier;
 }
 public void setApprovalQualifier(String value){
   this.approvalQualifier=value;

 }

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getIdentifier() {
   return identifier;
 }
 public void setIdentifier(String value){
   this.identifier=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcApprovalActorRelationship> getActors() {
   return actors;

 }
 public void setActors(IfcApprovalActorRelationship value){
   this.actors.add(value);

 }

 public InverseLinksList<IfcApprovalRelationship> getIsRelatedWith() {
   return isRelatedWith;

 }
 public void setIsRelatedWith(IfcApprovalRelationship value){
   this.isRelatedWith.add(value);

 }

 public InverseLinksList<IfcApprovalRelationship> getRelates() {
   return relates;

 }
 public void setRelates(IfcApprovalRelationship value){
   this.relates.add(value);

 }

}
