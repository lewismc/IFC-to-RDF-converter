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

public class IfcOneDirectionRepeatFactor extends IfcGeometricRepresentationItem implements IfcHatchLineDistanceSelect
{
 // The property attributes
 IfcVector   repeatFactor;


 // Getters and setters of properties

 public IfcVector getRepeatFactor() {
   return repeatFactor;

 }
 public void setRepeatFactor(IfcVector value){
   this.repeatFactor=value;

 }

}
