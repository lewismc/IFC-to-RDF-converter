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

public class IfcStructuralMember extends IfcStructuralItem 
{
 // The inverse attributes

 InverseLinksList<IfcRelConnectsStructuralElement> referencesElement= new InverseLinksList<IfcRelConnectsStructuralElement>();
 InverseLinksList<IfcRelConnectsStructuralMember> connectedBy= new InverseLinksList<IfcRelConnectsStructuralMember>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelConnectsStructuralElement> getReferencesElement() {
   return referencesElement;

 }
 public void setReferencesElement(IfcRelConnectsStructuralElement value){
   this.referencesElement.add(value);

 }

 public InverseLinksList<IfcRelConnectsStructuralMember> getConnectedBy() {
   return connectedBy;

 }
 public void setConnectedBy(IfcRelConnectsStructuralMember value){
   this.connectedBy.add(value);

 }

}
