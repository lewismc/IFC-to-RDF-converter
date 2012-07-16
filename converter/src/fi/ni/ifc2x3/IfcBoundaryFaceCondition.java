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

public class IfcBoundaryFaceCondition extends IfcBoundaryCondition 
{
 // The property attributes
 Double linearStiffnessByAreaX;
 Double linearStiffnessByAreaY;
 Double linearStiffnessByAreaZ;


 // Getters and setters of properties

 public Double getLinearStiffnessByAreaX() {
   return linearStiffnessByAreaX;
 }
 public void setLinearStiffnessByAreaX(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessByAreaX=value;

 }

 public Double getLinearStiffnessByAreaY() {
   return linearStiffnessByAreaY;
 }
 public void setLinearStiffnessByAreaY(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessByAreaY=value;

 }

 public Double getLinearStiffnessByAreaZ() {
   return linearStiffnessByAreaZ;
 }
 public void setLinearStiffnessByAreaZ(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessByAreaZ=value;

 }

}
