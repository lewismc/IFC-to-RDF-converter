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

public class IfcTableRow extends Thing 
{
 // The property attributes
 List<String> rowCells = new IfcList<String>();
 String isHeading;
 // The inverse attributes

 InverseLinksList<IfcTable> ofTable= new InverseLinksList<IfcTable>();


 // Getters and setters of properties

 public List<String> getRowCells() {
   return rowCells;
 }
 public void setRowCells(String value){
   this.rowCells.add(value);

 }

 public String getIsHeading() {
   return isHeading;
 }
 public void setIsHeading(String value){
   this.isHeading=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcTable> getOfTable() {
   return ofTable;

 }
 public void setOfTable(IfcTable value){
   this.ofTable.add(value);

 }

}
