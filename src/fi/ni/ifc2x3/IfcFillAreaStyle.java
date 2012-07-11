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

public class IfcFillAreaStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect
{
 // The property attributes
 List<IfcFillStyleSelect> fillStyles = new IfcSet<IfcFillStyleSelect>();


 // Getters and setters of properties

 public List<IfcFillStyleSelect> getFillStyles() {
   return fillStyles;
 }
 public void setFillStyles(IfcFillStyleSelect value){
   this.fillStyles.add(value);

 }

}
