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

public class IfcFeatureElementAddition extends IfcFeatureElement 
{
 // The inverse attributes

 InverseLinksList<IfcRelProjectsElement> projectsElements= new InverseLinksList<IfcRelProjectsElement>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelProjectsElement> getProjectsElements() {
   return projectsElements;

 }
 public void setProjectsElements(IfcRelProjectsElement value){
   this.projectsElements.add(value);

 }

}
