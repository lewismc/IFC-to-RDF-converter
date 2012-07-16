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

public class IfcRelaxation extends Thing 
{
 // The property attributes
 Double relaxationValue;
 Double initialStress;


 // Getters and setters of properties

 public Double getRelaxationValue() {
   return relaxationValue;
 }
 public void setRelaxationValue(String txt){
   Double value = i.toDouble(txt);
   this.relaxationValue=value;

 }

 public Double getInitialStress() {
   return initialStress;
 }
 public void setInitialStress(String txt){
   Double value = i.toDouble(txt);
   this.initialStress=value;

 }

}
