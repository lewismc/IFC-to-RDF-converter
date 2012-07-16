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

public class IfcLibraryReference extends IfcExternalReference implements IfcLibrarySelect
{
 // The inverse attributes

 InverseLinksList<IfcLibraryInformation> referenceIntoLibrary= new InverseLinksList<IfcLibraryInformation>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcLibraryInformation> getReferenceIntoLibrary() {
   return referenceIntoLibrary;

 }
 public void setReferenceIntoLibrary(IfcLibraryInformation value){
   this.referenceIntoLibrary.add(value);

 }

}
