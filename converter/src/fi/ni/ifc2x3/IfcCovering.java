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

public class IfcCovering extends IfcBuildingElement 
{
 // The property attributes
 String predefinedType;
 // The inverse attributes

 InverseLinksList<IfcRelCoversSpaces> coversSpaces= new InverseLinksList<IfcRelCoversSpaces>();
 InverseLinksList<IfcRelCoversBldgElements> covers= new InverseLinksList<IfcRelCoversBldgElements>();


 // Getters and setters of properties

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelCoversSpaces> getCoversSpaces() {
   return coversSpaces;

 }
 public void setCoversSpaces(IfcRelCoversSpaces value){
   this.coversSpaces.add(value);

 }

 public InverseLinksList<IfcRelCoversBldgElements> getCovers() {
   return covers;

 }
 public void setCovers(IfcRelCoversBldgElements value){
   this.covers.add(value);

 }

}
