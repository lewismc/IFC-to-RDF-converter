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

public class IfcConstraintClassificationRelationship extends Thing 
{
 // The property attributes
 IfcConstraint   classifiedConstraint;
 List<IfcClassificationNotationSelect> relatedClassifications = new IfcSet<IfcClassificationNotationSelect>();


 // Getters and setters of properties

 public IfcConstraint getClassifiedConstraint() {
   return classifiedConstraint;

 }
 public void setClassifiedConstraint(IfcConstraint value){
   this.classifiedConstraint=value;

 }

 public List<IfcClassificationNotationSelect> getRelatedClassifications() {
   return relatedClassifications;
 }
 public void setRelatedClassifications(IfcClassificationNotationSelect value){
   this.relatedClassifications.add(value);

 }

}
