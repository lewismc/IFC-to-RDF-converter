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

public class IfcMaterialLayer extends Thing implements IfcMaterialSelect, IfcObjectReferenceSelect
{
 // The property attributes
 IfcMaterial   material;
 Double layerThickness;
 String isVentilated;
 // The inverse attributes

 InverseLinksList<IfcMaterialLayerSet> toMaterialLayerSet= new InverseLinksList<IfcMaterialLayerSet>();


 // Getters and setters of properties

 public IfcMaterial getMaterial() {
   return material;

 }
 public void setMaterial(IfcMaterial value){
   this.material=value;

 }

 public Double getLayerThickness() {
   return layerThickness;
 }
 public void setLayerThickness(String txt){
   Double value = i.toDouble(txt);
   this.layerThickness=value;

 }

 public String getIsVentilated() {
   return isVentilated;
 }
 public void setIsVentilated(String value){
   this.isVentilated=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcMaterialLayerSet> getToMaterialLayerSet() {
   return toMaterialLayerSet;

 }
 public void setToMaterialLayerSet(IfcMaterialLayerSet value){
   this.toMaterialLayerSet.add(value);

 }

}
