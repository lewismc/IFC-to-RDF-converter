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

public class IfcDocumentInformationRelationship extends Thing 
{
 // The property attributes
 IfcDocumentInformation   relatingDocument;
 List<IfcDocumentInformation> relatedDocuments = new IfcSet<IfcDocumentInformation>();
 String relationshipType;


 // Getters and setters of properties

 public IfcDocumentInformation getRelatingDocument() {
   return relatingDocument;

 }
 public void setRelatingDocument(IfcDocumentInformation value){
   this.relatingDocument=value;

 }

 public List<IfcDocumentInformation> getRelatedDocuments() {
   return relatedDocuments;

 }
 public void setRelatedDocuments(IfcDocumentInformation value){
   this.relatedDocuments.add(value);

 }

 public String getRelationshipType() {
   return relationshipType;
 }
 public void setRelationshipType(String value){
   this.relationshipType=value;

 }

}
