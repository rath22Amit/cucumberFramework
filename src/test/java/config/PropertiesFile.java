package config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import stepDefinition.InsuranceStepDef;
import testRunner.TestRunnerClark;


public class PropertiesFile {
	
	
	public static void getBrowser() {
		
		
		
		try {
//		Properties prop= new Properties();
		Properties prop= new Properties();
		InputStream input= new FileInputStream("C:/Users/ASUS/Desktop/Clark Interview/FrameworkBDD/src/test/java/config/configuration.properties");
			
		prop.load(input);
		String browser=prop.getProperty("browser");
		System.out.println("The application is launching in "+browser);
		
		InsuranceStepDef.browsername=browser;
		
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
	public static void getUrl() {
		try {
//			Properties prop= new Properties();
			Properties prop= new Properties();
			InputStream input= new FileInputStream("C:/Users/ASUS/Desktop/Clark Interview/FrameworkBDD/src/test/java/config/configuration.properties");
				
			prop.load(input);
			String url=prop.getProperty("url");
			System.out.println(url);
			
			InsuranceStepDef.url=url;
			
			}
			
			catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			
		
	}

}}
