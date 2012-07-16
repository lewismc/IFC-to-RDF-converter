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

public class IfcStructuralLoadSingleDisplacement extends IfcStructuralLoadStatic 
{
 // The property attributes
 Double displacementX;
 Double displacementY;
 Double displacementZ;
 Double rotationalDisplacementRX;
 Double rotationalDisplacementRY;
 Double rotationalDisplacementRZ;


 // Getters and setters of properties

 public Double getDisplacementX() {
   return displacementX;
 }
 public void setDisplacementX(String txt){
   Double value = i.toDouble(txt);
   this.displacementX=value;

 }

 public Double getDisplacementY() {
   return displacementY;
 }
 public void setDisplacementY(String txt){
   Double value = i.toDouble(txt);
   this.displacementY=value;

 }

 public Double getDisplacementZ() {
   return displacementZ;
 }
 public void setDisplacementZ(String txt){
   Double value = i.toDouble(txt);
   this.displacementZ=value;

 }

 public Double getRotationalDisplacementRX() {
   return rotationalDisplacementRX;
 }
 public void setRotationalDisplacementRX(String txt){
   Double value = i.toDouble(txt);
   this.rotationalDisplacementRX=value;

 }

 public Double getRotationalDisplacementRY() {
   return rotationalDisplacementRY;
 }
 public void setRotationalDisplacementRY(String txt){
   Double value = i.toDouble(txt);
   this.rotationalDisplacementRY=value;

 }

 public Double getRotationalDisplacementRZ() {
   return rotationalDisplacementRZ;
 }
 public void setRotationalDisplacementRZ(String txt){
   Double value = i.toDouble(txt);
   this.rotationalDisplacementRZ=value;

 }

}
