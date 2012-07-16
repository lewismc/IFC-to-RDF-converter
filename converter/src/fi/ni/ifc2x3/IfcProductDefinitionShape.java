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

public class IfcProductDefinitionShape extends IfcProductRepresentation 
{
 // The inverse attributes

 InverseLinksList<IfcProduct> shapeOfProduct= new InverseLinksList<IfcProduct>();
 InverseLinksList<IfcShapeAspect> hasShapeAspects= new InverseLinksList<IfcShapeAspect>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcProduct> getShapeOfProduct() {
   return shapeOfProduct;

 }
 public void setShapeOfProduct(IfcProduct value){
   this.shapeOfProduct.add(value);

 }

 public InverseLinksList<IfcShapeAspect> getHasShapeAspects() {
   return hasShapeAspects;

 }
 public void setHasShapeAspects(IfcShapeAspect value){
   this.hasShapeAspects.add(value);

 }

}
