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

public class IfcTypeProduct extends IfcTypeObject 
{
 // The property attributes
 List<IfcRepresentationMap> representationMaps = new IfcList<IfcRepresentationMap>();
 String tag;


 // Getters and setters of properties

 public List<IfcRepresentationMap> getRepresentationMaps() {
   return representationMaps;

 }
 public void setRepresentationMaps(IfcRepresentationMap value){
   this.representationMaps.add(value);

 }

 public String getTag() {
   return tag;
 }
 public void setTag(String value){
   this.tag=value;

 }

}
