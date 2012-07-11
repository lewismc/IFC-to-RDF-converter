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

public class IfcSectionReinforcementProperties extends Thing 
{
 // The property attributes
 Double longitudinalStartPosition;
 Double longitudinalEndPosition;
 Double transversePosition;
 String reinforcementRole;
 IfcSectionProperties   sectionDefinition;
 List<IfcReinforcementBarProperties> crossSectionReinforcementDefinitions = new IfcSet<IfcReinforcementBarProperties>();


 // Getters and setters of properties

 public Double getLongitudinalStartPosition() {
   return longitudinalStartPosition;
 }
 public void setLongitudinalStartPosition(String txt){
   Double value = i.toDouble(txt);
   this.longitudinalStartPosition=value;

 }

 public Double getLongitudinalEndPosition() {
   return longitudinalEndPosition;
 }
 public void setLongitudinalEndPosition(String txt){
   Double value = i.toDouble(txt);
   this.longitudinalEndPosition=value;

 }

 public Double getTransversePosition() {
   return transversePosition;
 }
 public void setTransversePosition(String txt){
   Double value = i.toDouble(txt);
   this.transversePosition=value;

 }

 public String getReinforcementRole() {
   return reinforcementRole;
 }
 public void setReinforcementRole(String value){
   this.reinforcementRole=value;

 }

 public IfcSectionProperties getSectionDefinition() {
   return sectionDefinition;

 }
 public void setSectionDefinition(IfcSectionProperties value){
   this.sectionDefinition=value;

 }

 public List<IfcReinforcementBarProperties> getCrossSectionReinforcementDefinitions() {
   return crossSectionReinforcementDefinitions;

 }
 public void setCrossSectionReinforcementDefinitions(IfcReinforcementBarProperties value){
   this.crossSectionReinforcementDefinitions.add(value);

 }

}
