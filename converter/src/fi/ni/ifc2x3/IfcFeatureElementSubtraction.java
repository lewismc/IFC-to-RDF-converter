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

public class IfcFeatureElementSubtraction extends IfcFeatureElement 
{
 // The inverse attributes

 InverseLinksList<IfcRelVoidsElement> voidsElements= new InverseLinksList<IfcRelVoidsElement>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelVoidsElement> getVoidsElements() {
   return voidsElements;

 }
 public void setVoidsElements(IfcRelVoidsElement value){
   this.voidsElements.add(value);

 }

}
