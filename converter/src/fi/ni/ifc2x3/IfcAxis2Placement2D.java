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

public class IfcAxis2Placement2D extends IfcPlacement implements IfcAxis2Placement
{
 // The property attributes
 IfcDirection   refDirection;


 // Getters and setters of properties

 public IfcDirection getRefDirection() {
   return refDirection;

 }
 public void setRefDirection(IfcDirection value){
   this.refDirection=value;

 }

}
