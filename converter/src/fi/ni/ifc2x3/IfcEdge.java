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

public class IfcEdge extends IfcTopologicalRepresentationItem 
{
 // The property attributes
 IfcVertex   edgeStart;
 IfcVertex   edgeEnd;


 // Getters and setters of properties

 public IfcVertex getEdgeStart() {
   return edgeStart;

 }
 public void setEdgeStart(IfcVertex value){
   this.edgeStart=value;

 }

 public IfcVertex getEdgeEnd() {
   return edgeEnd;

 }
 public void setEdgeEnd(IfcVertex value){
   this.edgeEnd=value;

 }

}
