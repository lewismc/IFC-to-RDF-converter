package fi.ni;

import java.io.IOException;
import java.sql.SQLException;

import fi.ni.rdf.VirtConfig;

/*
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0 Unported License.
 * http://creativecommons.org/licenses/by/3.0/
 */

public class IFC_Converter {

	private static final String DEFAULT_PATH = "http://drum3.cs.hut.fi/";
	private static VirtConfig virt = new VirtConfig();
	static {
		virt.user = "ifc";
		virt.password = "!fc";
		virt.jdbc_uri = "jdbc:virtuoso://ninsuna-data";
	}
	
	public static void convert(String express_file, String ifc_file, String output_file, String model_name) {

		long t0 = System.currentTimeMillis();
		ExpressReader er = new ExpressReader(express_file);
		IFC_ClassModel model = new IFC_ClassModel(ifc_file, er.getEntities(), er.getTypes(), model_name);
				
		try {
			model.listRDF(output_file, DEFAULT_PATH, virt);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		long t1 = System.currentTimeMillis();
		System.out.println("done in " + ((t1-t0)/1000.0) + " seconds.");
		
	}

	public static void main(String[] args) {
		if(args.length != 4)
		 	System.out.println("Usage:  java  IFC_Converter  express_filename  ifc_filename  output_filename  model_name \nExample: java  IFC_Converter  c:\\jo\\IFC2X3_TC1.exp  C:\\jo\\sample.ifc  c:\\jo\\output_rdf.txt sample");
		else
			convert(args[0], args[1], args[2], args[3]);
		
		/*
		String express_filename = "samples\\IFC2X3_TC1.exp";
		String ifc_filename = "samples\\IFC2X3_TC1.ifc";
		String output_filename = "out\\IFC2X3_TC1.rdf";
		String model_name = "IFC2X3_TC1";
		convert(express_filename, ifc_filename, output_filename, model_name);
		*/
	}

}
