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

public class IfcPropertyDefinition extends IfcRoot 
{
 // The inverse attributes

 InverseLinksList<IfcRelAssociates> hasAssociations= new InverseLinksList<IfcRelAssociates>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelAssociates> getHasAssociations() {
   return hasAssociations;

 }
 public void setHasAssociations(IfcRelAssociates value){
   this.hasAssociations.add(value);

 }

}
