package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.ActionClass;

public class JobTitlePage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//p/span[text()='Was ist deine Berufsbezeichnung?']");
	By job_title_field= By.xpath("//input[@placeholder='Berufsbezeichnung']");
	By weiterButton=By.xpath("//button//span[text()='Weiter']");
	
	
	
	public JobTitlePage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void EnterJobTitle() throws InterruptedException {
		WebElement p_heading= driver.findElement(page_heading);
		ActionClass action= new ActionClass(driver);
		WebElement job_title_text_box= driver.findElement(job_title_field);
		ActionClass.VerifyHeading("Was ist deine Berufsbezeichnung?");
		
		action.SendKeys(job_title_text_box, "Senior Software Engineer");
		
		
	}
	public void clickOnNextButton() throws InterruptedException {
		ActionClass action= new ActionClass(driver);
		WebElement nextButton= driver.findElement(weiterButton);
		action.clickOnElement(nextButton);
		
	}
	
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
