package qa.maven.accounts2;

import com.google.gson.Gson;

import java.util.HashMap;

public class JsonWriter {

	private Gson gson;
	
	public JsonWriter() {
		
		this.gson = new Gson();
	}
	
	public String getJson(HashMap obj) {
		return gson.toJson(obj);	}

	
	
	}

