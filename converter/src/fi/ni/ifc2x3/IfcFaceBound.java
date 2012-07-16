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

public class IfcFaceBound extends IfcTopologicalRepresentationItem 
{
 // The property attributes
 IfcLoop   bound;
 String orientation;


 // Getters and setters of properties

 public IfcLoop getBound() {
   return bound;

 }
 public void setBound(IfcLoop value){
   this.bound=value;

 }

 public String getOrientation() {
   return orientation;
 }
 public void setOrientation(String value){
   this.orientation=value;

 }

}
