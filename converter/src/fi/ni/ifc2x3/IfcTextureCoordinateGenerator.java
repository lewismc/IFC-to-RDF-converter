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

public class IfcTextureCoordinateGenerator extends IfcTextureCoordinate 
{
 // The property attributes
 String mode;
 List<String> parameter = new IfcList<String>();


 // Getters and setters of properties

 public String getMode() {
   return mode;
 }
 public void setMode(String value){
   this.mode=value;

 }

 public List<String> getParameter() {
   return parameter;
 }
 public void setParameter(String value){
   this.parameter.add(value);

 }

}
