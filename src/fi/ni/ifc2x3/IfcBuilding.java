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

public class IfcBuilding extends IfcSpatialStructureElement 
{
 // The property attributes
 Double elevationOfRefHeight;
 Double elevationOfTerrain;
 IfcPostalAddress   buildingAddress;


 // Getters and setters of properties

 public Double getElevationOfRefHeight() {
   return elevationOfRefHeight;
 }
 public void setElevationOfRefHeight(String txt){
   Double value = i.toDouble(txt);
   this.elevationOfRefHeight=value;

 }

 public Double getElevationOfTerrain() {
   return elevationOfTerrain;
 }
 public void setElevationOfTerrain(String txt){
   Double value = i.toDouble(txt);
   this.elevationOfTerrain=value;

 }

 public IfcPostalAddress getBuildingAddress() {
   return buildingAddress;

 }
 public void setBuildingAddress(IfcPostalAddress value){
   this.buildingAddress=value;

 }

}
