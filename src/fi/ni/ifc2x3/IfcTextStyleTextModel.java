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

public class IfcTextStyleTextModel extends Thing implements IfcTextStyleSelect
{
 // The property attributes
 String textIndent;
 String textAlign;
 String textDecoration;
 String letterSpacing;
 String wordSpacing;
 String textTransform;
 String lineHeight;


 // Getters and setters of properties

 public String getTextIndent() {
   return textIndent;
 }
 public void setTextIndent(String value){
   this.textIndent=value;

 }

 public String getTextAlign() {
   return textAlign;
 }
 public void setTextAlign(String value){
   this.textAlign=value;

 }

 public String getTextDecoration() {
   return textDecoration;
 }
 public void setTextDecoration(String value){
   this.textDecoration=value;

 }

 public String getLetterSpacing() {
   return letterSpacing;
 }
 public void setLetterSpacing(String value){
   this.letterSpacing=value;

 }

 public String getWordSpacing() {
   return wordSpacing;
 }
 public void setWordSpacing(String value){
   this.wordSpacing=value;

 }

 public String getTextTransform() {
   return textTransform;
 }
 public void setTextTransform(String value){
   this.textTransform=value;

 }

 public String getLineHeight() {
   return lineHeight;
 }
 public void setLineHeight(String value){
   this.lineHeight=value;

 }

}
