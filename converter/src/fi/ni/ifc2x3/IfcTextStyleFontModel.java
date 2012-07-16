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

public class IfcTextStyleFontModel extends IfcPreDefinedTextFont 
{
 // The property attributes
 List<String> fontFamily = new IfcList<String>();
 String fontStyle;
 String fontVariant;
 String fontWeight;
 String fontSize;


 // Getters and setters of properties

 public List<String> getFontFamily() {
   return fontFamily;
 }
 public void setFontFamily(String value){
   this.fontFamily.add(value);

 }

 public String getFontStyle() {
   return fontStyle;
 }
 public void setFontStyle(String value){
   this.fontStyle=value;

 }

 public String getFontVariant() {
   return fontVariant;
 }
 public void setFontVariant(String value){
   this.fontVariant=value;

 }

 public String getFontWeight() {
   return fontWeight;
 }
 public void setFontWeight(String value){
   this.fontWeight=value;

 }

 public String getFontSize() {
   return fontSize;
 }
 public void setFontSize(String value){
   this.fontSize=value;

 }

}
