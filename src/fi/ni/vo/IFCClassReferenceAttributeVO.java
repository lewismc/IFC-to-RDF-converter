package fi.ni.vo;

/**
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0 Unported License.
 * http://creativecommons.org/licenses/by/3.0/
 */

public class IFCClassReferenceAttributeVO {
   AttributeVO avo;
   IFC_X3_VO value;
   
public IFCClassReferenceAttributeVO(AttributeVO avo, IFC_X3_VO value) {
	super();
	this.avo = avo;
	this.value = value;
}
public AttributeVO getAvo() {
	return avo;
}
public void setAvo(AttributeVO avo) {
	this.avo = avo;
}
public IFC_X3_VO getValue() {
	return value;
}
public void setValue(IFC_X3_VO value) {
	this.value = value;
}
   
  
 }
