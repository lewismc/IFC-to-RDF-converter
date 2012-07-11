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

public class IfcRelConnectsStructuralActivity extends IfcRelConnects 
{
 // The property attributes
IfcStructuralActivityAssignmentSelect relatingElement;
 IfcStructuralActivity   relatedStructuralActivity;


 // Getters and setters of properties

 public IfcStructuralActivityAssignmentSelect getRelatingElement() {
   return relatingElement;
 }
 public void setRelatingElement(IfcStructuralActivityAssignmentSelect value){
   this.relatingElement=value;

 }

 public IfcStructuralActivity getRelatedStructuralActivity() {
   return relatedStructuralActivity;

 }
 public void setRelatedStructuralActivity(IfcStructuralActivity value){
   this.relatedStructuralActivity=value;

 }

}
