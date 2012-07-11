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

public class IfcConnectionPointGeometry extends IfcConnectionGeometry 
{
 // The property attributes
IfcPointOrVertexPoint pointOnRelatingElement;
IfcPointOrVertexPoint pointOnRelatedElement;


 // Getters and setters of properties

 public IfcPointOrVertexPoint getPointOnRelatingElement() {
   return pointOnRelatingElement;
 }
 public void setPointOnRelatingElement(IfcPointOrVertexPoint value){
   this.pointOnRelatingElement=value;

 }

 public IfcPointOrVertexPoint getPointOnRelatedElement() {
   return pointOnRelatedElement;
 }
 public void setPointOnRelatedElement(IfcPointOrVertexPoint value){
   this.pointOnRelatedElement=value;

 }

}
