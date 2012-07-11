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

public class IfcLightIntensityDistribution extends Thing implements IfcLightDistributionDataSourceSelect
{
 // The property attributes
 String lightDistributionCurve;
 List<IfcLightDistributionData> distributionData = new IfcList<IfcLightDistributionData>();


 // Getters and setters of properties

 public String getLightDistributionCurve() {
   return lightDistributionCurve;
 }
 public void setLightDistributionCurve(String value){
   this.lightDistributionCurve=value;

 }

 public List<IfcLightDistributionData> getDistributionData() {
   return distributionData;

 }
 public void setDistributionData(IfcLightDistributionData value){
   this.distributionData.add(value);

 }

}
