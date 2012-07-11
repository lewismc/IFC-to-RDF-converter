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

public class IfcStructuralSurfaceMemberVarying extends IfcStructuralSurfaceMember 
{
 // The property attributes
 List<Double> subsequentThickness = new IfcList<Double>();
 IfcShapeAspect   varyingThicknessLocation;


 // Getters and setters of properties

 public List<Double> getSubsequentThickness() {
   return subsequentThickness;
 }
 public void setSubsequentThickness(String txt){
   List<Double> value = i.toDoubleList(txt);
   this.subsequentThickness=value;

 }

 public IfcShapeAspect getVaryingThicknessLocation() {
   return varyingThicknessLocation;

 }
 public void setVaryingThicknessLocation(IfcShapeAspect value){
   this.varyingThicknessLocation=value;

 }

}
