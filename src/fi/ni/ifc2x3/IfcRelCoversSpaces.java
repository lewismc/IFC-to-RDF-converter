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

public class IfcRelCoversSpaces extends IfcRelConnects 
{
 // The property attributes
 IfcSpace   relatedSpace;
 List<IfcCovering> relatedCoverings = new IfcSet<IfcCovering>();


 // Getters and setters of properties

 public IfcSpace getRelatedSpace() {
   return relatedSpace;

 }
 public void setRelatedSpace(IfcSpace value){
   this.relatedSpace=value;

 }

 public List<IfcCovering> getRelatedCoverings() {
   return relatedCoverings;

 }
 public void setRelatedCoverings(IfcCovering value){
   this.relatedCoverings.add(value);

 }

}
