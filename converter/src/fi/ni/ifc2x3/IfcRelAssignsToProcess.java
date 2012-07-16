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

public class IfcRelAssignsToProcess extends IfcRelAssigns 
{
 // The property attributes
 IfcProcess   relatingProcess;
 IfcMeasureWithUnit   quantityInProcess;


 // Getters and setters of properties

 public IfcProcess getRelatingProcess() {
   return relatingProcess;

 }
 public void setRelatingProcess(IfcProcess value){
   this.relatingProcess=value;

 }

 public IfcMeasureWithUnit getQuantityInProcess() {
   return quantityInProcess;

 }
 public void setQuantityInProcess(IfcMeasureWithUnit value){
   this.quantityInProcess=value;

 }

}
