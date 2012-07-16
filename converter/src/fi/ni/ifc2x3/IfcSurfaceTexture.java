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

public class IfcSurfaceTexture extends Thing 
{
 // The property attributes
 String repeatS;
 String repeatT;
 String textureType;
 IfcCartesianTransformationOperator2D   textureTransform;


 // Getters and setters of properties

 public String getRepeatS() {
   return repeatS;
 }
 public void setRepeatS(String value){
   this.repeatS=value;

 }

 public String getRepeatT() {
   return repeatT;
 }
 public void setRepeatT(String value){
   this.repeatT=value;

 }

 public String getTextureType() {
   return textureType;
 }
 public void setTextureType(String value){
   this.textureType=value;

 }

 public IfcCartesianTransformationOperator2D getTextureTransform() {
   return textureTransform;

 }
 public void setTextureTransform(IfcCartesianTransformationOperator2D value){
   this.textureTransform=value;

 }

}
