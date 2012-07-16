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

public class IfcRelConnectsWithEccentricity extends IfcRelConnectsStructuralMember 
{
 // The property attributes
 IfcConnectionGeometry   connectionConstraint;


 // Getters and setters of properties

 public IfcConnectionGeometry getConnectionConstraint() {
   return connectionConstraint;

 }
 public void setConnectionConstraint(IfcConnectionGeometry value){
   this.connectionConstraint=value;

 }

}
