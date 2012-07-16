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

public class IfcShellBasedSurfaceModel extends IfcGeometricRepresentationItem 
{
 // The property attributes
 List<IfcShell> sbsmBoundary = new IfcSet<IfcShell>();


 // Getters and setters of properties

 public List<IfcShell> getSbsmBoundary() {
   return sbsmBoundary;
 }
 public void setSbsmBoundary(IfcShell value){
   this.sbsmBoundary.add(value);

 }

}
