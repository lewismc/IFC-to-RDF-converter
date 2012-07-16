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

public class IfcMaterialClassificationRelationship extends Thing 
{
 // The property attributes
 List<IfcClassificationNotationSelect> materialClassifications = new IfcSet<IfcClassificationNotationSelect>();
 IfcMaterial   classifiedMaterial;


 // Getters and setters of properties

 public List<IfcClassificationNotationSelect> getMaterialClassifications() {
   return materialClassifications;
 }
 public void setMaterialClassifications(IfcClassificationNotationSelect value){
   this.materialClassifications.add(value);

 }

 public IfcMaterial getClassifiedMaterial() {
   return classifiedMaterial;

 }
 public void setClassifiedMaterial(IfcMaterial value){
   this.classifiedMaterial=value;

 }

}
