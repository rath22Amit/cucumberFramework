package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.ActionClass;

public class SaveYourProgressPage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//h1[text()='Sichere deinen Fortschritt']");
	By emailaddress= By.xpath("//input[@type='email']");
	By password= By.xpath("//input[@type='password']");
	By registerbutton= By.xpath("//span[text()='Jetzt registrieren']");
	
	
	public SaveYourProgressPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void FillupPage(String email) {
		WebElement p_heading=driver.findElement(page_heading);
		WebElement email_field= driver.findElement(emailaddress);
		WebElement password_field= driver.findElement(password);
		
		ActionClass.VerifyHeading("Sichere deinen Fortschritt");
		ActionClass action= new ActionClass(driver);
		action.SendKeys(email_field, email);
		action.SendKeys(password_field, "P@007@wrd");
		
	}
	
	public void ClickOnNextbutton() {
		WebElement register= driver.findElement(registerbutton);
		ActionClass action = new ActionClass(driver);
		
		action.clickOnElement(register);
		
		
	}
	
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
