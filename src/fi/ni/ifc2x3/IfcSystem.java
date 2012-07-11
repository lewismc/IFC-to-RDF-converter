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

public class IfcSystem extends IfcGroup 
{
 // The inverse attributes

 InverseLinksList<IfcRelServicesBuildings> servicesBuildings= new InverseLinksList<IfcRelServicesBuildings>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelServicesBuildings> getServicesBuildings() {
   return servicesBuildings;

 }
 public void setServicesBuildings(IfcRelServicesBuildings value){
   this.servicesBuildings.add(value);

 }

}
