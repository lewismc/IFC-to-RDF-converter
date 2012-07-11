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

public class IfcBoundingBox extends IfcGeometricRepresentationItem 
{
 // The property attributes
 IfcCartesianPoint   corner;
 Double xDim;
 Double yDim;
 Double zDim;


 // Getters and setters of properties

 public IfcCartesianPoint getCorner() {
   return corner;

 }
 public void setCorner(IfcCartesianPoint value){
   this.corner=value;

 }

 public Double getXDim() {
   return xDim;
 }
 public void setXDim(String txt){
   Double value = i.toDouble(txt);
   this.xDim=value;

 }

 public Double getYDim() {
   return yDim;
 }
 public void setYDim(String txt){
   Double value = i.toDouble(txt);
   this.yDim=value;

 }

 public Double getZDim() {
   return zDim;
 }
 public void setZDim(String txt){
   Double value = i.toDouble(txt);
   this.zDim=value;

 }

}
