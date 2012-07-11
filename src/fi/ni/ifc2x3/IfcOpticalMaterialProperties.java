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

public class IfcOpticalMaterialProperties extends IfcMaterialProperties 
{
 // The property attributes
 Double visibleTransmittance;
 Double solarTransmittance;
 Double thermalIrTransmittance;
 Double thermalIrEmissivityBack;
 Double thermalIrEmissivityFront;
 Double visibleReflectanceBack;
 Double visibleReflectanceFront;
 Double solarReflectanceFront;
 Double solarReflectanceBack;


 // Getters and setters of properties

 public Double getVisibleTransmittance() {
   return visibleTransmittance;
 }
 public void setVisibleTransmittance(String txt){
   Double value = i.toDouble(txt);
   this.visibleTransmittance=value;

 }

 public Double getSolarTransmittance() {
   return solarTransmittance;
 }
 public void setSolarTransmittance(String txt){
   Double value = i.toDouble(txt);
   this.solarTransmittance=value;

 }

 public Double getThermalIrTransmittance() {
   return thermalIrTransmittance;
 }
 public void setThermalIrTransmittance(String txt){
   Double value = i.toDouble(txt);
   this.thermalIrTransmittance=value;

 }

 public Double getThermalIrEmissivityBack() {
   return thermalIrEmissivityBack;
 }
 public void setThermalIrEmissivityBack(String txt){
   Double value = i.toDouble(txt);
   this.thermalIrEmissivityBack=value;

 }

 public Double getThermalIrEmissivityFront() {
   return thermalIrEmissivityFront;
 }
 public void setThermalIrEmissivityFront(String txt){
   Double value = i.toDouble(txt);
   this.thermalIrEmissivityFront=value;

 }

 public Double getVisibleReflectanceBack() {
   return visibleReflectanceBack;
 }
 public void setVisibleReflectanceBack(String txt){
   Double value = i.toDouble(txt);
   this.visibleReflectanceBack=value;

 }

 public Double getVisibleReflectanceFront() {
   return visibleReflectanceFront;
 }
 public void setVisibleReflectanceFront(String txt){
   Double value = i.toDouble(txt);
   this.visibleReflectanceFront=value;

 }

 public Double getSolarReflectanceFront() {
   return solarReflectanceFront;
 }
 public void setSolarReflectanceFront(String txt){
   Double value = i.toDouble(txt);
   this.solarReflectanceFront=value;

 }

 public Double getSolarReflectanceBack() {
   return solarReflectanceBack;
 }
 public void setSolarReflectanceBack(String txt){
   Double value = i.toDouble(txt);
   this.solarReflectanceBack=value;

 }

}
