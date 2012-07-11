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

public class IfcGrid extends IfcProduct 
{
 // The property attributes
 List<IfcGridAxis> uAxes = new IfcList<IfcGridAxis>();
 List<IfcGridAxis> vAxes = new IfcList<IfcGridAxis>();
 List<IfcGridAxis> wAxes = new IfcList<IfcGridAxis>();
 // The inverse attributes

 InverseLinksList<IfcRelContainedInSpatialStructure> containedInStructure= new InverseLinksList<IfcRelContainedInSpatialStructure>();


 // Getters and setters of properties

 public List<IfcGridAxis> getUAxes() {
   return uAxes;

 }
 public void setUAxes(IfcGridAxis value){
   this.uAxes.add(value);

 }

 public List<IfcGridAxis> getVAxes() {
   return vAxes;

 }
 public void setVAxes(IfcGridAxis value){
   this.vAxes.add(value);

 }

 public List<IfcGridAxis> getWAxes() {
   return wAxes;

 }
 public void setWAxes(IfcGridAxis value){
   this.wAxes.add(value);

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelContainedInSpatialStructure> getContainedInStructure() {
   return containedInStructure;

 }
 public void setContainedInStructure(IfcRelContainedInSpatialStructure value){
   this.containedInStructure.add(value);

 }

}
