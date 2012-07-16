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

public class IfcRelAssociates extends IfcRelationship 
{
 // The property attributes
 List<IfcRoot> relatedObjects = new IfcSet<IfcRoot>();


 // Getters and setters of properties

 public List<IfcRoot> getRelatedObjects() {
   return relatedObjects;

 }
 public void setRelatedObjects(IfcRoot value){
   this.relatedObjects.add(value);

 }

}
