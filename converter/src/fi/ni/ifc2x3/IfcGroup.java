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

public class IfcGroup extends IfcObject 
{
 // The inverse attributes

 InverseLinksList<IfcRelAssignsToGroup> isGroupedBy= new InverseLinksList<IfcRelAssignsToGroup>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelAssignsToGroup> getIsGroupedBy() {
   return isGroupedBy;

 }
 public void setIsGroupedBy(IfcRelAssignsToGroup value){
   this.isGroupedBy.add(value);

 }

}
