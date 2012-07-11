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

public class IfcArbitraryProfileDefWithVoids extends IfcArbitraryClosedProfileDef 
{
 // The property attributes
 List<IfcCurve> innerCurves = new IfcSet<IfcCurve>();


 // Getters and setters of properties

 public List<IfcCurve> getInnerCurves() {
   return innerCurves;

 }
 public void setInnerCurves(IfcCurve value){
   this.innerCurves.add(value);

 }

}
