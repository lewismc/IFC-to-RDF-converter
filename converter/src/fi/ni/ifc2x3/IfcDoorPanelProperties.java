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

public class IfcDoorPanelProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 Double panelDepth;
 String panelOperation;
 Double panelWidth;
 String panelPosition;
 IfcShapeAspect   shapeAspectStyle;


 // Getters and setters of properties

 public Double getPanelDepth() {
   return panelDepth;
 }
 public void setPanelDepth(String txt){
   Double value = i.toDouble(txt);
   this.panelDepth=value;

 }

 public String getPanelOperation() {
   return panelOperation;
 }
 public void setPanelOperation(String value){
   this.panelOperation=value;

 }

 public Double getPanelWidth() {
   return panelWidth;
 }
 public void setPanelWidth(String txt){
   Double value = i.toDouble(txt);
   this.panelWidth=value;

 }

 public String getPanelPosition() {
   return panelPosition;
 }
 public void setPanelPosition(String value){
   this.panelPosition=value;

 }

 public IfcShapeAspect getShapeAspectStyle() {
   return shapeAspectStyle;

 }
 public void setShapeAspectStyle(IfcShapeAspect value){
   this.shapeAspectStyle=value;

 }

}
