package fi.ni.vo;


/**
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0 Unported License.
 * http://creativecommons.org/licenses/by/3.0/
 */
public class AttributeVO {
  private String name;
  private TypeVO type;
  boolean unique=false;
  private boolean reverse_pointer;   // defined in another class
  boolean isOne2One=false;

  private InverseVO points_from;
  private boolean set=false;
  private boolean list=false;
  
public AttributeVO(String name, TypeVO type, boolean is_set,boolean is_list) {
    super();
    this.name = name;
    this.type = type;
    this.reverse_pointer = false;
    this.set = is_set;
    this.list = is_list;
}



public boolean isSet() {
    return set;
}




public void setSet(boolean set) {
    this.set = set;
}


public boolean isList() {
    return list;
}



public void setList(boolean list) {
    this.list = list;
}



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



public TypeVO getType() {
    return type;
}


public void setType(TypeVO type) {
    this.type = type;
}


public boolean isReverse_pointer() {
	return reverse_pointer;
}
public void setReverse_pointer(boolean reverse_pointer) {
	this.reverse_pointer = reverse_pointer;
}
public InverseVO getPoints_from() {
	return points_from;
}
public void setPoints_from(InverseVO points_from) {
	this.points_from = points_from;
}




public boolean isUnique() {
    return unique;
}



public void setUnique(boolean unique) {
    this.unique = unique;
}






public boolean isOne2One() {
    return isOne2One;
}



public void setOne2One(boolean isOne2One) {
    this.isOne2One = isOne2One;
}



@Override
public String toString() {
    return "AttributeVO [name=" + name + ", type=" + type + ", reverse_pointer=" + reverse_pointer + ", points_from=" + points_from + ", set=" + set + "]";
}

 
  
}
