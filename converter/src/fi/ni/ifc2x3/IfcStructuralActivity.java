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

public class IfcStructuralActivity extends IfcProduct 
{
 // The property attributes
 IfcStructuralLoad   appliedLoad;
 String globalOrLocal;
 // The inverse attributes

 InverseLinksList<IfcRelConnectsStructuralActivity> assignedToStructuralItem= new InverseLinksList<IfcRelConnectsStructuralActivity>();


 // Getters and setters of properties

 public IfcStructuralLoad getAppliedLoad() {
   return appliedLoad;

 }
 public void setAppliedLoad(IfcStructuralLoad value){
   this.appliedLoad=value;

 }

 public String getGlobalOrLocal() {
   return globalOrLocal;
 }
 public void setGlobalOrLocal(String value){
   this.globalOrLocal=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelConnectsStructuralActivity> getAssignedToStructuralItem() {
   return assignedToStructuralItem;

 }
 public void setAssignedToStructuralItem(IfcRelConnectsStructuralActivity value){
   this.assignedToStructuralItem.add(value);

 }

}
