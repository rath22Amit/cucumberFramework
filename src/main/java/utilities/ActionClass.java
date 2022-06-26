package utilities;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class ActionClass extends BaseClass{
     static WebDriver driver;

    public ActionClass(WebDriver driver){
        this.driver=driver;
    }

    // clickOnElement method is used to click on elements

    public  void clickOnElement(WebElement element){
        try{
            element.click();
            System.out.println(element +" clicked successfully");
            Thread.sleep(4000);
        }
        catch(Exception e){
            System.out.println(element +"cannot be clicked because of "+e.getCause());
            e.printStackTrace();
            takeSnapShot(driver,"Screenshot for"+element);
            
        }
    }

    //SendKeys Method is used to Type any value inside the text box
    public  void SendKeys(WebElement element, String value ){
        try{
            element.sendKeys(value);
            System.out.println(value +"sent successfully to "+ element);
            Thread.sleep(4000);
            
        }
        catch (Exception e){
            System.out.println(value +"cannot be entered because "+e.getCause());
            e.printStackTrace();
            takeSnapShot(driver,"Screenshot for"+element);
        }
    }

    public static void SelectFromDropdown(WebElement element, String value){
        try {
            Select select= new Select(element);
            select.selectByValue(value);
            System.out.println(value +" was selected in "+ element);
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(value +" cannot be selected in the dropdown as "+e.getCause());
            e.printStackTrace();
            takeSnapShot(driver,"Screenshot for"+element);
        }
    }
    public void SelectFromDropdown(WebElement element, int index){
        try {
            Select select= new Select(element);
            select.selectByIndex(index);
            System.out.println(index +" was selected in "+ element);
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(index +" cannot be selected in the dropdown as "+e.getCause());
            e.printStackTrace();
            takeSnapShot(driver,"Screenshot for"+element);
        }
    }

    public void JavaScriptExecutor(String script){
        try {
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript(script);
            System.out.println("Script executed successfully");
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println("Unable to execute the script as "+e.getCause());
            e.printStackTrace();
            
        }
    }

    // LaunchApplication is used to launch the application
    public  void LaunchApplication(WebDriver driver,String url){
        try{
        	this.driver=driver;
            driver.get(url);
            System.out.println("Application Launched Succesfully");
            

        }
        catch(Exception e){
            System.out.println("Application cannot be launched because "+ e.getCause());
            e.printStackTrace();
            takeSnapShot(driver,"Screenshot for Application Launch");
        }
    }
    
    //VerifyHeading method is used to verify the heading of the page in the application
    public static void VerifyHeading(String value) {
    	try {
    		driver.getPageSource().contains(value);
    		System.out.println(value+ " heading is getting displayed.");
    		Thread.sleep(3000);
    	}
    	catch(Exception e) {
    		System.out.println("The heading is not displayed as it is recieving " + e.getCause());
    	}
    }


}
