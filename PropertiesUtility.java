package Testng_programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	Properties properties;
	
	public PropertiesUtility() {
		try(FileInputStream input=new FileInputStream("C:/Users/Administrator/eclipse-workspace/maven_programs/src/main/java/Testng_programs/data.properties")){
			properties=new Properties();
			properties.load(input);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public String getProperty(String key ) {
		return properties.getProperty(key);
	}

}
