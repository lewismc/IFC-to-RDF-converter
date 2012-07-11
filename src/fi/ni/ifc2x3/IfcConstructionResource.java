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

public class IfcConstructionResource extends IfcResource 
{
 // The property attributes
 String resourceIdentifier;
 String resourceGroup;
 String resourceConsumption;
 IfcMeasureWithUnit   baseQuantity;


 // Getters and setters of properties

 public String getResourceIdentifier() {
   return resourceIdentifier;
 }
 public void setResourceIdentifier(String value){
   this.resourceIdentifier=value;

 }

 public String getResourceGroup() {
   return resourceGroup;
 }
 public void setResourceGroup(String value){
   this.resourceGroup=value;

 }

 public String getResourceConsumption() {
   return resourceConsumption;
 }
 public void setResourceConsumption(String value){
   this.resourceConsumption=value;

 }

 public IfcMeasureWithUnit getBaseQuantity() {
   return baseQuantity;

 }
 public void setBaseQuantity(IfcMeasureWithUnit value){
   this.baseQuantity=value;

 }

}
