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

public class IfcPort extends IfcProduct 
{
 // The inverse attributes

 InverseLinksList<IfcRelConnectsPortToElement> containedIn= new InverseLinksList<IfcRelConnectsPortToElement>();
 InverseLinksList<IfcRelConnectsPorts> connectedFrom= new InverseLinksList<IfcRelConnectsPorts>();
 InverseLinksList<IfcRelConnectsPorts> connectedTo= new InverseLinksList<IfcRelConnectsPorts>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelConnectsPortToElement> getContainedIn() {
   return containedIn;

 }
 public void setContainedIn(IfcRelConnectsPortToElement value){
   this.containedIn.add(value);

 }

 public InverseLinksList<IfcRelConnectsPorts> getConnectedFrom() {
   return connectedFrom;

 }
 public void setConnectedFrom(IfcRelConnectsPorts value){
   this.connectedFrom.add(value);

 }

 public InverseLinksList<IfcRelConnectsPorts> getConnectedTo() {
   return connectedTo;

 }
 public void setConnectedTo(IfcRelConnectsPorts value){
   this.connectedTo.add(value);

 }

}
