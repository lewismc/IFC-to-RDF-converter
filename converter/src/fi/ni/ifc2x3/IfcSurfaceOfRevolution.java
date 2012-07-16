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

public class IfcSurfaceOfRevolution extends IfcSweptSurface 
{
 // The property attributes
 IfcAxis1Placement   axisPosition;


 // Getters and setters of properties

 public IfcAxis1Placement getAxisPosition() {
   return axisPosition;

 }
 public void setAxisPosition(IfcAxis1Placement value){
   this.axisPosition=value;

 }

}
