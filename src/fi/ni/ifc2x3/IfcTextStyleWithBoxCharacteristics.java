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

public class IfcTextStyleWithBoxCharacteristics extends Thing implements IfcTextStyleSelect
{
 // The property attributes
 Double boxHeight;
 Double boxWidth;
 Double boxSlantAngle;
 Double boxRotateAngle;
 String characterSpacing;


 // Getters and setters of properties

 public Double getBoxHeight() {
   return boxHeight;
 }
 public void setBoxHeight(String txt){
   Double value = i.toDouble(txt);
   this.boxHeight=value;

 }

 public Double getBoxWidth() {
   return boxWidth;
 }
 public void setBoxWidth(String txt){
   Double value = i.toDouble(txt);
   this.boxWidth=value;

 }

 public Double getBoxSlantAngle() {
   return boxSlantAngle;
 }
 public void setBoxSlantAngle(String txt){
   Double value = i.toDouble(txt);
   this.boxSlantAngle=value;

 }

 public Double getBoxRotateAngle() {
   return boxRotateAngle;
 }
 public void setBoxRotateAngle(String txt){
   Double value = i.toDouble(txt);
   this.boxRotateAngle=value;

 }

 public String getCharacterSpacing() {
   return characterSpacing;
 }
 public void setCharacterSpacing(String value){
   this.characterSpacing=value;

 }

}
