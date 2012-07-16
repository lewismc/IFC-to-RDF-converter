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

public class IfcMechanicalConcreteMaterialProperties extends IfcMechanicalMaterialProperties 
{
 // The property attributes
 Double compressiveStrength;
 Double maxAggregateSize;
 String admixturesDescription;
 String workability;
 Double protectivePoreRatio;
 String waterImpermeability;


 // Getters and setters of properties

 public Double getCompressiveStrength() {
   return compressiveStrength;
 }
 public void setCompressiveStrength(String txt){
   Double value = i.toDouble(txt);
   this.compressiveStrength=value;

 }

 public Double getMaxAggregateSize() {
   return maxAggregateSize;
 }
 public void setMaxAggregateSize(String txt){
   Double value = i.toDouble(txt);
   this.maxAggregateSize=value;

 }

 public String getAdmixturesDescription() {
   return admixturesDescription;
 }
 public void setAdmixturesDescription(String value){
   this.admixturesDescription=value;

 }

 public String getWorkability() {
   return workability;
 }
 public void setWorkability(String value){
   this.workability=value;

 }

 public Double getProtectivePoreRatio() {
   return protectivePoreRatio;
 }
 public void setProtectivePoreRatio(String txt){
   Double value = i.toDouble(txt);
   this.protectivePoreRatio=value;

 }

 public String getWaterImpermeability() {
   return waterImpermeability;
 }
 public void setWaterImpermeability(String value){
   this.waterImpermeability=value;

 }

}
