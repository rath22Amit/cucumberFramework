package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.ActionClass;

public class InsurancePensionPage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//p/span[text()='Bist du gesetzlich rentenversichert?']");
	By Yes= By.xpath("//label[text()='Ja']");
	By No= By.xpath("//label[text()='Nein']");
	
	
	public InsurancePensionPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void SelectPensionInsurance() throws InterruptedException {
		WebElement p_heading= driver.findElement(page_heading);
		ActionClass action = new ActionClass(driver);
		
		WebElement yes_option= driver.findElement(Yes);
		WebElement no_option= driver.findElement(No);
		
		ActionClass.VerifyHeading("Bist du gesetzlich rentenversichert?");
		action.clickOnElement(yes_option);
		
	}
	
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
