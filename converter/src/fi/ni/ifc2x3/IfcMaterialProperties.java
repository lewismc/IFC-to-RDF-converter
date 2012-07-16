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

public class IfcMaterialProperties extends Thing 
{
 // The property attributes
 IfcMaterial   material;


 // Getters and setters of properties

 public IfcMaterial getMaterial() {
   return material;

 }
 public void setMaterial(IfcMaterial value){
   this.material=value;

 }

}
