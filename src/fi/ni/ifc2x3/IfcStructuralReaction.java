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

public class IfcStructuralReaction extends IfcStructuralActivity 
{
 // The inverse attributes

 InverseLinksList<IfcStructuralAction> causes= new InverseLinksList<IfcStructuralAction>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcStructuralAction> getCauses() {
   return causes;

 }
 public void setCauses(IfcStructuralAction value){
   this.causes.add(value);

 }

}
