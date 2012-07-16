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

public class IfcAnnotationFillAreaOccurrence extends IfcAnnotationOccurrence 
{
 // The property attributes
 IfcPoint   fillStyleTarget;
 String globalOrLocal;


 // Getters and setters of properties

 public IfcPoint getFillStyleTarget() {
   return fillStyleTarget;

 }
 public void setFillStyleTarget(IfcPoint value){
   this.fillStyleTarget=value;

 }

 public String getGlobalOrLocal() {
   return globalOrLocal;
 }
 public void setGlobalOrLocal(String value){
   this.globalOrLocal=value;

 }

}
