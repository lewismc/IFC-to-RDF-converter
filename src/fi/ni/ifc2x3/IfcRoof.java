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

public class IfcRoof extends IfcBuildingElement 
{
 // The property attributes
 String shapeType;


 // Getters and setters of properties

 public String getShapeType() {
   return shapeType;
 }
 public void setShapeType(String value){
   this.shapeType=value;

 }

}
