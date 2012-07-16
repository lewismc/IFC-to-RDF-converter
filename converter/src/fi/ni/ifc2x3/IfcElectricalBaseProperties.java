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

public class IfcElectricalBaseProperties extends IfcEnergyProperties 
{
 // The property attributes
 String electricCurrentType;
 Double inputVoltage;
 Double inputFrequency;
 Double fullLoadCurrent;
 Double minimumCircuitCurrent;
 Double maximumPowerInput;
 Double ratedPowerInput;
 Long inputPhase;


 // Getters and setters of properties

 public String getElectricCurrentType() {
   return electricCurrentType;
 }
 public void setElectricCurrentType(String value){
   this.electricCurrentType=value;

 }

 public Double getInputVoltage() {
   return inputVoltage;
 }
 public void setInputVoltage(String txt){
   Double value = i.toDouble(txt);
   this.inputVoltage=value;

 }

 public Double getInputFrequency() {
   return inputFrequency;
 }
 public void setInputFrequency(String txt){
   Double value = i.toDouble(txt);
   this.inputFrequency=value;

 }

 public Double getFullLoadCurrent() {
   return fullLoadCurrent;
 }
 public void setFullLoadCurrent(String txt){
   Double value = i.toDouble(txt);
   this.fullLoadCurrent=value;

 }

 public Double getMinimumCircuitCurrent() {
   return minimumCircuitCurrent;
 }
 public void setMinimumCircuitCurrent(String txt){
   Double value = i.toDouble(txt);
   this.minimumCircuitCurrent=value;

 }

 public Double getMaximumPowerInput() {
   return maximumPowerInput;
 }
 public void setMaximumPowerInput(String txt){
   Double value = i.toDouble(txt);
   this.maximumPowerInput=value;

 }

 public Double getRatedPowerInput() {
   return ratedPowerInput;
 }
 public void setRatedPowerInput(String txt){
   Double value = i.toDouble(txt);
   this.ratedPowerInput=value;

 }

 public Long getInputPhase() {
   return inputPhase;
 }
 public void setInputPhase(String txt){
   Long value = i.toLong(txt);
   this.inputPhase=value;

 }

}
