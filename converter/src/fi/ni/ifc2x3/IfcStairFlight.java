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

public class IfcStairFlight extends IfcBuildingElement 
{
 // The property attributes
 Long numberOfRiser;
 Long numberOfTreads;
 Double riserHeight;
 Double treadLength;


 // Getters and setters of properties

 public Long getNumberOfRiser() {
   return numberOfRiser;
 }
 public void setNumberOfRiser(String txt){
   Long value = i.toLong(txt);
   this.numberOfRiser=value;

 }

 public Long getNumberOfTreads() {
   return numberOfTreads;
 }
 public void setNumberOfTreads(String txt){
   Long value = i.toLong(txt);
   this.numberOfTreads=value;

 }

 public Double getRiserHeight() {
   return riserHeight;
 }
 public void setRiserHeight(String txt){
   Double value = i.toDouble(txt);
   this.riserHeight=value;

 }

 public Double getTreadLength() {
   return treadLength;
 }
 public void setTreadLength(String txt){
   Double value = i.toDouble(txt);
   this.treadLength=value;

 }

}
