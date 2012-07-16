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

public class IfcStructuralAnalysisModel extends IfcSystem 
{
 // The property attributes
 String predefinedType;
 IfcAxis2Placement3D   orientationOf2DPlane;
 List<IfcStructuralLoadGroup> loadedBy = new IfcSet<IfcStructuralLoadGroup>();
 List<IfcStructuralResultGroup> hasResults = new IfcSet<IfcStructuralResultGroup>();


 // Getters and setters of properties

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

 public IfcAxis2Placement3D getOrientationOf2DPlane() {
   return orientationOf2DPlane;

 }
 public void setOrientationOf2DPlane(IfcAxis2Placement3D value){
   this.orientationOf2DPlane=value;

 }

 public List<IfcStructuralLoadGroup> getLoadedBy() {
   return loadedBy;

 }
 public void setLoadedBy(IfcStructuralLoadGroup value){
   this.loadedBy.add(value);

 }

 public List<IfcStructuralResultGroup> getHasResults() {
   return hasResults;

 }
 public void setHasResults(IfcStructuralResultGroup value){
   this.hasResults.add(value);

 }

}
