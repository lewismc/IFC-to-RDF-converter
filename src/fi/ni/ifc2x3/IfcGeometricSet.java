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

public class IfcGeometricSet extends IfcGeometricRepresentationItem 
{
 // The property attributes
 List<IfcGeometricSetSelect> elements = new IfcSet<IfcGeometricSetSelect>();


 // Getters and setters of properties

 public List<IfcGeometricSetSelect> getElements() {
   return elements;
 }
 public void setElements(IfcGeometricSetSelect value){
   this.elements.add(value);

 }

}
