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

public class IfcPolyline extends IfcBoundedCurve 
{
 // The property attributes
 List<IfcCartesianPoint> points = new IfcList<IfcCartesianPoint>();


 // Getters and setters of properties

 public List<IfcCartesianPoint> getPoints() {
   return points;

 }
 public void setPoints(IfcCartesianPoint value){
   this.points.add(value);

 }

}
