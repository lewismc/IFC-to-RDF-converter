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

public class IfcRepresentationContext extends Thing 
{
 // The property attributes
 String contextIdentifier;
 String contextType;
 // The inverse attributes

 InverseLinksList<IfcRepresentation> representationsInContext= new InverseLinksList<IfcRepresentation>();


 // Getters and setters of properties

 public String getContextIdentifier() {
   return contextIdentifier;
 }
 public void setContextIdentifier(String value){
   this.contextIdentifier=value;

 }

 public String getContextType() {
   return contextType;
 }
 public void setContextType(String value){
   this.contextType=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRepresentation> getRepresentationsInContext() {
   return representationsInContext;

 }
 public void setRepresentationsInContext(IfcRepresentation value){
   this.representationsInContext.add(value);

 }

}
