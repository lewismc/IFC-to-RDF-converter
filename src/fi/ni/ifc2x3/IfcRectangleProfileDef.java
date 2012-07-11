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

public class IfcRectangleProfileDef extends IfcParameterizedProfileDef 
{
 // The property attributes
 Double xDim;
 Double yDim;


 // Getters and setters of properties

 public Double getXDim() {
   return xDim;
 }
 public void setXDim(String txt){
   Double value = i.toDouble(txt);
   this.xDim=value;

 }

 public Double getYDim() {
   return yDim;
 }
 public void setYDim(String txt){
   Double value = i.toDouble(txt);
   this.yDim=value;

 }

}
