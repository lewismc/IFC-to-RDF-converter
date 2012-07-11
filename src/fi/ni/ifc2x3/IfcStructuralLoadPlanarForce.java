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

public class IfcStructuralLoadPlanarForce extends IfcStructuralLoadStatic 
{
 // The property attributes
 Double planarForceX;
 Double planarForceY;
 Double planarForceZ;


 // Getters and setters of properties

 public Double getPlanarForceX() {
   return planarForceX;
 }
 public void setPlanarForceX(String txt){
   Double value = i.toDouble(txt);
   this.planarForceX=value;

 }

 public Double getPlanarForceY() {
   return planarForceY;
 }
 public void setPlanarForceY(String txt){
   Double value = i.toDouble(txt);
   this.planarForceY=value;

 }

 public Double getPlanarForceZ() {
   return planarForceZ;
 }
 public void setPlanarForceZ(String txt){
   Double value = i.toDouble(txt);
   this.planarForceZ=value;

 }

}
