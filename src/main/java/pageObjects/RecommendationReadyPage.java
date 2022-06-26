package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import utilities.ActionClass;

public class RecommendationReadyPage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//h1[text()='Deine Empfehlungen sind verfügbar']");
	By seeRecommendation= By.xpath("//span/span[text()='Empfehlungen ansehen']");
	
	
	
	public RecommendationReadyPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void clickOnNextButton() throws InterruptedException {
		ActionClass action= new ActionClass(driver);
		WebElement nextButton= driver.findElement(seeRecommendation);
		ActionClass.VerifyHeading("Deine Empfehlungen sind verfügbar");
		action.clickOnElement(nextButton);
		
	}
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
