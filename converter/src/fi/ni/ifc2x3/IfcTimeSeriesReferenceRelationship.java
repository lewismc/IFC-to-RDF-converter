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

public class IfcTimeSeriesReferenceRelationship extends Thing 
{
 // The property attributes
 IfcTimeSeries   referencedTimeSeries;
 List<IfcDocumentSelect> timeSeriesReferences = new IfcSet<IfcDocumentSelect>();


 // Getters and setters of properties

 public IfcTimeSeries getReferencedTimeSeries() {
   return referencedTimeSeries;

 }
 public void setReferencedTimeSeries(IfcTimeSeries value){
   this.referencedTimeSeries=value;

 }

 public List<IfcDocumentSelect> getTimeSeriesReferences() {
   return timeSeriesReferences;
 }
 public void setTimeSeriesReferences(IfcDocumentSelect value){
   this.timeSeriesReferences.add(value);

 }

}
