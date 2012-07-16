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

public class IfcDimensionCurve extends IfcAnnotationCurveOccurrence 
{
 // The inverse attributes

 InverseLinksList<IfcTerminatorSymbol> annotatedBySymbols= new InverseLinksList<IfcTerminatorSymbol>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcTerminatorSymbol> getAnnotatedBySymbols() {
   return annotatedBySymbols;

 }
 public void setAnnotatedBySymbols(IfcTerminatorSymbol value){
   this.annotatedBySymbols.add(value);

 }

}
