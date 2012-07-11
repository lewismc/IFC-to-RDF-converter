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

public class IfcLine extends IfcCurve 
{
 // The property attributes
 IfcCartesianPoint   pnt;
 IfcVector   dir;


 // Getters and setters of properties

 public IfcCartesianPoint getPnt() {
   return pnt;

 }
 public void setPnt(IfcCartesianPoint value){
   this.pnt=value;

 }

 public IfcVector getDir() {
   return dir;

 }
 public void setDir(IfcVector value){
   this.dir=value;

 }

}
