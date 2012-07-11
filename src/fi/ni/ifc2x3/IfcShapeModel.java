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

public class IfcShapeModel extends IfcRepresentation 
{
 // The inverse attributes

 InverseLinksList<IfcShapeAspect> ofShapeAspect= new InverseLinksList<IfcShapeAspect>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcShapeAspect> getOfShapeAspect() {
   return ofShapeAspect;

 }
 public void setOfShapeAspect(IfcShapeAspect value){
   this.ofShapeAspect.add(value);

 }

}
