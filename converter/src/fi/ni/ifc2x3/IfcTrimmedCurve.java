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

public class IfcTrimmedCurve extends IfcBoundedCurve 
{
 // The property attributes
 IfcCurve   basisCurve;
 List<IfcTrimmingSelect> trim1 = new IfcSet<IfcTrimmingSelect>();
 List<IfcTrimmingSelect> trim2 = new IfcSet<IfcTrimmingSelect>();
 String senseAgreement;
 String masterRepresentation;


 // Getters and setters of properties

 public IfcCurve getBasisCurve() {
   return basisCurve;

 }
 public void setBasisCurve(IfcCurve value){
   this.basisCurve=value;

 }

 public List<IfcTrimmingSelect> getTrim1() {
   return trim1;
 }
 public void setTrim1(IfcTrimmingSelect value){
   this.trim1.add(value);

 }

 public List<IfcTrimmingSelect> getTrim2() {
   return trim2;
 }
 public void setTrim2(IfcTrimmingSelect value){
   this.trim2.add(value);

 }

 public String getSenseAgreement() {
   return senseAgreement;
 }
 public void setSenseAgreement(String value){
   this.senseAgreement=value;

 }

 public String getMasterRepresentation() {
   return masterRepresentation;
 }
 public void setMasterRepresentation(String value){
   this.masterRepresentation=value;

 }

}
