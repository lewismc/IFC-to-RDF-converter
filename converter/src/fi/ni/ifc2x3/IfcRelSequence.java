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

public class IfcRelSequence extends IfcRelConnects 
{
 // The property attributes
 IfcProcess   relatingProcess;
 IfcProcess   relatedProcess;
 Double timeLag;
 String sequenceType;


 // Getters and setters of properties

 public IfcProcess getRelatingProcess() {
   return relatingProcess;

 }
 public void setRelatingProcess(IfcProcess value){
   this.relatingProcess=value;

 }

 public IfcProcess getRelatedProcess() {
   return relatedProcess;

 }
 public void setRelatedProcess(IfcProcess value){
   this.relatedProcess=value;

 }

 public Double getTimeLag() {
   return timeLag;
 }
 public void setTimeLag(String txt){
   Double value = i.toDouble(txt);
   this.timeLag=value;

 }

 public String getSequenceType() {
   return sequenceType;
 }
 public void setSequenceType(String value){
   this.sequenceType=value;

 }

}
