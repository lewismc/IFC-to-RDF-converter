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

public class IfcConnectedFaceSet extends IfcTopologicalRepresentationItem 
{
 // The property attributes
 List<IfcFace> cfsFaces = new IfcSet<IfcFace>();


 // Getters and setters of properties

 public List<IfcFace> getCfsFaces() {
   return cfsFaces;

 }
 public void setCfsFaces(IfcFace value){
   this.cfsFaces.add(value);

 }

}
