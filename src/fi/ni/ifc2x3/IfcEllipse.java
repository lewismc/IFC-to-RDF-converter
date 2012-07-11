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

public class IfcEllipse extends IfcConic 
{
 // The property attributes
 Double semiAxis1;
 Double semiAxis2;


 // Getters and setters of properties

 public Double getSemiAxis1() {
   return semiAxis1;
 }
 public void setSemiAxis1(String txt){
   Double value = i.toDouble(txt);
   this.semiAxis1=value;

 }

 public Double getSemiAxis2() {
   return semiAxis2;
 }
 public void setSemiAxis2(String txt){
   Double value = i.toDouble(txt);
   this.semiAxis2=value;

 }

}
