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

public class IfcQuantityArea extends IfcPhysicalSimpleQuantity 
{
 // The property attributes
 Double areaValue;


 // Getters and setters of properties

 public Double getAreaValue() {
   return areaValue;
 }
 public void setAreaValue(String txt){
   Double value = i.toDouble(txt);
   this.areaValue=value;

 }

}
