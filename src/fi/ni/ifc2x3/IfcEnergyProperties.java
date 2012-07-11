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

public class IfcEnergyProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 String energySequence;
 String userDefinedEnergySequence;


 // Getters and setters of properties

 public String getEnergySequence() {
   return energySequence;
 }
 public void setEnergySequence(String value){
   this.energySequence=value;

 }

 public String getUserDefinedEnergySequence() {
   return userDefinedEnergySequence;
 }
 public void setUserDefinedEnergySequence(String value){
   this.userDefinedEnergySequence=value;

 }

}
