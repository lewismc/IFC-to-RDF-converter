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

public class IfcSite extends IfcSpatialStructureElement 
{
 // The property attributes
 String refLatitude;
 String refLongitude;
 Double refElevation;
 String landTitleNumber;
 IfcPostalAddress   siteAddress;


 // Getters and setters of properties

 public String getRefLatitude() {
   return refLatitude;
 }
 public void setRefLatitude(String value){
   this.refLatitude=value;

 }

 public String getRefLongitude() {
   return refLongitude;
 }
 public void setRefLongitude(String value){
   this.refLongitude=value;

 }

 public Double getRefElevation() {
   return refElevation;
 }
 public void setRefElevation(String txt){
   Double value = i.toDouble(txt);
   this.refElevation=value;

 }

 public String getLandTitleNumber() {
   return landTitleNumber;
 }
 public void setLandTitleNumber(String value){
   this.landTitleNumber=value;

 }

 public IfcPostalAddress getSiteAddress() {
   return siteAddress;

 }
 public void setSiteAddress(IfcPostalAddress value){
   this.siteAddress=value;

 }

}
