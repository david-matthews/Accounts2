package qa.maven.accounts2;

import com.google.gson.Gson;

public class JsonWriter {

public static void jsonwrite () {
	Accounts person1 = new Accounts ("David", "Matthews", 12345);
	
	
	Service map = new Service();
	
	map.addAccount(person1);
	Gson gson = new Gson();
	String json = gson.toJson(map.hmap);
	System.out.println(json);
	}
}
