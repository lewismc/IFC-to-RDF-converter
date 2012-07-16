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

public class IfcPolyLoop extends IfcLoop 
{
 // The property attributes
 List<IfcCartesianPoint> polygon = new IfcList<IfcCartesianPoint>();


 // Getters and setters of properties

 public List<IfcCartesianPoint> getPolygon() {
   return polygon;

 }
 public void setPolygon(IfcCartesianPoint value){
   this.polygon.add(value);

 }

}
