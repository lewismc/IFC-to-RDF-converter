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

public class IfcRevolvedAreaSolid extends IfcSweptAreaSolid 
{
 // The property attributes
 IfcAxis1Placement   axis;
 Double angle;


 // Getters and setters of properties

 public IfcAxis1Placement getAxis() {
   return axis;

 }
 public void setAxis(IfcAxis1Placement value){
   this.axis=value;

 }

 public Double getAngle() {
   return angle;
 }
 public void setAngle(String txt){
   Double value = i.toDouble(txt);
   this.angle=value;

 }

}
