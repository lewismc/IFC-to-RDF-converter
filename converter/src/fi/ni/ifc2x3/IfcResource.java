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

public class IfcResource extends IfcObject 
{
 // The inverse attributes

 InverseLinksList<IfcRelAssignsToResource> resourceOf= new InverseLinksList<IfcRelAssignsToResource>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelAssignsToResource> getResourceOf() {
   return resourceOf;

 }
 public void setResourceOf(IfcRelAssignsToResource value){
   this.resourceOf.add(value);

 }

}
