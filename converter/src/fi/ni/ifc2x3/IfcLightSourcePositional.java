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

public class IfcLightSourcePositional extends IfcLightSource 
{
 // The property attributes
 IfcCartesianPoint   position;
 Double radius;
 Double constantAttenuation;
 Double distanceAttenuation;
 Double quadricAttenuation;


 // Getters and setters of properties

 public IfcCartesianPoint getPosition() {
   return position;

 }
 public void setPosition(IfcCartesianPoint value){
   this.position=value;

 }

 public Double getRadius() {
   return radius;
 }
 public void setRadius(String txt){
   Double value = i.toDouble(txt);
   this.radius=value;

 }

 public Double getConstantAttenuation() {
   return constantAttenuation;
 }
 public void setConstantAttenuation(String txt){
   Double value = i.toDouble(txt);
   this.constantAttenuation=value;

 }

 public Double getDistanceAttenuation() {
   return distanceAttenuation;
 }
 public void setDistanceAttenuation(String txt){
   Double value = i.toDouble(txt);
   this.distanceAttenuation=value;

 }

 public Double getQuadricAttenuation() {
   return quadricAttenuation;
 }
 public void setQuadricAttenuation(String txt){
   Double value = i.toDouble(txt);
   this.quadricAttenuation=value;

 }

}
