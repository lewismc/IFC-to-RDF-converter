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

public class IfcTextLiteralWithExtent extends IfcTextLiteral 
{
 // The property attributes
 IfcPlanarExtent   extent;
 String boxAlignment;


 // Getters and setters of properties

 public IfcPlanarExtent getExtent() {
   return extent;

 }
 public void setExtent(IfcPlanarExtent value){
   this.extent=value;

 }

 public String getBoxAlignment() {
   return boxAlignment;
 }
 public void setBoxAlignment(String value){
   this.boxAlignment=value;

 }

}
