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

public class IfcReinforcementDefinitionProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 String definitionType;
 List<IfcSectionReinforcementProperties> reinforcementSectionDefinitions = new IfcList<IfcSectionReinforcementProperties>();


 // Getters and setters of properties

 public String getDefinitionType() {
   return definitionType;
 }
 public void setDefinitionType(String value){
   this.definitionType=value;

 }

 public List<IfcSectionReinforcementProperties> getReinforcementSectionDefinitions() {
   return reinforcementSectionDefinitions;

 }
 public void setReinforcementSectionDefinitions(IfcSectionReinforcementProperties value){
   this.reinforcementSectionDefinitions.add(value);

 }

}
