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

public class IfcOpeningElement extends IfcFeatureElementSubtraction 
{
 // The inverse attributes

 InverseLinksList<IfcRelFillsElement> hasFillings= new InverseLinksList<IfcRelFillsElement>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelFillsElement> getHasFillings() {
   return hasFillings;

 }
 public void setHasFillings(IfcRelFillsElement value){
   this.hasFillings.add(value);

 }

}
