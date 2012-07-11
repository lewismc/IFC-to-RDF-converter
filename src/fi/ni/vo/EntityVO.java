package fi.ni.vo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0 Unported License.
 * http://creativecommons.org/licenses/by/3.0/
 */

public class EntityVO {
	private String name;	
	private List<AttributeVO> attributes=new LinkedList<AttributeVO>();
	private List<InverseVO> inverses=new LinkedList<InverseVO>();
	private List<String> interfaces=new LinkedList<String>();

	private List<AttributeVO> derived_attribute_list=new LinkedList<AttributeVO>();
	private List<InverseVO> derived_inverse_list=new LinkedList<InverseVO>();
	
	public List<InverseVO> getDerived_inverse_list() {
		return derived_inverse_list;
	}
	public void setDerived_inverse_list(List<InverseVO> derived_inverse_list) {
		this.derived_inverse_list = derived_inverse_list;
	}
	
	public List<InverseVO> getInverses() {
		return inverses;
	}
	public void setInverses(List<InverseVO> inverses) {
		this.inverses = inverses;
	}
	public List<AttributeVO> getDerived_attribute_list() {
		return derived_attribute_list;
	}
	public void setDerived_attribute_list(List<AttributeVO> derived_list) {
		this.derived_attribute_list = derived_list;
	}
	String superclass;
	
	public EntityVO(String name) {
		super();
		this.name = name;
	}
	public EntityVO() {
	    // TODO Auto-generated constructor stub
	}
	public List<AttributeVO> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<AttributeVO> attributes) {
		this.attributes = attributes;
	}
	public String getSuperclass() {
		return superclass;
	}
	public void setSuperclass(String superclass) {
		this.superclass = superclass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getInterfaces() {
	    return interfaces;
	}
	public void setInterfaces(List<String> interfaces) {
	    this.interfaces = interfaces;
	}
	@Override
	public String toString() {
	    return "EntityVO [name=" + name + ", attributes=" + attributes + ", inverses=" + inverses + ", interfaces=" + interfaces + ", derived_attribute_list=" + derived_attribute_list
		    + ", derived_inverse_list=" + derived_inverse_list + ", superclass=" + superclass + "]";
	}
	
	
	
}
