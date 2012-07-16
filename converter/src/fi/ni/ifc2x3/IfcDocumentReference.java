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

public class IfcDocumentReference extends IfcExternalReference implements IfcDocumentSelect
{
 // The inverse attributes

 InverseLinksList<IfcDocumentInformation> referenceToDocument= new InverseLinksList<IfcDocumentInformation>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcDocumentInformation> getReferenceToDocument() {
   return referenceToDocument;

 }
 public void setReferenceToDocument(IfcDocumentInformation value){
   this.referenceToDocument.add(value);

 }

}
