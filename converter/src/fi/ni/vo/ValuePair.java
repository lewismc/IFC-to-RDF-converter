package fi.ni.vo;
/**
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0 Unported License.
 * http://creativecommons.org/licenses/by/3.0/
 */
public class ValuePair {
  private final String name;
  private final Object value;
  private int listIndex=Integer.MIN_VALUE;
  
public ValuePair(String name, Object value) {
    super();
    this.name = name;
    this.value = value;
}


public ValuePair(String name, Object value, int listIndex) {
    super();
    this.name = name;
    this.value = value;
    this.listIndex = listIndex;
}



public String getName() {
    return name;
}
public Object getValue() {
    return value;
}
public int getListIndex() {
    return listIndex;
}
public void setListIndex(int listIndex) {
    this.listIndex = listIndex;
}


  
  


}
