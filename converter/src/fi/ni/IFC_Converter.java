package fi.ni;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import net.sf.json.JSONObject;
import fi.ni.rdf.VirtConfig;

/*
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0 Unported License.
 * http://creativecommons.org/licenses/by/3.0/
 */

public class IFC_Converter {

	private static final String DEFAULT_PATH = "http://drum3.cs.hut.fi/";
		
	public static void convert(String jsonConfig) {
		JSONObject obj = JSONObject.fromObject(jsonConfig);
		String express_file = obj.getString("express_file");
		String ifc_file = obj.getString("ifc_file");
		String output_file = obj.getString("output_file");
		String model_name = obj.getString("model_name");
		String path = obj.getString("path");	
		
		VirtConfig virt = null;
		if(obj.containsKey("virtuoso")){
			virt = new VirtConfig();
			JSONObject virtObj = obj.getJSONObject("virtuoso");
			virt.user = virtObj.getString("user");
			virt.password = virtObj.getString("password");
			virt.jdbc_uri = virtObj.getString("jdbc_uri");
		}
		
		convert(express_file, ifc_file, output_file, model_name, path, virt);
		
	}
	
	public static void convert(String express_file, String ifc_file, String output_file, String model_name, String path, VirtConfig virt) {

		long t0 = System.currentTimeMillis();
		ExpressReader er = new ExpressReader(express_file);
		IFC_ClassModel model = new IFC_ClassModel(ifc_file, er.getEntities(), er.getTypes(), model_name);
				
		try {
			model.listRDF(output_file, path, virt);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		long t1 = System.currentTimeMillis();
		System.out.println("done in " + ((t1-t0)/1000.0) + " seconds.");
		
	}

	public static void main(String[] args) {
		if(args.length != 4 && !(args.length == 2 && args[0].equals("-json")))
		 	System.out.println("Usage:  java IFC_Converter express_filename ifc_filename output_filename model_name \nExample: java IFC_Converter c:\\jo\\IFC2X3_TC1.exp C:\\jo\\sample.ifc c:\\jo\\output_rdf.txt sample");
		else {
			if(args.length == 4) {
				convert(args[0], args[1], args[2], args[3], DEFAULT_PATH, null);
			} else {
				try {
					FileInputStream fis = new FileInputStream(args[1]);
					String jsonString = slurp(fis);
					fis.close();
					convert(jsonString);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
				
		
	}

	public static String slurp (InputStream in) throws IOException {
		StringBuffer out = new StringBuffer();
		byte[] b = new byte[4096];
		for (int n; (n = in.read(b)) != -1;) {
			out.append(new String(b, 0, n));
		}
		return out.toString();
	}
}
