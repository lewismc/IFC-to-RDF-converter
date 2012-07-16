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

public class IfcDocumentElectronicFormat extends Thing 
{
 // The property attributes
 String fileExtension;
 String mimeContentType;
 String mimeSubtype;


 // Getters and setters of properties

 public String getFileExtension() {
   return fileExtension;
 }
 public void setFileExtension(String value){
   this.fileExtension=value;

 }

 public String getMimeContentType() {
   return mimeContentType;
 }
 public void setMimeContentType(String value){
   this.mimeContentType=value;

 }

 public String getMimeSubtype() {
   return mimeSubtype;
 }
 public void setMimeSubtype(String value){
   this.mimeSubtype=value;

 }

}
