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

public class IfcProject extends IfcObject 
{
 // The property attributes
 String longName;
 String phase;
 List<IfcRepresentationContext> representationContexts = new IfcSet<IfcRepresentationContext>();
 IfcUnitAssignment   unitsInContext;


 // Getters and setters of properties

 public String getLongName() {
   return longName;
 }
 public void setLongName(String value){
   this.longName=value;

 }

 public String getPhase() {
   return phase;
 }
 public void setPhase(String value){
   this.phase=value;

 }

 public List<IfcRepresentationContext> getRepresentationContexts() {
   return representationContexts;

 }
 public void setRepresentationContexts(IfcRepresentationContext value){
   this.representationContexts.add(value);

 }

 public IfcUnitAssignment getUnitsInContext() {
   return unitsInContext;

 }
 public void setUnitsInContext(IfcUnitAssignment value){
   this.unitsInContext=value;

 }

}
