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

public class IfcQuantityTime extends IfcPhysicalSimpleQuantity 
{
 // The property attributes
 Double timeValue;


 // Getters and setters of properties

 public Double getTimeValue() {
   return timeValue;
 }
 public void setTimeValue(String txt){
   Double value = i.toDouble(txt);
   this.timeValue=value;

 }

}
