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

public class IfcRepresentationItem extends Thing implements IfcLayeredItem
{
 // The inverse attributes

 InverseLinksList<IfcPresentationLayerAssignment> layerAssignments= new InverseLinksList<IfcPresentationLayerAssignment>();
 InverseLinksList<IfcStyledItem> styledByItem= new InverseLinksList<IfcStyledItem>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcPresentationLayerAssignment> getLayerAssignments() {
   return layerAssignments;

 }
 public void setLayerAssignments(IfcPresentationLayerAssignment value){
   this.layerAssignments.add(value);

 }

 public InverseLinksList<IfcStyledItem> getStyledByItem() {
   return styledByItem;

 }
 public void setStyledByItem(IfcStyledItem value){
   this.styledByItem.add(value);

 }

}
