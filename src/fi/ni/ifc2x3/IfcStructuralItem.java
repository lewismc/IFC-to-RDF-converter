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

public class IfcStructuralItem extends IfcProduct implements IfcStructuralActivityAssignmentSelect
{
 // The inverse attributes

 InverseLinksList<IfcRelConnectsStructuralActivity> assignedStructuralActivity= new InverseLinksList<IfcRelConnectsStructuralActivity>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelConnectsStructuralActivity> getAssignedStructuralActivity() {
   return assignedStructuralActivity;

 }
 public void setAssignedStructuralActivity(IfcRelConnectsStructuralActivity value){
   this.assignedStructuralActivity.add(value);

 }

}
