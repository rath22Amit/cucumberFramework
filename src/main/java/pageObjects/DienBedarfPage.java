package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import utilities.ActionClass;

public class DienBedarfPage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//h2[text()='Dein Bedarf']");
	By uberblick= By.xpath("//button[text()='Überblick']");
	
	
	public DienBedarfPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void SelectUberBlick() throws InterruptedException {
		ActionClass.VerifyHeading("Dein Bedarf");
		WebElement uberblick_section= driver.findElement(uberblick);
		ActionClass action= new ActionClass(driver);
		action.clickOnElement(uberblick_section);

		
	}
	
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
