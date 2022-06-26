package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import utilities.ActionClass;

public class VehicleOwnPage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//p/span[text()='Besitzt du eines der folgenden Fahrzeuge?']");
	By auto= By.xpath("//label[text()='Auto']");
	By wohwagen = By.xpath("//label[text()='Wohnwagen']");
	By anhanger= By.xpath("//label[text()='Anhänger']");
	By motorrad = By.xpath("//label[text()='Motorrad']");
	By Weiterbutton= By.xpath("//button//span[text()='Weiter']");
	
	public VehicleOwnPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void SelectVehicleOwned() throws InterruptedException {
		WebElement p_heading= driver.findElement(page_heading);
		WebElement auto_option= driver.findElement(auto);
		WebElement wohwagen_option= driver.findElement(wohwagen);
		WebElement anhanger_option= driver.findElement(anhanger);
		WebElement motorrad_option= driver.findElement(motorrad);
		WebElement weiter_button= driver.findElement(Weiterbutton);
		
		ActionClass action= new ActionClass(driver);
		ActionClass.VerifyHeading("Besitzt du eines der folgenden Fahrzeuge?");
		action.clickOnElement(motorrad_option);
		action.clickOnElement(auto_option);
		action.clickOnElement(weiter_button);
		
		
		
		
		
		
	}
	
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
