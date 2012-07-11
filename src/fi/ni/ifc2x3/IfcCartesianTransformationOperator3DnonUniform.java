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

public class IfcCartesianTransformationOperator3DnonUniform extends IfcCartesianTransformationOperator3D 
{
 // The property attributes
 Double scale2;
 Double scale3;


 // Getters and setters of properties

 public Double getScale2() {
   return scale2;
 }
 public void setScale2(String txt){
   Double value = i.toDouble(txt);
   this.scale2=value;

 }

 public Double getScale3() {
   return scale3;
 }
 public void setScale3(String txt){
   Double value = i.toDouble(txt);
   this.scale3=value;

 }

}
