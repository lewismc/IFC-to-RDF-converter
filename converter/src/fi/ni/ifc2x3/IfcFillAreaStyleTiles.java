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

public class IfcFillAreaStyleTiles extends IfcGeometricRepresentationItem implements IfcFillStyleSelect
{
 // The property attributes
 IfcOneDirectionRepeatFactor   tilingPattern;
 List<IfcFillAreaStyleTileShapeSelect> tiles = new IfcSet<IfcFillAreaStyleTileShapeSelect>();
 Double tilingScale;


 // Getters and setters of properties

 public IfcOneDirectionRepeatFactor getTilingPattern() {
   return tilingPattern;

 }
 public void setTilingPattern(IfcOneDirectionRepeatFactor value){
   this.tilingPattern=value;

 }

 public List<IfcFillAreaStyleTileShapeSelect> getTiles() {
   return tiles;
 }
 public void setTiles(IfcFillAreaStyleTileShapeSelect value){
   this.tiles.add(value);

 }

 public Double getTilingScale() {
   return tilingScale;
 }
 public void setTilingScale(String txt){
   Double value = i.toDouble(txt);
   this.tilingScale=value;

 }

}
