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

public class IfcMonetaryUnit extends Thing implements IfcUnit
{
 // The property attributes
 String currency;


 // Getters and setters of properties

 public String getCurrency() {
   return currency;
 }
 public void setCurrency(String value){
   this.currency=value;

 }

}
