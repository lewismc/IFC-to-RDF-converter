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

public class IfcPixelTexture extends IfcSurfaceTexture 
{
 // The property attributes
 Long width;
 Long height;
 Long colourComponents;
 List<String> pixel = new IfcList<String>();


 // Getters and setters of properties

 public Long getWidth() {
   return width;
 }
 public void setWidth(String txt){
   Long value = i.toLong(txt);
   this.width=value;

 }

 public Long getHeight() {
   return height;
 }
 public void setHeight(String txt){
   Long value = i.toLong(txt);
   this.height=value;

 }

 public Long getColourComponents() {
   return colourComponents;
 }
 public void setColourComponents(String txt){
   Long value = i.toLong(txt);
   this.colourComponents=value;

 }

 public List<String> getPixel() {
   return pixel;
 }
 public void setPixel(String value){
   this.pixel.add(value);

 }

}
