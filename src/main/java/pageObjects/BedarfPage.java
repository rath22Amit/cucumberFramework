package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import utilities.ActionClass;

public class BedarfPage {
	
	WebDriver driver;
	ActionClass action= new ActionClass(driver);
	By accept_all_cookies= By.xpath("//form[@class='_cookie-banner-inner_1hvnco']//button[text()='Alle Cookies akzeptieren']");
	By ablehnen= By.xpath("//form[@class='_cookie-banner-inner_1hvnco']//button[text()='Ablehnen']");
	By bedarf= By.xpath("//a[@href='/de/app/recommendations']");
	By dein_bedarfscheck_heading= By.xpath("//div/h1[text()='Dein ' ]");
	By jetzt_starten= By.xpath("//span[@class='_block_dsfphm' and text()='Jetzt starten']");
	
	public BedarfPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void ClickOnStartbutton() throws InterruptedException {
//		ActionClass.VerifyHeading(null);
		WebElement startNow=driver.findElement(jetzt_starten);
		ActionClass action= new ActionClass(driver);
		action.clickOnElement(startNow);
		
		
	}
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
