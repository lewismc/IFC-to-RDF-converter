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

public class IfcSlippageConnectionCondition extends IfcStructuralConnectionCondition 
{
 // The property attributes
 Double slippageX;
 Double slippageY;
 Double slippageZ;


 // Getters and setters of properties

 public Double getSlippageX() {
   return slippageX;
 }
 public void setSlippageX(String txt){
   Double value = i.toDouble(txt);
   this.slippageX=value;

 }

 public Double getSlippageY() {
   return slippageY;
 }
 public void setSlippageY(String txt){
   Double value = i.toDouble(txt);
   this.slippageY=value;

 }

 public Double getSlippageZ() {
   return slippageZ;
 }
 public void setSlippageZ(String txt){
   Double value = i.toDouble(txt);
   this.slippageZ=value;

 }

}
