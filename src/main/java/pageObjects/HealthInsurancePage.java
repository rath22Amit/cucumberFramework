package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.ActionClass;

public class HealthInsurancePage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//p/span[contains(text(),'privat krankenversichert?')]");
	By byLaw= By.xpath("//label[text()='Gesetzlich']");
	By privat =By.xpath("//label[text()='Privat']");
	
	
	public HealthInsurancePage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void SelectHealthInsurance() throws InterruptedException {
		WebElement p_heading= driver.findElement(page_heading);
		ActionClass action= new ActionClass(driver);
		WebElement byLaw_option=driver.findElement(byLaw);
		WebElement privat_option= driver.findElement(privat);
		
		ActionClass.VerifyHeading("Bist du gesetzlich oder privat krankenversichert?");
		action.clickOnElement(privat_option);
		}
	
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
