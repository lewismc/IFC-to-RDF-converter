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

public class IfcSurfaceStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect
{
 // The property attributes
 String side;
 List<IfcSurfaceStyleElementSelect> styles = new IfcSet<IfcSurfaceStyleElementSelect>();


 // Getters and setters of properties

 public String getSide() {
   return side;
 }
 public void setSide(String value){
   this.side=value;

 }

 public List<IfcSurfaceStyleElementSelect> getStyles() {
   return styles;
 }
 public void setStyles(IfcSurfaceStyleElementSelect value){
   this.styles.add(value);

 }

}
