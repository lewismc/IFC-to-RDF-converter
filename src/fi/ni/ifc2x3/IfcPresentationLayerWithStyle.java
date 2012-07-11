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

public class IfcPresentationLayerWithStyle extends IfcPresentationLayerAssignment 
{
 // The property attributes
 String layerOn;
 String layerFrozen;
 String layerBlocked;
 List<IfcPresentationStyleSelect> layerStyles = new IfcSet<IfcPresentationStyleSelect>();


 // Getters and setters of properties

 public String getLayerOn() {
   return layerOn;
 }
 public void setLayerOn(String value){
   this.layerOn=value;

 }

 public String getLayerFrozen() {
   return layerFrozen;
 }
 public void setLayerFrozen(String value){
   this.layerFrozen=value;

 }

 public String getLayerBlocked() {
   return layerBlocked;
 }
 public void setLayerBlocked(String value){
   this.layerBlocked=value;

 }

 public List<IfcPresentationStyleSelect> getLayerStyles() {
   return layerStyles;
 }
 public void setLayerStyles(IfcPresentationStyleSelect value){
   this.layerStyles.add(value);

 }

}
