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

public class IfcServiceLife extends IfcControl 
{
 // The property attributes
 String serviceLifeType;
 Double serviceLifeDuration;


 // Getters and setters of properties

 public String getServiceLifeType() {
   return serviceLifeType;
 }
 public void setServiceLifeType(String value){
   this.serviceLifeType=value;

 }

 public Double getServiceLifeDuration() {
   return serviceLifeDuration;
 }
 public void setServiceLifeDuration(String txt){
   Double value = i.toDouble(txt);
   this.serviceLifeDuration=value;

 }

}
