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

public class IfcRelConnectsPathElements extends IfcRelConnectsElements 
{
 // The property attributes
 List<Long> relatingPriorities = new IfcList<Long>();
 List<Long> relatedPriorities = new IfcList<Long>();
 String relatedConnectionType;
 String relatingConnectionType;


 // Getters and setters of properties

 public List<Long> getRelatingPriorities() {
   return relatingPriorities;
 }
 public void setRelatingPriorities(String txt){
   List<Long> value = i.toLongList(txt);
   this.relatingPriorities=value;

 }

 public List<Long> getRelatedPriorities() {
   return relatedPriorities;
 }
 public void setRelatedPriorities(String txt){
   List<Long> value = i.toLongList(txt);
   this.relatedPriorities=value;

 }

 public String getRelatedConnectionType() {
   return relatedConnectionType;
 }
 public void setRelatedConnectionType(String value){
   this.relatedConnectionType=value;

 }

 public String getRelatingConnectionType() {
   return relatingConnectionType;
 }
 public void setRelatingConnectionType(String value){
   this.relatingConnectionType=value;

 }

}
