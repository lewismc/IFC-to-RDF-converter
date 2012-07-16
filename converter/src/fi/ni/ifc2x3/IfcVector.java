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

public class IfcVector extends IfcGeometricRepresentationItem implements IfcVectorOrDirection
{
 // The property attributes
 IfcDirection   orientation;
 Double magnitude;


 // Getters and setters of properties

 public IfcDirection getOrientation() {
   return orientation;

 }
 public void setOrientation(IfcDirection value){
   this.orientation=value;

 }

 public Double getMagnitude() {
   return magnitude;
 }
 public void setMagnitude(String txt){
   Double value = i.toDouble(txt);
   this.magnitude=value;

 }

}
