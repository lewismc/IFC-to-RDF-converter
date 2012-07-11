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

public class IfcArbitraryOpenProfileDef extends IfcProfileDef 
{
 // The property attributes
 IfcBoundedCurve   curve;


 // Getters and setters of properties

 public IfcBoundedCurve getCurve() {
   return curve;

 }
 public void setCurve(IfcBoundedCurve value){
   this.curve=value;

 }

}
