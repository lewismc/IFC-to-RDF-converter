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

public class IfcLightSourceSpot extends IfcLightSourcePositional 
{
 // The property attributes
 IfcDirection   orientation;
 Double concentrationExponent;
 Double spreadAngle;
 Double beamWidthAngle;


 // Getters and setters of properties

 public IfcDirection getOrientation() {
   return orientation;

 }
 public void setOrientation(IfcDirection value){
   this.orientation=value;

 }

 public Double getConcentrationExponent() {
   return concentrationExponent;
 }
 public void setConcentrationExponent(String txt){
   Double value = i.toDouble(txt);
   this.concentrationExponent=value;

 }

 public Double getSpreadAngle() {
   return spreadAngle;
 }
 public void setSpreadAngle(String txt){
   Double value = i.toDouble(txt);
   this.spreadAngle=value;

 }

 public Double getBeamWidthAngle() {
   return beamWidthAngle;
 }
 public void setBeamWidthAngle(String txt){
   Double value = i.toDouble(txt);
   this.beamWidthAngle=value;

 }

}
