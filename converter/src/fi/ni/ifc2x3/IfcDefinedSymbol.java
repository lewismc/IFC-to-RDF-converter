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

public class IfcDefinedSymbol extends IfcGeometricRepresentationItem 
{
 // The property attributes
IfcDefinedSymbolSelect definition;
 IfcCartesianTransformationOperator2D   target;


 // Getters and setters of properties

 public IfcDefinedSymbolSelect getDefinition() {
   return definition;
 }
 public void setDefinition(IfcDefinedSymbolSelect value){
   this.definition=value;

 }

 public IfcCartesianTransformationOperator2D getTarget() {
   return target;

 }
 public void setTarget(IfcCartesianTransformationOperator2D value){
   this.target=value;

 }

}
