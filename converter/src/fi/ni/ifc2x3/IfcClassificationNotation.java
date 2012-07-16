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

public class IfcClassificationNotation extends Thing implements IfcClassificationNotationSelect
{
 // The property attributes
 List<IfcClassificationNotationFacet> notationFacets = new IfcSet<IfcClassificationNotationFacet>();


 // Getters and setters of properties

 public List<IfcClassificationNotationFacet> getNotationFacets() {
   return notationFacets;

 }
 public void setNotationFacets(IfcClassificationNotationFacet value){
   this.notationFacets.add(value);

 }

}
