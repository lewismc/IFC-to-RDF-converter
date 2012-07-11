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

public class IfcStructuralAction extends IfcStructuralActivity 
{
 // The property attributes
 String destabilizingLoad;
 IfcStructuralReaction   causedBy;


 // Getters and setters of properties

 public String getDestabilizingLoad() {
   return destabilizingLoad;
 }
 public void setDestabilizingLoad(String value){
   this.destabilizingLoad=value;

 }

 public IfcStructuralReaction getCausedBy() {
   return causedBy;

 }
 public void setCausedBy(IfcStructuralReaction value){
   this.causedBy=value;

 }

}
