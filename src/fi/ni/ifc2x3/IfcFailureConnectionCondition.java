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

public class IfcFailureConnectionCondition extends IfcStructuralConnectionCondition 
{
 // The property attributes
 Double tensionFailureX;
 Double tensionFailureY;
 Double tensionFailureZ;
 Double compressionFailureX;
 Double compressionFailureY;
 Double compressionFailureZ;


 // Getters and setters of properties

 public Double getTensionFailureX() {
   return tensionFailureX;
 }
 public void setTensionFailureX(String txt){
   Double value = i.toDouble(txt);
   this.tensionFailureX=value;

 }

 public Double getTensionFailureY() {
   return tensionFailureY;
 }
 public void setTensionFailureY(String txt){
   Double value = i.toDouble(txt);
   this.tensionFailureY=value;

 }

 public Double getTensionFailureZ() {
   return tensionFailureZ;
 }
 public void setTensionFailureZ(String txt){
   Double value = i.toDouble(txt);
   this.tensionFailureZ=value;

 }

 public Double getCompressionFailureX() {
   return compressionFailureX;
 }
 public void setCompressionFailureX(String txt){
   Double value = i.toDouble(txt);
   this.compressionFailureX=value;

 }

 public Double getCompressionFailureY() {
   return compressionFailureY;
 }
 public void setCompressionFailureY(String txt){
   Double value = i.toDouble(txt);
   this.compressionFailureY=value;

 }

 public Double getCompressionFailureZ() {
   return compressionFailureZ;
 }
 public void setCompressionFailureZ(String txt){
   Double value = i.toDouble(txt);
   this.compressionFailureZ=value;

 }

}
