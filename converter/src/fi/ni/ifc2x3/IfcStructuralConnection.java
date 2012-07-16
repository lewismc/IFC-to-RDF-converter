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

public class IfcStructuralConnection extends IfcStructuralItem 
{
 // The property attributes
 IfcBoundaryCondition   appliedCondition;
 // The inverse attributes

 InverseLinksList<IfcRelConnectsStructuralMember> connectsStructuralMembers= new InverseLinksList<IfcRelConnectsStructuralMember>();


 // Getters and setters of properties

 public IfcBoundaryCondition getAppliedCondition() {
   return appliedCondition;

 }
 public void setAppliedCondition(IfcBoundaryCondition value){
   this.appliedCondition=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelConnectsStructuralMember> getConnectsStructuralMembers() {
   return connectsStructuralMembers;

 }
 public void setConnectsStructuralMembers(IfcRelConnectsStructuralMember value){
   this.connectsStructuralMembers.add(value);

 }

}
