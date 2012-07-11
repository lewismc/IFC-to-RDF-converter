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

public class IfcTextureMap extends IfcTextureCoordinate 
{
 // The property attributes
 List<IfcVertexBasedTextureMap> textureMaps = new IfcSet<IfcVertexBasedTextureMap>();


 // Getters and setters of properties

 public List<IfcVertexBasedTextureMap> getTextureMaps() {
   return textureMaps;

 }
 public void setTextureMaps(IfcVertexBasedTextureMap value){
   this.textureMaps.add(value);

 }

}
