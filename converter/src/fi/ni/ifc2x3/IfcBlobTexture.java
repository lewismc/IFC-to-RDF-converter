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

public class IfcBlobTexture extends IfcSurfaceTexture 
{
 // The property attributes
 String rasterFormat;
 String rasterCode;


 // Getters and setters of properties

 public String getRasterFormat() {
   return rasterFormat;
 }
 public void setRasterFormat(String value){
   this.rasterFormat=value;

 }

 public String getRasterCode() {
   return rasterCode;
 }
 public void setRasterCode(String value){
   this.rasterCode=value;

 }

}
