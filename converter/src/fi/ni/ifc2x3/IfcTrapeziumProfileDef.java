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

public class IfcTrapeziumProfileDef extends IfcParameterizedProfileDef 
{
 // The property attributes
 Double bottomXDim;
 Double topXDim;
 Double yDim;
 Double topXOffset;


 // Getters and setters of properties

 public Double getBottomXDim() {
   return bottomXDim;
 }
 public void setBottomXDim(String txt){
   Double value = i.toDouble(txt);
   this.bottomXDim=value;

 }

 public Double getTopXDim() {
   return topXDim;
 }
 public void setTopXDim(String txt){
   Double value = i.toDouble(txt);
   this.topXDim=value;

 }

 public Double getYDim() {
   return yDim;
 }
 public void setYDim(String txt){
   Double value = i.toDouble(txt);
   this.yDim=value;

 }

 public Double getTopXOffset() {
   return topXOffset;
 }
 public void setTopXOffset(String txt){
   Double value = i.toDouble(txt);
   this.topXOffset=value;

 }

}
