package fi.ni;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.Tree;

import fi.ni.ifc2x3.IfcRoot;

/*
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0 Unported License.
 * http://creativecommons.org/licenses/by/3.0/
 */


public class IFC_Converter {

        ExpressReader er;
	public IFC_Converter(String express_file, String ifc_file, String output_file, String model_name) {

		er=new ExpressReader(express_file);
		IFC_ClassModel model=new IFC_ClassModel(ifc_file,er.getEntities(),er.getTypes(),model_name);
		model.listRDF(output_file); 

		System.out.println("done successfully");
		
	}

	public static void main(String[] args) {
	    if(args.length!=4)
		System.out.println("Usage:  java  IFC_Converter  express_filename  ifc_filename  output_filename  model_name \nExample: java  IFC_Converter  c:\\jo\\IFC2X3_TC1.exp  C:\\jo\\sample.ifc  c:\\jo\\output_rdf.txt sample");
	    else
		new IFC_Converter(args[0],args[1],args[2],args[3]);
	}

}
