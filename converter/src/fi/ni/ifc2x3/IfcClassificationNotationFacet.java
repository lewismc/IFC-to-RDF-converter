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

public class IfcClassificationNotationFacet extends Thing 
{
 // The property attributes
 String notationValue;


 // Getters and setters of properties

 public String getNotationValue() {
   return notationValue;
 }
 public void setNotationValue(String value){
   this.notationValue=value;

 }

}
