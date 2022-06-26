package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import utilities.ActionClass;

public class DateOfBirthPage {
	
	WebDriver driver;
	

	By dateOfBirthField=By.xpath("//input[@id='mandate_birthdate']");
	By weiterButton=By.xpath("//span[@class='_content_dsfphm']/span[text()='Weiter']");
	
	public DateOfBirthPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void setDateOfBirth(String dob) throws InterruptedException {
		ActionClass action= new ActionClass(driver);
		WebElement dobField=driver.findElement(dateOfBirthField);
		action.SendKeys(dobField, dob);
		
	}
	
	public void clickOnNextButton() throws InterruptedException {
		ActionClass action= new ActionClass(driver);
		ActionClass.VerifyHeading("Wann bist du geboren?");
		WebElement nextButton= driver.findElement(weiterButton);
		action.clickOnElement(nextButton);
		
	}
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
	
	
}
