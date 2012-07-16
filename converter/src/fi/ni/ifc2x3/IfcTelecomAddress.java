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

public class IfcTelecomAddress extends IfcAddress 
{
 // The property attributes
 List<String> telephoneNumbers = new IfcList<String>();
 List<String> facsimileNumbers = new IfcList<String>();
 String pagerNumber;
 List<String> electronicMailAddresses = new IfcList<String>();
 String wWWHomePageURL;


 // Getters and setters of properties

 public List<String> getTelephoneNumbers() {
   return telephoneNumbers;
 }
 public void setTelephoneNumbers(String value){
   this.telephoneNumbers.add(value);

 }

 public List<String> getFacsimileNumbers() {
   return facsimileNumbers;
 }
 public void setFacsimileNumbers(String value){
   this.facsimileNumbers.add(value);

 }

 public String getPagerNumber() {
   return pagerNumber;
 }
 public void setPagerNumber(String value){
   this.pagerNumber=value;

 }

 public List<String> getElectronicMailAddresses() {
   return electronicMailAddresses;
 }
 public void setElectronicMailAddresses(String value){
   this.electronicMailAddresses.add(value);

 }

 public String getWWWHomePageURL() {
   return wWWHomePageURL;
 }
 public void setWWWHomePageURL(String value){
   this.wWWHomePageURL=value;

 }

}
