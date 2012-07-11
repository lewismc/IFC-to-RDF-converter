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

public class IfcRegularTimeSeries extends IfcTimeSeries 
{
 // The property attributes
 Double timeStep;
 List<IfcTimeSeriesValue> values = new IfcList<IfcTimeSeriesValue>();


 // Getters and setters of properties

 public Double getTimeStep() {
   return timeStep;
 }
 public void setTimeStep(String txt){
   Double value = i.toDouble(txt);
   this.timeStep=value;

 }

 public List<IfcTimeSeriesValue> getValues() {
   return values;

 }
 public void setValues(IfcTimeSeriesValue value){
   this.values.add(value);

 }

}
