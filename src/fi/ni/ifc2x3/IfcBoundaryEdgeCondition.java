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

public class IfcBoundaryEdgeCondition extends IfcBoundaryCondition 
{
 // The property attributes
 Double linearStiffnessByLengthX;
 Double linearStiffnessByLengthY;
 Double linearStiffnessByLengthZ;
 Double rotationalStiffnessByLengthX;
 Double rotationalStiffnessByLengthY;
 Double rotationalStiffnessByLengthZ;


 // Getters and setters of properties

 public Double getLinearStiffnessByLengthX() {
   return linearStiffnessByLengthX;
 }
 public void setLinearStiffnessByLengthX(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessByLengthX=value;

 }

 public Double getLinearStiffnessByLengthY() {
   return linearStiffnessByLengthY;
 }
 public void setLinearStiffnessByLengthY(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessByLengthY=value;

 }

 public Double getLinearStiffnessByLengthZ() {
   return linearStiffnessByLengthZ;
 }
 public void setLinearStiffnessByLengthZ(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessByLengthZ=value;

 }

 public Double getRotationalStiffnessByLengthX() {
   return rotationalStiffnessByLengthX;
 }
 public void setRotationalStiffnessByLengthX(String txt){
   Double value = i.toDouble(txt);
   this.rotationalStiffnessByLengthX=value;

 }

 public Double getRotationalStiffnessByLengthY() {
   return rotationalStiffnessByLengthY;
 }
 public void setRotationalStiffnessByLengthY(String txt){
   Double value = i.toDouble(txt);
   this.rotationalStiffnessByLengthY=value;

 }

 public Double getRotationalStiffnessByLengthZ() {
   return rotationalStiffnessByLengthZ;
 }
 public void setRotationalStiffnessByLengthZ(String txt){
   Double value = i.toDouble(txt);
   this.rotationalStiffnessByLengthZ=value;

 }

}
