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

public class IfcGridAxis extends Thing 
{
 // The property attributes
 String axisTag;
 IfcCurve   axisCurve;
 String sameSense;
 // The inverse attributes

 InverseLinksList<IfcGrid> partOfW= new InverseLinksList<IfcGrid>();
 InverseLinksList<IfcGrid> partOfV= new InverseLinksList<IfcGrid>();
 InverseLinksList<IfcGrid> partOfU= new InverseLinksList<IfcGrid>();
 InverseLinksList<IfcVirtualGridIntersection> hasIntersections= new InverseLinksList<IfcVirtualGridIntersection>();


 // Getters and setters of properties

 public String getAxisTag() {
   return axisTag;
 }
 public void setAxisTag(String value){
   this.axisTag=value;

 }

 public IfcCurve getAxisCurve() {
   return axisCurve;

 }
 public void setAxisCurve(IfcCurve value){
   this.axisCurve=value;

 }

 public String getSameSense() {
   return sameSense;
 }
 public void setSameSense(String value){
   this.sameSense=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcGrid> getPartOfW() {
   return partOfW;

 }
 public void setPartOfW(IfcGrid value){
   this.partOfW.add(value);

 }

 public InverseLinksList<IfcGrid> getPartOfV() {
   return partOfV;

 }
 public void setPartOfV(IfcGrid value){
   this.partOfV.add(value);

 }

 public InverseLinksList<IfcGrid> getPartOfU() {
   return partOfU;

 }
 public void setPartOfU(IfcGrid value){
   this.partOfU.add(value);

 }

 public InverseLinksList<IfcVirtualGridIntersection> getHasIntersections() {
   return hasIntersections;

 }
 public void setHasIntersections(IfcVirtualGridIntersection value){
   this.hasIntersections.add(value);

 }

}
