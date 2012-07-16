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

public class IfcDoorStyle extends IfcTypeProduct 
{
 // The property attributes
 String operationType;
 String constructionType;
 String parameterTakesPrecedence;
 String sizeable;


 // Getters and setters of properties

 public String getOperationType() {
   return operationType;
 }
 public void setOperationType(String value){
   this.operationType=value;

 }

 public String getConstructionType() {
   return constructionType;
 }
 public void setConstructionType(String value){
   this.constructionType=value;

 }

 public String getParameterTakesPrecedence() {
   return parameterTakesPrecedence;
 }
 public void setParameterTakesPrecedence(String value){
   this.parameterTakesPrecedence=value;

 }

 public String getSizeable() {
   return sizeable;
 }
 public void setSizeable(String value){
   this.sizeable=value;

 }

}
