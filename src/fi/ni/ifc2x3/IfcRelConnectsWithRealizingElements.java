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

public class IfcRelConnectsWithRealizingElements extends IfcRelConnectsElements 
{
 // The property attributes
 List<IfcElement> realizingElements = new IfcSet<IfcElement>();
 String connectionType;


 // Getters and setters of properties

 public List<IfcElement> getRealizingElements() {
   return realizingElements;

 }
 public void setRealizingElements(IfcElement value){
   this.realizingElements.add(value);

 }

 public String getConnectionType() {
   return connectionType;
 }
 public void setConnectionType(String value){
   this.connectionType=value;

 }

}
