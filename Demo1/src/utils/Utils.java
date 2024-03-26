 package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utils {
	
	public static int generateRandonNumber(int min, int max) {
		return (int)Math.round(Math.random()* (max-min)+min);
	}
	
	public static JSONObject loadJSONFile(String filelocation) throws FileNotFoundException, IOException, ParseException {
		JSONParser jsonparser=new JSONParser();
		Object obj=jsonparser.parse(new FileReader(filelocation));
		JSONObject jsonobject =(JSONObject)obj;
		return jsonobject;
	}
	public static void addJsonArray(String firstname,String middlename,String lastname,String username,String password,String empId) throws FileNotFoundException, IOException, ParseException {
		String fileName="C:\\Users\\Admin\\eclipse-workspace\\Demo1\\resources\\newuser.json";
		JSONParser jsonparser=new JSONParser();
		Object obj=jsonparser.parse(new FileReader(fileName));
		JSONObject userobj=new JSONObject();
		JSONArray jsonArray =(JSONArray)obj;
		userobj.put("firstname", firstname);
		userobj.put("middlename", middlename);
		userobj.put("lastname", lastname);
		userobj.put("username", username);
		userobj.put("password", password);
		userobj.put("empId", empId);
		jsonArray.add(userobj);
		FileWriter file=new FileWriter(fileName);
		
		file.write(jsonArray.toJSONString());
		file.flush();
		file.close();
	}

}

