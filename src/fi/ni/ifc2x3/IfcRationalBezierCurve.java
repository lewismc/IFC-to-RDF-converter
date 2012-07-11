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

public class IfcRationalBezierCurve extends IfcBezierCurve 
{
 // The property attributes
 List<Double> weightsData = new IfcList<Double>();


 // Getters and setters of properties

 public List<Double> getWeightsData() {
   return weightsData;
 }
 public void setWeightsData(String txt){
   List<Double> value = i.toDoubleList(txt);
   this.weightsData=value;

 }

}
