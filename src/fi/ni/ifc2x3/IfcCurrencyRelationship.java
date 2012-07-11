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

public class IfcCurrencyRelationship extends Thing 
{
 // The property attributes
 IfcMonetaryUnit   relatingMonetaryUnit;
 IfcMonetaryUnit   relatedMonetaryUnit;
 Double exchangeRate;
 IfcDateAndTime   rateDateTime;
 IfcLibraryInformation   rateSource;


 // Getters and setters of properties

 public IfcMonetaryUnit getRelatingMonetaryUnit() {
   return relatingMonetaryUnit;

 }
 public void setRelatingMonetaryUnit(IfcMonetaryUnit value){
   this.relatingMonetaryUnit=value;

 }

 public IfcMonetaryUnit getRelatedMonetaryUnit() {
   return relatedMonetaryUnit;

 }
 public void setRelatedMonetaryUnit(IfcMonetaryUnit value){
   this.relatedMonetaryUnit=value;

 }

 public Double getExchangeRate() {
   return exchangeRate;
 }
 public void setExchangeRate(String txt){
   Double value = i.toDouble(txt);
   this.exchangeRate=value;

 }

 public IfcDateAndTime getRateDateTime() {
   return rateDateTime;

 }
 public void setRateDateTime(IfcDateAndTime value){
   this.rateDateTime=value;

 }

 public IfcLibraryInformation getRateSource() {
   return rateSource;

 }
 public void setRateSource(IfcLibraryInformation value){
   this.rateSource=value;

 }

}
