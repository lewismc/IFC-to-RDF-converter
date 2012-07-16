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

public class IfcReferencesValueDocument extends Thing 
{
 // The property attributes
IfcDocumentSelect referencedDocument;
 List<IfcAppliedValue> referencingValues = new IfcSet<IfcAppliedValue>();
 String name;
 String description;


 // Getters and setters of properties

 public IfcDocumentSelect getReferencedDocument() {
   return referencedDocument;
 }
 public void setReferencedDocument(IfcDocumentSelect value){
   this.referencedDocument=value;

 }

 public List<IfcAppliedValue> getReferencingValues() {
   return referencingValues;

 }
 public void setReferencingValues(IfcAppliedValue value){
   this.referencingValues.add(value);

 }

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

}
