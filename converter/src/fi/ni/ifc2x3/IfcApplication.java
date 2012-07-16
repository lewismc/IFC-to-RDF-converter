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

public class IfcApplication extends Thing 
{
 // The property attributes
 IfcOrganization   applicationDeveloper;
 String version;
 String applicationFullName;
 String applicationIdentifier;


 // Getters and setters of properties

 public IfcOrganization getApplicationDeveloper() {
   return applicationDeveloper;

 }
 public void setApplicationDeveloper(IfcOrganization value){
   this.applicationDeveloper=value;

 }

 public String getVersion() {
   return version;
 }
 public void setVersion(String value){
   this.version=value;

 }

 public String getApplicationFullName() {
   return applicationFullName;
 }
 public void setApplicationFullName(String value){
   this.applicationFullName=value;

 }

 public String getApplicationIdentifier() {
   return applicationIdentifier;
 }
 public void setApplicationIdentifier(String value){
   this.applicationIdentifier=value;

 }

}
