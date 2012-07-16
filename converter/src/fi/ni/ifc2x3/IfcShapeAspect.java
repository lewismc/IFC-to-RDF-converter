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

public class IfcShapeAspect extends Thing 
{
 // The property attributes
 List<IfcShapeModel> shapeRepresentations = new IfcList<IfcShapeModel>();
 String name;
 String description;
 String productDefinitional;
 IfcProductDefinitionShape   partOfProductDefinitionShape;


 // Getters and setters of properties

 public List<IfcShapeModel> getShapeRepresentations() {
   return shapeRepresentations;

 }
 public void setShapeRepresentations(IfcShapeModel value){
   this.shapeRepresentations.add(value);

 }

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

 public String getProductDefinitional() {
   return productDefinitional;
 }
 public void setProductDefinitional(String value){
   this.productDefinitional=value;

 }

 public IfcProductDefinitionShape getPartOfProductDefinitionShape() {
   return partOfProductDefinitionShape;

 }
 public void setPartOfProductDefinitionShape(IfcProductDefinitionShape value){
   this.partOfProductDefinitionShape=value;

 }

}
