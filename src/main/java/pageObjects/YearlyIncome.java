package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import utilities.ActionClass;

public class YearlyIncome {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//p/span[text()='Wie hoch ist dein Jahresbruttogehalt?']");
	By salary_text_box=By.xpath("//input");
	By speichern= By.xpath("//span[text()='Speichern']");
	
	
	
	
	public YearlyIncome(WebDriver driver) {
		this.driver= driver;
	}
	
	public void EnterYearlyIncome() throws InterruptedException {
		
		WebElement salary_text_field= driver.findElement(salary_text_box);
		
		
		ActionClass action = new ActionClass(driver);
		action.SendKeys(salary_text_field, "60.000");
		
		
	}
	
	public void clickOnNextButton() throws InterruptedException {
		ActionClass action= new ActionClass(driver);
		WebElement nextButton= driver.findElement(speichern);
		ActionClass.VerifyHeading("Wie hoch ist dein Jahresbruttogehalt?");
		action.clickOnElement(nextButton);
		
	}
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
