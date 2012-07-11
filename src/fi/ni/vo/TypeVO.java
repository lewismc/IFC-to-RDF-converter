/*
 * @author Jyrki Oraskari
 * 
 * @license This work is licensed under a Creative Commons Attribution 3.0
 * Unported License.
 * http://creativecommons.org/licenses/by/3.0/
 */
package fi.ni.vo;

import java.util.LinkedList;
import java.util.List;

public class TypeVO {
  private String name;
  private String primarytype;
  private List<String>    selected_entities=new LinkedList<String>();
  private List<String>    enum_entities=new LinkedList<String>();
  
public TypeVO(String name) {
	super();
	this.name = name;
	this.primarytype = name;
}



public TypeVO(String name, String primarytype) {
    super();
    this.name = name;
    this.primarytype = primarytype;
}



public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public List<String> getSelected_entities() {
    return selected_entities;
}

public void setSelected_entities(List<String> selected_entities) {
    this.selected_entities = selected_entities;
}

public String getPrimarytype() {
    return primarytype;
}

public void setPrimarytype(String primarytype) {
    this.primarytype = primarytype;
}



public List<String> getEnum_entities() {
    return enum_entities;
}



public void setEnum_entities(List<String> enum_entities) {
    this.enum_entities = enum_entities;
}



}
