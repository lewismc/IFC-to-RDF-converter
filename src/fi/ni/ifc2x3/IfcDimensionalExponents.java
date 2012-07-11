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

public class IfcDimensionalExponents extends Thing 
{
 // The property attributes
 Long lengthExponent;
 Long massExponent;
 Long timeExponent;
 Long electricCurrentExponent;
 Long thermodynamicTemperatureExponent;
 Long amountOfSubstanceExponent;
 Long luminousIntensityExponent;


 // Getters and setters of properties

 public Long getLengthExponent() {
   return lengthExponent;
 }
 public void setLengthExponent(String txt){
   Long value = i.toLong(txt);
   this.lengthExponent=value;

 }

 public Long getMassExponent() {
   return massExponent;
 }
 public void setMassExponent(String txt){
   Long value = i.toLong(txt);
   this.massExponent=value;

 }

 public Long getTimeExponent() {
   return timeExponent;
 }
 public void setTimeExponent(String txt){
   Long value = i.toLong(txt);
   this.timeExponent=value;

 }

 public Long getElectricCurrentExponent() {
   return electricCurrentExponent;
 }
 public void setElectricCurrentExponent(String txt){
   Long value = i.toLong(txt);
   this.electricCurrentExponent=value;

 }

 public Long getThermodynamicTemperatureExponent() {
   return thermodynamicTemperatureExponent;
 }
 public void setThermodynamicTemperatureExponent(String txt){
   Long value = i.toLong(txt);
   this.thermodynamicTemperatureExponent=value;

 }

 public Long getAmountOfSubstanceExponent() {
   return amountOfSubstanceExponent;
 }
 public void setAmountOfSubstanceExponent(String txt){
   Long value = i.toLong(txt);
   this.amountOfSubstanceExponent=value;

 }

 public Long getLuminousIntensityExponent() {
   return luminousIntensityExponent;
 }
 public void setLuminousIntensityExponent(String txt){
   Long value = i.toLong(txt);
   this.luminousIntensityExponent=value;

 }

}
