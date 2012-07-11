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

public class IfcPostalAddress extends IfcAddress 
{
 // The property attributes
 String internalLocation;
 List<String> addressLines = new IfcList<String>();
 String postalBox;
 String town;
 String region;
 String postalCode;
 String country;


 // Getters and setters of properties

 public String getInternalLocation() {
   return internalLocation;
 }
 public void setInternalLocation(String value){
   this.internalLocation=value;

 }

 public List<String> getAddressLines() {
   return addressLines;
 }
 public void setAddressLines(String value){
   this.addressLines.add(value);

 }

 public String getPostalBox() {
   return postalBox;
 }
 public void setPostalBox(String value){
   this.postalBox=value;

 }

 public String getTown() {
   return town;
 }
 public void setTown(String value){
   this.town=value;

 }

 public String getRegion() {
   return region;
 }
 public void setRegion(String value){
   this.region=value;

 }

 public String getPostalCode() {
   return postalCode;
 }
 public void setPostalCode(String value){
   this.postalCode=value;

 }

 public String getCountry() {
   return country;
 }
 public void setCountry(String value){
   this.country=value;

 }

}
