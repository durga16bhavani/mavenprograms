package Testng_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesDemo {
    @Test
    public void read() throws IOException{
    	FileInputStream fis=new FileInputStream("C:/Users/Administrator/eclipse-workspace/maven_programs/src/main/java/Testng_programs/data.properties");
    	Properties prop=new Properties();
    	prop.load(fis);
    	System.out.println(prop.getProperty("url"));
    	System.out.println(prop.getProperty("username"));
    	System.out.println(prop.getProperty("browser"));
    	//set value
    	prop.setProperty("url","https://www.google.com");
    	FileOutputStream fos=new FileOutputStream("C:/Users/Administrator/eclipse-workspace/maven_programs/src/main/java/Testng_programs/data.properties");
    	prop.store(fos,"TestData");
    	fos.close();
    	System.out.println(prop.size());
    	System.out.println(prop.getProperty("url"));
    }
}
