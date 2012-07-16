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

public class IfcClassification extends Thing 
{
 // The property attributes
 String source;
 String edition;
 IfcCalendarDate   editionDate;
 String name;
 // The inverse attributes

 InverseLinksList<IfcClassificationItem> contains= new InverseLinksList<IfcClassificationItem>();


 // Getters and setters of properties

 public String getSource() {
   return source;
 }
 public void setSource(String value){
   this.source=value;

 }

 public String getEdition() {
   return edition;
 }
 public void setEdition(String value){
   this.edition=value;

 }

 public IfcCalendarDate getEditionDate() {
   return editionDate;

 }
 public void setEditionDate(IfcCalendarDate value){
   this.editionDate=value;

 }

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcClassificationItem> getContains() {
   return contains;

 }
 public void setContains(IfcClassificationItem value){
   this.contains.add(value);

 }

}
