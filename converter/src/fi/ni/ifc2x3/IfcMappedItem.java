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

public class IfcMappedItem extends IfcRepresentationItem 
{
 // The property attributes
 IfcRepresentationMap   mappingSource;
 IfcCartesianTransformationOperator   mappingTarget;


 // Getters and setters of properties

 public IfcRepresentationMap getMappingSource() {
   return mappingSource;

 }
 public void setMappingSource(IfcRepresentationMap value){
   this.mappingSource=value;

 }

 public IfcCartesianTransformationOperator getMappingTarget() {
   return mappingTarget;

 }
 public void setMappingTarget(IfcCartesianTransformationOperator value){
   this.mappingTarget=value;

 }

}
