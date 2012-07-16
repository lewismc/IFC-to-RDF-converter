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

public class IfcStructuralLinearActionVarying extends IfcStructuralLinearAction 
{
 // The property attributes
 IfcShapeAspect   varyingAppliedLoadLocation;
 List<IfcStructuralLoad> subsequentAppliedLoads = new IfcList<IfcStructuralLoad>();


 // Getters and setters of properties

 public IfcShapeAspect getVaryingAppliedLoadLocation() {
   return varyingAppliedLoadLocation;

 }
 public void setVaryingAppliedLoadLocation(IfcShapeAspect value){
   this.varyingAppliedLoadLocation=value;

 }

 public List<IfcStructuralLoad> getSubsequentAppliedLoads() {
   return subsequentAppliedLoads;

 }
 public void setSubsequentAppliedLoads(IfcStructuralLoad value){
   this.subsequentAppliedLoads.add(value);

 }

}
