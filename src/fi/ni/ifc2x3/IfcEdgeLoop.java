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

public class IfcEdgeLoop extends IfcLoop 
{
 // The property attributes
 List<IfcOrientedEdge> edgeList = new IfcList<IfcOrientedEdge>();


 // Getters and setters of properties

 public List<IfcOrientedEdge> getEdgeList() {
   return edgeList;

 }
 public void setEdgeList(IfcOrientedEdge value){
   this.edgeList.add(value);

 }

}
