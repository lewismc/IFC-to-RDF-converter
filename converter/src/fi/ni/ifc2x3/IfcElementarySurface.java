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

public class IfcElementarySurface extends IfcSurface 
{
 // The property attributes
 IfcAxis2Placement3D   position;


 // Getters and setters of properties

 public IfcAxis2Placement3D getPosition() {
   return position;

 }
 public void setPosition(IfcAxis2Placement3D value){
   this.position=value;

 }

}
