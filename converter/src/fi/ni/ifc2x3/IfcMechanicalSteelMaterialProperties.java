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

public class IfcMechanicalSteelMaterialProperties extends IfcMechanicalMaterialProperties 
{
 // The property attributes
 Double yieldStress;
 Double ultimateStress;
 Double ultimateStrain;
 Double hardeningModule;
 Double proportionalStress;
 Double plasticStrain;
 List<IfcRelaxation> relaxations = new IfcSet<IfcRelaxation>();


 // Getters and setters of properties

 public Double getYieldStress() {
   return yieldStress;
 }
 public void setYieldStress(String txt){
   Double value = i.toDouble(txt);
   this.yieldStress=value;

 }

 public Double getUltimateStress() {
   return ultimateStress;
 }
 public void setUltimateStress(String txt){
   Double value = i.toDouble(txt);
   this.ultimateStress=value;

 }

 public Double getUltimateStrain() {
   return ultimateStrain;
 }
 public void setUltimateStrain(String txt){
   Double value = i.toDouble(txt);
   this.ultimateStrain=value;

 }

 public Double getHardeningModule() {
   return hardeningModule;
 }
 public void setHardeningModule(String txt){
   Double value = i.toDouble(txt);
   this.hardeningModule=value;

 }

 public Double getProportionalStress() {
   return proportionalStress;
 }
 public void setProportionalStress(String txt){
   Double value = i.toDouble(txt);
   this.proportionalStress=value;

 }

 public Double getPlasticStrain() {
   return plasticStrain;
 }
 public void setPlasticStrain(String txt){
   Double value = i.toDouble(txt);
   this.plasticStrain=value;

 }

 public List<IfcRelaxation> getRelaxations() {
   return relaxations;

 }
 public void setRelaxations(IfcRelaxation value){
   this.relaxations.add(value);

 }

}
