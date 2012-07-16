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

public class IfcConstraintAggregationRelationship extends Thing 
{
 // The property attributes
 String name;
 String description;
 IfcConstraint   relatingConstraint;
 List<IfcConstraint> relatedConstraints = new IfcList<IfcConstraint>();
 String logicalAggregator;


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 public IfcConstraint getRelatingConstraint() {
   return relatingConstraint;

 }
 public void setRelatingConstraint(IfcConstraint value){
   this.relatingConstraint=value;

 }

 public List<IfcConstraint> getRelatedConstraints() {
   return relatedConstraints;

 }
 public void setRelatedConstraints(IfcConstraint value){
   this.relatedConstraints.add(value);

 }

 public String getLogicalAggregator() {
   return logicalAggregator;
 }
 public void setLogicalAggregator(String value){
   this.logicalAggregator=value;

 }

}
