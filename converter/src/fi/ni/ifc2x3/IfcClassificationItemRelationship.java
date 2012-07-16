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

public class IfcClassificationItemRelationship extends Thing 
{
 // The property attributes
 IfcClassificationItem   relatingItem;
 List<IfcClassificationItem> relatedItems = new IfcSet<IfcClassificationItem>();


 // Getters and setters of properties

 public IfcClassificationItem getRelatingItem() {
   return relatingItem;

 }
 public void setRelatingItem(IfcClassificationItem value){
   this.relatingItem=value;

 }

 public List<IfcClassificationItem> getRelatedItems() {
   return relatedItems;

 }
 public void setRelatedItems(IfcClassificationItem value){
   this.relatedItems.add(value);

 }

}
