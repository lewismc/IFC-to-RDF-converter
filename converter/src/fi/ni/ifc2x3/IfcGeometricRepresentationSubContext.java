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

public class IfcGeometricRepresentationSubContext extends IfcGeometricRepresentationContext 
{
 // The property attributes
 IfcGeometricRepresentationContext   parentContext;
 Double targetScale;
 String targetView;
 String userDefinedTargetView;


 // Getters and setters of properties

 public IfcGeometricRepresentationContext getParentContext() {
   return parentContext;

 }
 public void setParentContext(IfcGeometricRepresentationContext value){
   this.parentContext=value;

 }

 public Double getTargetScale() {
   return targetScale;
 }
 public void setTargetScale(String txt){
   Double value = i.toDouble(txt);
   this.targetScale=value;

 }

 public String getTargetView() {
   return targetView;
 }
 public void setTargetView(String value){
   this.targetView=value;

 }

 public String getUserDefinedTargetView() {
   return userDefinedTargetView;
 }
 public void setUserDefinedTargetView(String value){
   this.userDefinedTargetView=value;

 }

}
