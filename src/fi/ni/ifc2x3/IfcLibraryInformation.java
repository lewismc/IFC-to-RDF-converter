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

public class IfcLibraryInformation extends Thing implements IfcLibrarySelect
{
 // The property attributes
 String name;
 String version;
 IfcOrganization   publisher;
 IfcCalendarDate   versionDate;
 List<IfcLibraryReference> libraryReference = new IfcSet<IfcLibraryReference>();


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getVersion() {
   return version;
 }
 public void setVersion(String value){
   this.version=value;

 }

 public IfcOrganization getPublisher() {
   return publisher;

 }
 public void setPublisher(IfcOrganization value){
   this.publisher=value;

 }

 public IfcCalendarDate getVersionDate() {
   return versionDate;

 }
 public void setVersionDate(IfcCalendarDate value){
   this.versionDate=value;

 }

 public List<IfcLibraryReference> getLibraryReference() {
   return libraryReference;

 }
 public void setLibraryReference(IfcLibraryReference value){
   this.libraryReference.add(value);

 }

}
