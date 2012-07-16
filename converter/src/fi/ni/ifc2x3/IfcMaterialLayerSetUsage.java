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

public class IfcMaterialLayerSetUsage extends Thing implements IfcMaterialSelect
{
 // The property attributes
 IfcMaterialLayerSet   forLayerSet;
 String layerSetDirection;
 String directionSense;
 Double offsetFromReferenceLine;


 // Getters and setters of properties

 public IfcMaterialLayerSet getForLayerSet() {
   return forLayerSet;

 }
 public void setForLayerSet(IfcMaterialLayerSet value){
   this.forLayerSet=value;

 }

 public String getLayerSetDirection() {
   return layerSetDirection;
 }
 public void setLayerSetDirection(String value){
   this.layerSetDirection=value;

 }

 public String getDirectionSense() {
   return directionSense;
 }
 public void setDirectionSense(String value){
   this.directionSense=value;

 }

 public Double getOffsetFromReferenceLine() {
   return offsetFromReferenceLine;
 }
 public void setOffsetFromReferenceLine(String txt){
   Double value = i.toDouble(txt);
   this.offsetFromReferenceLine=value;

 }

}
