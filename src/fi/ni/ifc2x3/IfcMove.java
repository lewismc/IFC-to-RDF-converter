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

public class IfcMove extends IfcTask 
{
 // The property attributes
 IfcSpatialStructureElement   moveFrom;
 IfcSpatialStructureElement   moveTo;
 List<String> punchList = new IfcList<String>();


 // Getters and setters of properties

 public IfcSpatialStructureElement getMoveFrom() {
   return moveFrom;

 }
 public void setMoveFrom(IfcSpatialStructureElement value){
   this.moveFrom=value;

 }

 public IfcSpatialStructureElement getMoveTo() {
   return moveTo;

 }
 public void setMoveTo(IfcSpatialStructureElement value){
   this.moveTo=value;

 }

 public List<String> getPunchList() {
   return punchList;
 }
 public void setPunchList(String value){
   this.punchList.add(value);

 }

}
