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

public class IfcRelConnectsStructuralElement extends IfcRelConnects 
{
 // The property attributes
 IfcElement   relatingElement;
 IfcStructuralMember   relatedStructuralMember;


 // Getters and setters of properties

 public IfcElement getRelatingElement() {
   return relatingElement;

 }
 public void setRelatingElement(IfcElement value){
   this.relatingElement=value;

 }

 public IfcStructuralMember getRelatedStructuralMember() {
   return relatedStructuralMember;

 }
 public void setRelatedStructuralMember(IfcStructuralMember value){
   this.relatedStructuralMember=value;

 }

}
