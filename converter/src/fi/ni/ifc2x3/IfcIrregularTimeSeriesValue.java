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

public class IfcIrregularTimeSeriesValue extends Thing 
{
 // The property attributes
IfcDateTimeSelect timeStamp;
 List<String> listValues = new IfcList<String>();


 // Getters and setters of properties

 public IfcDateTimeSelect getTimeStamp() {
   return timeStamp;
 }
 public void setTimeStamp(IfcDateTimeSelect value){
   this.timeStamp=value;

 }

 public List<String> getListValues() {
   return listValues;
 }
 public void setListValues(String value){
   this.listValues.add(value);

 }

}
