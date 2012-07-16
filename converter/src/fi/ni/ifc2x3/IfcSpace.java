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

public class IfcSpace extends IfcSpatialStructureElement 
{
 // The property attributes
 String interiorOrExteriorSpace;
 Double elevationWithFlooring;
 // The inverse attributes

 InverseLinksList<IfcRelCoversSpaces> hasCoverings= new InverseLinksList<IfcRelCoversSpaces>();
 InverseLinksList<IfcRelSpaceBoundary> boundedBy= new InverseLinksList<IfcRelSpaceBoundary>();


 // Getters and setters of properties

 public String getInteriorOrExteriorSpace() {
   return interiorOrExteriorSpace;
 }
 public void setInteriorOrExteriorSpace(String value){
   this.interiorOrExteriorSpace=value;

 }

 public Double getElevationWithFlooring() {
   return elevationWithFlooring;
 }
 public void setElevationWithFlooring(String txt){
   Double value = i.toDouble(txt);
   this.elevationWithFlooring=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelCoversSpaces> getHasCoverings() {
   return hasCoverings;

 }
 public void setHasCoverings(IfcRelCoversSpaces value){
   this.hasCoverings.add(value);

 }

 public InverseLinksList<IfcRelSpaceBoundary> getBoundedBy() {
   return boundedBy;

 }
 public void setBoundedBy(IfcRelSpaceBoundary value){
   this.boundedBy.add(value);

 }

}
