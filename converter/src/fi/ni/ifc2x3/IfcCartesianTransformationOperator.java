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

public class IfcCartesianTransformationOperator extends IfcGeometricRepresentationItem 
{
 // The property attributes
 IfcDirection   axis1;
 IfcDirection   axis2;
 IfcCartesianPoint   localOrigin;
 Double scale;


 // Getters and setters of properties

 public IfcDirection getAxis1() {
   return axis1;

 }
 public void setAxis1(IfcDirection value){
   this.axis1=value;

 }

 public IfcDirection getAxis2() {
   return axis2;

 }
 public void setAxis2(IfcDirection value){
   this.axis2=value;

 }

 public IfcCartesianPoint getLocalOrigin() {
   return localOrigin;

 }
 public void setLocalOrigin(IfcCartesianPoint value){
   this.localOrigin=value;

 }

 public Double getScale() {
   return scale;
 }
 public void setScale(String txt){
   Double value = i.toDouble(txt);
   this.scale=value;

 }

}
