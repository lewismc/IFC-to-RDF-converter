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

public class IfcOffsetCurve3D extends IfcCurve 
{
 // The property attributes
 IfcCurve   basisCurve;
 Double distance;
 String selfIntersect;
 IfcDirection   refDirection;


 // Getters and setters of properties

 public IfcCurve getBasisCurve() {
   return basisCurve;

 }
 public void setBasisCurve(IfcCurve value){
   this.basisCurve=value;

 }

 public Double getDistance() {
   return distance;
 }
 public void setDistance(String txt){
   Double value = i.toDouble(txt);
   this.distance=value;

 }

 public String getSelfIntersect() {
   return selfIntersect;
 }
 public void setSelfIntersect(String value){
   this.selfIntersect=value;

 }

 public IfcDirection getRefDirection() {
   return refDirection;

 }
 public void setRefDirection(IfcDirection value){
   this.refDirection=value;

 }

}
