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

public class IfcGeometricRepresentationContext extends IfcRepresentationContext 
{
 // The property attributes
 Long coordinateSpaceDimension;
 Double precision;
IfcAxis2Placement worldCoordinateSystem;
 IfcDirection   trueNorth;
 // The inverse attributes

 InverseLinksList<IfcGeometricRepresentationSubContext> hasSubContexts= new InverseLinksList<IfcGeometricRepresentationSubContext>();


 // Getters and setters of properties

 public Long getCoordinateSpaceDimension() {
   return coordinateSpaceDimension;
 }
 public void setCoordinateSpaceDimension(String txt){
   Long value = i.toLong(txt);
   this.coordinateSpaceDimension=value;

 }

 public Double getPrecision() {
   return precision;
 }
 public void setPrecision(String txt){
   Double value = i.toDouble(txt);
   this.precision=value;

 }

 public IfcAxis2Placement getWorldCoordinateSystem() {
   return worldCoordinateSystem;
 }
 public void setWorldCoordinateSystem(IfcAxis2Placement value){
   this.worldCoordinateSystem=value;

 }

 public IfcDirection getTrueNorth() {
   return trueNorth;

 }
 public void setTrueNorth(IfcDirection value){
   this.trueNorth=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcGeometricRepresentationSubContext> getHasSubContexts() {
   return hasSubContexts;

 }
 public void setHasSubContexts(IfcGeometricRepresentationSubContext value){
   this.hasSubContexts.add(value);

 }

}
