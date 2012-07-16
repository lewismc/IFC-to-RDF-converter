package fi.ni;


import java.util.HashSet;
import java.util.Set;


/**
 * The Class Describe
 * 
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0
 *          Unported License.
 *          http://creativecommons.org/licenses/by/3.0/
 */

public class Describe {
    
  static Set<String> outs=new HashSet<String>();  
  static void out(String txt)
  {
      if(outs.contains(txt))
	  return;
      outs.add(txt);
      System.out.println("+ "+txt);
  }
}
