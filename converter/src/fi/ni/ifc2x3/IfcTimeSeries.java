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

public class IfcTimeSeries extends Thing implements IfcMetricValueSelect, IfcObjectReferenceSelect
{
 // The property attributes
 String name;
 String description;
IfcDateTimeSelect startTime;
IfcDateTimeSelect endTime;
 String timeSeriesDataType;
 String dataOrigin;
 String userDefinedDataOrigin;
IfcUnit unit;
 // The inverse attributes

 InverseLinksList<IfcTimeSeriesReferenceRelationship> documentedBy= new InverseLinksList<IfcTimeSeriesReferenceRelationship>();


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 public IfcDateTimeSelect getStartTime() {
   return startTime;
 }
 public void setStartTime(IfcDateTimeSelect value){
   this.startTime=value;

 }

 public IfcDateTimeSelect getEndTime() {
   return endTime;
 }
 public void setEndTime(IfcDateTimeSelect value){
   this.endTime=value;

 }

 public String getTimeSeriesDataType() {
   return timeSeriesDataType;
 }
 public void setTimeSeriesDataType(String value){
   this.timeSeriesDataType=value;

 }

 public String getDataOrigin() {
   return dataOrigin;
 }
 public void setDataOrigin(String value){
   this.dataOrigin=value;

 }

 public String getUserDefinedDataOrigin() {
   return userDefinedDataOrigin;
 }
 public void setUserDefinedDataOrigin(String value){
   this.userDefinedDataOrigin=value;

 }

 public IfcUnit getUnit() {
   return unit;
 }
 public void setUnit(IfcUnit value){
   this.unit=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcTimeSeriesReferenceRelationship> getDocumentedBy() {
   return documentedBy;

 }
 public void setDocumentedBy(IfcTimeSeriesReferenceRelationship value){
   this.documentedBy.add(value);

 }

}
