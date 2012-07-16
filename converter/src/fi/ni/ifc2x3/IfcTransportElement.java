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

public class IfcTransportElement extends IfcElement 
{
 // The property attributes
 String operationType;
 Double capacityByWeight;
 String capacityByNumber;


 // Getters and setters of properties

 public String getOperationType() {
   return operationType;
 }
 public void setOperationType(String value){
   this.operationType=value;

 }

 public Double getCapacityByWeight() {
   return capacityByWeight;
 }
 public void setCapacityByWeight(String txt){
   Double value = i.toDouble(txt);
   this.capacityByWeight=value;

 }

 public String getCapacityByNumber() {
   return capacityByNumber;
 }
 public void setCapacityByNumber(String value){
   this.capacityByNumber=value;

 }

}
