/*
 * @author Jyrki Oraskari
 * 
 * @license This work is licensed under a Creative Commons Attribution 3.0
 * Unported License.
 * http://creativecommons.org/licenses/by/3.0/
 */
package fi.ni.vo;

public class InverseVO {
  private String name;
  private String ifc_class;
  private String property;
  private boolean set=false;

  boolean unique=false;
  boolean one_valued=false;
  
  

public InverseVO(String name, String ifc_class, String property, boolean set, boolean one_valued) {
    super();
    this.name = name;
    this.ifc_class = ifc_class;
    this.property = property;
    this.set = set;
    this.one_valued = one_valued;
}




public boolean isSet() {
    return set;
}


public void setSet(boolean set) {
    this.set = set;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIfc_class() {
	return ifc_class;
}
public void setIfc_class(String ifc_class) {
	this.ifc_class = ifc_class;
}
public String getProperty() {
	return property;
}
public void setProperty(String property) {
	this.property = property;
}


public boolean isUnique() {
    return unique;
}



public void setUnique(boolean unique) {
    this.unique = unique;
}





public boolean isOne_valued() {
    return one_valued;
}



public void setOne_valued(boolean one_valued) {
    this.one_valued = one_valued;
}



@Override
public String toString() {
    return "InverseVO [name=" + name + ", ifc_class=" + ifc_class + ", property=" + property + ", set=" + set + "]";
}
 


}
