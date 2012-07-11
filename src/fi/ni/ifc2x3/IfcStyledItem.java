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

public class IfcStyledItem extends IfcRepresentationItem 
{
 // The property attributes
 IfcRepresentationItem   item;
 List<IfcPresentationStyleAssignment> styles = new IfcSet<IfcPresentationStyleAssignment>();
 String name;


 // Getters and setters of properties

 public IfcRepresentationItem getItem() {
   return item;

 }
 public void setItem(IfcRepresentationItem value){
   this.item=value;

 }

 public List<IfcPresentationStyleAssignment> getStyles() {
   return styles;

 }
 public void setStyles(IfcPresentationStyleAssignment value){
   this.styles.add(value);

 }

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

}
