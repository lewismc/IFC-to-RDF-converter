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

public class IfcCartesianTransformationOperator2DnonUniform extends IfcCartesianTransformationOperator2D 
{
 // The property attributes
 Double scale2;


 // Getters and setters of properties

 public Double getScale2() {
   return scale2;
 }
 public void setScale2(String txt){
   Double value = i.toDouble(txt);
   this.scale2=value;

 }

}
