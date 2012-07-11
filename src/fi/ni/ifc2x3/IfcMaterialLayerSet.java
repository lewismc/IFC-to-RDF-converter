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

public class IfcMaterialLayerSet extends Thing implements IfcMaterialSelect
{
 // The property attributes
 List<IfcMaterialLayer> materialLayers = new IfcList<IfcMaterialLayer>();
 String layerSetName;


 // Getters and setters of properties

 public List<IfcMaterialLayer> getMaterialLayers() {
   return materialLayers;

 }
 public void setMaterialLayers(IfcMaterialLayer value){
   this.materialLayers.add(value);

 }

 public String getLayerSetName() {
   return layerSetName;
 }
 public void setLayerSetName(String value){
   this.layerSetName=value;

 }

}
