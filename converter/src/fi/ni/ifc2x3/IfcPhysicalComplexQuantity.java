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

public class IfcPhysicalComplexQuantity extends IfcPhysicalQuantity 
{
 // The property attributes
 List<IfcPhysicalQuantity> hasQuantities = new IfcSet<IfcPhysicalQuantity>();
 String discrimination;
 String quality;
 String usage;


 // Getters and setters of properties

 public List<IfcPhysicalQuantity> getHasQuantities() {
   return hasQuantities;

 }
 public void setHasQuantities(IfcPhysicalQuantity value){
   this.hasQuantities.add(value);

 }

 public String getDiscrimination() {
   return discrimination;
 }
 public void setDiscrimination(String value){
   this.discrimination=value;

 }

 public String getQuality() {
   return quality;
 }
 public void setQuality(String value){
   this.quality=value;

 }

 public String getUsage() {
   return usage;
 }
 public void setUsage(String value){
   this.usage=value;

 }

}
