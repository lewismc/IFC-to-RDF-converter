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

public class IfcClassificationItem extends Thing 
{
 // The property attributes
 IfcClassificationNotationFacet   notation;
 IfcClassification   itemOf;
 String title;
 // The inverse attributes

 InverseLinksList<IfcClassificationItemRelationship> isClassifiedItemIn= new InverseLinksList<IfcClassificationItemRelationship>();
 InverseLinksList<IfcClassificationItemRelationship> isClassifyingItemIn= new InverseLinksList<IfcClassificationItemRelationship>();


 // Getters and setters of properties

 public IfcClassificationNotationFacet getNotation() {
   return notation;

 }
 public void setNotation(IfcClassificationNotationFacet value){
   this.notation=value;

 }

 public IfcClassification getItemOf() {
   return itemOf;

 }
 public void setItemOf(IfcClassification value){
   this.itemOf=value;

 }

 public String getTitle() {
   return title;
 }
 public void setTitle(String value){
   this.title=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcClassificationItemRelationship> getIsClassifiedItemIn() {
   return isClassifiedItemIn;

 }
 public void setIsClassifiedItemIn(IfcClassificationItemRelationship value){
   this.isClassifiedItemIn.add(value);

 }

 public InverseLinksList<IfcClassificationItemRelationship> getIsClassifyingItemIn() {
   return isClassifyingItemIn;

 }
 public void setIsClassifyingItemIn(IfcClassificationItemRelationship value){
   this.isClassifyingItemIn.add(value);

 }

}
