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

public class IfcPresentationStyleAssignment extends Thing 
{
 // The property attributes
 List<IfcPresentationStyleSelect> styles = new IfcSet<IfcPresentationStyleSelect>();


 // Getters and setters of properties

 public List<IfcPresentationStyleSelect> getStyles() {
   return styles;
 }
 public void setStyles(IfcPresentationStyleSelect value){
   this.styles.add(value);

 }

}
