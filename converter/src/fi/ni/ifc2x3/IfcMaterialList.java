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

public class IfcMaterialList extends Thing implements IfcMaterialSelect, IfcObjectReferenceSelect
{
 // The property attributes
 List<IfcMaterial> materials = new IfcList<IfcMaterial>();


 // Getters and setters of properties

 public List<IfcMaterial> getMaterials() {
   return materials;

 }
 public void setMaterials(IfcMaterial value){
   this.materials.add(value);

 }

}
