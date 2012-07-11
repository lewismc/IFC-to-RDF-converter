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

public class IfcControl extends IfcObject 
{
 // The inverse attributes

 InverseLinksList<IfcRelAssignsToControl> controls= new InverseLinksList<IfcRelAssignsToControl>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelAssignsToControl> getControls() {
   return controls;

 }
 public void setControls(IfcRelAssignsToControl value){
   this.controls.add(value);

 }

}
