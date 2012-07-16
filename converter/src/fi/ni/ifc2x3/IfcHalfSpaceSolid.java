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

public class IfcHalfSpaceSolid extends IfcGeometricRepresentationItem implements IfcBooleanOperand
{
 // The property attributes
 IfcSurface   baseSurface;
 String agreementFlag;


 // Getters and setters of properties

 public IfcSurface getBaseSurface() {
   return baseSurface;

 }
 public void setBaseSurface(IfcSurface value){
   this.baseSurface=value;

 }

 public String getAgreementFlag() {
   return agreementFlag;
 }
 public void setAgreementFlag(String value){
   this.agreementFlag=value;

 }

}
