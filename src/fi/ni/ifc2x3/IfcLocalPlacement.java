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

public class IfcLocalPlacement extends IfcObjectPlacement 
{
 // The property attributes
 IfcObjectPlacement   placementRelTo;
IfcAxis2Placement relativePlacement;


 // Getters and setters of properties

 public IfcObjectPlacement getPlacementRelTo() {
   return placementRelTo;

 }
 public void setPlacementRelTo(IfcObjectPlacement value){
   this.placementRelTo=value;

 }

 public IfcAxis2Placement getRelativePlacement() {
   return relativePlacement;
 }
 public void setRelativePlacement(IfcAxis2Placement value){
   this.relativePlacement=value;

 }

}
