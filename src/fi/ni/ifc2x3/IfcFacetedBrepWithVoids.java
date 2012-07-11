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

public class IfcFacetedBrepWithVoids extends IfcManifoldSolidBrep 
{
 // The property attributes
 List<IfcClosedShell> voids = new IfcSet<IfcClosedShell>();


 // Getters and setters of properties

 public List<IfcClosedShell> getVoids() {
   return voids;

 }
 public void setVoids(IfcClosedShell value){
   this.voids.add(value);

 }

}
