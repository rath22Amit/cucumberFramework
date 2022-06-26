package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import utilities.ActionClass;

public class GenderSelectionPage {
	
	WebDriver driver;
	
	By page_heading = By.xpath("//p/span[text()='Was ist dein Geschlecht?']");
	By male= By.xpath("//span/following::label[text()='Männlich']");
	By female= By.xpath("//span/following::label[text()='Weiblich']");
	
	public GenderSelectionPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void SelectGender(String gender) throws InterruptedException {
		ActionClass action= new ActionClass(driver);
		WebElement sel_male= driver.findElement(male);
		WebElement sel_female= driver.findElement(female);
		
		ActionClass.VerifyHeading("Was ist dein Geschlecht?");
		if(gender.equalsIgnoreCase("male")) {
			action.clickOnElement(sel_male);
		}
		else if( gender.equalsIgnoreCase("female")) {
			action.clickOnElement(sel_female);
		}
		else {
			System.out.println("Invalid input");
		}
		
		
		
	}
	
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
