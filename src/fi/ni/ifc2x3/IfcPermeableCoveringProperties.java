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

public class IfcPermeableCoveringProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 String operationType;
 String panelPosition;
 Double frameDepth;
 Double frameThickness;
 IfcShapeAspect   shapeAspectStyle;


 // Getters and setters of properties

 public String getOperationType() {
   return operationType;
 }
 public void setOperationType(String value){
   this.operationType=value;

 }

 public String getPanelPosition() {
   return panelPosition;
 }
 public void setPanelPosition(String value){
   this.panelPosition=value;

 }

 public Double getFrameDepth() {
   return frameDepth;
 }
 public void setFrameDepth(String txt){
   Double value = i.toDouble(txt);
   this.frameDepth=value;

 }

 public Double getFrameThickness() {
   return frameThickness;
 }
 public void setFrameThickness(String txt){
   Double value = i.toDouble(txt);
   this.frameThickness=value;

 }

 public IfcShapeAspect getShapeAspectStyle() {
   return shapeAspectStyle;

 }
 public void setShapeAspectStyle(IfcShapeAspect value){
   this.shapeAspectStyle=value;

 }

}
