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

public class IfcFace extends IfcTopologicalRepresentationItem 
{
 // The property attributes
 List<IfcFaceBound> bounds = new IfcSet<IfcFaceBound>();


 // Getters and setters of properties

 public List<IfcFaceBound> getBounds() {
   return bounds;

 }
 public void setBounds(IfcFaceBound value){
   this.bounds.add(value);

 }

}
