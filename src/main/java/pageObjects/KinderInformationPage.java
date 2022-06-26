package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.ActionClass;

public class KinderInformationPage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//p/span[text()='Hast du Kinder, die unter 18 Jahre alt oder noch in Ausbildung sind?']");
	By yes= By.xpath("//label[text()='Ja']");
	By no= By.xpath("//label[text()='Nein']");
	
	
	public KinderInformationPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void SelectKinderInformation() throws InterruptedException {
		WebElement p_heading= driver.findElement(page_heading);
		
		ActionClass action= new ActionClass(driver);
		
		WebElement yes_option= driver.findElement(yes);
		WebElement no_option= driver.findElement(no);
		ActionClass.VerifyHeading("Hast du Kinder, die unter 18 Jahre alt oder noch in Ausbildung sind?");
		action.clickOnElement(no_option);
		
		
	}
	
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
