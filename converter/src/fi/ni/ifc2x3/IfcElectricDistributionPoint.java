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

public class IfcElectricDistributionPoint extends IfcFlowController 
{
 // The property attributes
 String distributionPointFunction;
 String userDefinedFunction;


 // Getters and setters of properties

 public String getDistributionPointFunction() {
   return distributionPointFunction;
 }
 public void setDistributionPointFunction(String value){
   this.distributionPointFunction=value;

 }

 public String getUserDefinedFunction() {
   return userDefinedFunction;
 }
 public void setUserDefinedFunction(String value){
   this.userDefinedFunction=value;

 }

}
