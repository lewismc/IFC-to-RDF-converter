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

public class IfcSurfaceOfLinearExtrusion extends IfcSweptSurface 
{
 // The property attributes
 IfcDirection   extrudedDirection;
 Double depth;


 // Getters and setters of properties

 public IfcDirection getExtrudedDirection() {
   return extrudedDirection;

 }
 public void setExtrudedDirection(IfcDirection value){
   this.extrudedDirection=value;

 }

 public Double getDepth() {
   return depth;
 }
 public void setDepth(String txt){
   Double value = i.toDouble(txt);
   this.depth=value;

 }

}
