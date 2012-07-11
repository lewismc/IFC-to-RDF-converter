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

public class IfcDirection extends IfcGeometricRepresentationItem implements IfcOrientationSelect, IfcVectorOrDirection
{
 // The property attributes
 List<Double> directionRatios = new IfcList<Double>();


 // Getters and setters of properties

 public List<Double> getDirectionRatios() {
   return directionRatios;
 }
 public void setDirectionRatios(String txt){
   List<Double> value = i.toDoubleList(txt);
   this.directionRatios=value;

 }

}
