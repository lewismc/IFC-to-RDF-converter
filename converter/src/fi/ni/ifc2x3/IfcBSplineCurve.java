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

public class IfcBSplineCurve extends IfcBoundedCurve 
{
 // The property attributes
 Long degree;
 List<IfcCartesianPoint> controlPointsList = new IfcList<IfcCartesianPoint>();
 String curveForm;
 String closedCurve;
 String selfIntersect;


 // Getters and setters of properties

 public Long getDegree() {
   return degree;
 }
 public void setDegree(String txt){
   Long value = i.toLong(txt);
   this.degree=value;

 }

 public List<IfcCartesianPoint> getControlPointsList() {
   return controlPointsList;

 }
 public void setControlPointsList(IfcCartesianPoint value){
   this.controlPointsList.add(value);

 }

 public String getCurveForm() {
   return curveForm;
 }
 public void setCurveForm(String value){
   this.curveForm=value;

 }

 public String getClosedCurve() {
   return closedCurve;
 }
 public void setClosedCurve(String value){
   this.closedCurve=value;

 }

 public String getSelfIntersect() {
   return selfIntersect;
 }
 public void setSelfIntersect(String value){
   this.selfIntersect=value;

 }

}
