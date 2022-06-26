package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.ActionClass;

public class ProfessionPage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//p/span[text()='Was machst du beruflich?']");
	By angestellt= By.xpath("//label[text()='Angestellt']");
	By selbststandig= By.xpath("//label[text()='Selbstständig']");
	By freiberuflich = By.xpath("//label[text()='Freiberuflich tätig']");

	
	
	
	public ProfessionPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void Select_Profession() throws InterruptedException {
		WebElement p_heading= driver.findElement(page_heading);
		ActionClass action= new ActionClass(driver);
		
		WebElement angestellt_option= driver.findElement(angestellt);
		WebElement selbststandig_option= driver.findElement(selbststandig);
		WebElement freiberuflich_option= driver.findElement(freiberuflich);
		
		ActionClass.VerifyHeading("Was machst du beruflich?");
		action.clickOnElement(freiberuflich_option);
		
		
		
	}
	
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
