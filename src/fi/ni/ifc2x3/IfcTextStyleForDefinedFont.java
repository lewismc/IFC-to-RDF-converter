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

public class IfcTextStyleForDefinedFont extends Thing implements IfcCharacterStyleSelect
{
 // The property attributes
IfcColour colour;
IfcColour backgroundColour;


 // Getters and setters of properties

 public IfcColour getColour() {
   return colour;
 }
 public void setColour(IfcColour value){
   this.colour=value;

 }

 public IfcColour getBackgroundColour() {
   return backgroundColour;
 }
 public void setBackgroundColour(IfcColour value){
   this.backgroundColour=value;

 }

}
