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

public class IfcVertexBasedTextureMap extends Thing 
{
 // The property attributes
 List<IfcTextureVertex> textureVertices = new IfcList<IfcTextureVertex>();
 List<IfcCartesianPoint> texturePoints = new IfcList<IfcCartesianPoint>();


 // Getters and setters of properties

 public List<IfcTextureVertex> getTextureVertices() {
   return textureVertices;

 }
 public void setTextureVertices(IfcTextureVertex value){
   this.textureVertices.add(value);

 }

 public List<IfcCartesianPoint> getTexturePoints() {
   return texturePoints;

 }
 public void setTexturePoints(IfcCartesianPoint value){
   this.texturePoints.add(value);

 }

}
