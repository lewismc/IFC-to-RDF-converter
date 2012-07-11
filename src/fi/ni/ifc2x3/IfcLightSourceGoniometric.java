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

public class IfcLightSourceGoniometric extends IfcLightSource 
{
 // The property attributes
 IfcAxis2Placement3D   position;
 IfcColourRgb   colourAppearance;
 Double colourTemperature;
 Double luminousFlux;
 String lightEmissionSource;
IfcLightDistributionDataSourceSelect lightDistributionDataSource;


 // Getters and setters of properties

 public IfcAxis2Placement3D getPosition() {
   return position;

 }
 public void setPosition(IfcAxis2Placement3D value){
   this.position=value;

 }

 public IfcColourRgb getColourAppearance() {
   return colourAppearance;

 }
 public void setColourAppearance(IfcColourRgb value){
   this.colourAppearance=value;

 }

 public Double getColourTemperature() {
   return colourTemperature;
 }
 public void setColourTemperature(String txt){
   Double value = i.toDouble(txt);
   this.colourTemperature=value;

 }

 public Double getLuminousFlux() {
   return luminousFlux;
 }
 public void setLuminousFlux(String txt){
   Double value = i.toDouble(txt);
   this.luminousFlux=value;

 }

 public String getLightEmissionSource() {
   return lightEmissionSource;
 }
 public void setLightEmissionSource(String value){
   this.lightEmissionSource=value;

 }

 public IfcLightDistributionDataSourceSelect getLightDistributionDataSource() {
   return lightDistributionDataSource;
 }
 public void setLightDistributionDataSource(IfcLightDistributionDataSourceSelect value){
   this.lightDistributionDataSource=value;

 }

}
