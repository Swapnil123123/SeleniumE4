package DataDrivenTesting;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ReadDataFromPropertiesFile {

	  public static void main(String[] args) throws IOException {
		  Properties prop=new Properties();
		  FileInputStream fis=new FileInputStream ("src\\test\\resources\\vtiger.properties");
		  prop.load(fis);
		  String username=prop.getProperty("username");
		  String password=prop.getProperty("password");
		  System.out.println(username);
		  System.out.println(password);
		 	
		 	
		 	
		 }
		 }

