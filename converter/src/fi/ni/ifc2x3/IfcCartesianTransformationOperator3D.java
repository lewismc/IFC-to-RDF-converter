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

public class IfcCartesianTransformationOperator3D extends IfcCartesianTransformationOperator 
{
 // The property attributes
 IfcDirection   axis3;


 // Getters and setters of properties

 public IfcDirection getAxis3() {
   return axis3;

 }
 public void setAxis3(IfcDirection value){
   this.axis3=value;

 }

}
