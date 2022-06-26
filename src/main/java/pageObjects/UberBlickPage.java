package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import utilities.ActionClass;

public class UberBlickPage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//h2[text()='Dein Bedarf']");
	By private_Alters_card= By.xpath("//h3[@data-cucumber-recommendation-card-title='Private Altersvorsorge']");
	
	
	
	public UberBlickPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void SelectCard() throws InterruptedException {
		WebElement private_Alters_Card= driver.findElement(private_Alters_card);
		ActionClass action= new ActionClass(driver);
		action.clickOnElement(private_Alters_Card);
	}
	
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
