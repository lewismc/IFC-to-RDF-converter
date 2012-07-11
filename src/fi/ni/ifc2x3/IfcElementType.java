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

public class IfcElementType extends IfcTypeProduct 
{
 // The property attributes
 String elementType;


 // Getters and setters of properties

 public String getElementType() {
   return elementType;
 }
 public void setElementType(String value){
   this.elementType=value;

 }

}
