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

public class IfcFaceBasedSurfaceModel extends IfcGeometricRepresentationItem implements IfcSurfaceOrFaceSurface
{
 // The property attributes
 List<IfcConnectedFaceSet> fbsmFaces = new IfcSet<IfcConnectedFaceSet>();


 // Getters and setters of properties

 public List<IfcConnectedFaceSet> getFbsmFaces() {
   return fbsmFaces;

 }
 public void setFbsmFaces(IfcConnectedFaceSet value){
   this.fbsmFaces.add(value);

 }

}
