package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.ActionClass;

public class LandingPage {
	
	WebDriver driver;
	ActionClass action= new ActionClass(driver);
	By accept_all_cookies= By.xpath("//form[@class='_cookie-banner-inner_1hvnco']//button[text()='Alle Cookies akzeptieren']");
	By ablehnen= By.xpath("//form[@class='_cookie-banner-inner_1hvnco']//button[text()='Ablehnen']");
	By bedarf= By.xpath("//a[@href='/de/app/recommendations']");
	By dein_bedarfscheck_heading= By.xpath("//div/h1[text()='Dein ' ]");
	By jetzt_starten= By.xpath("//span[@class='_block_dsfphm' and text()='Jetzt starten']");
	
	public LandingPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void AcceptCookies() {
		WebElement acceptCookies= driver.findElement(accept_all_cookies);
		action.clickOnElement(acceptCookies);
		
	}
	
	public void DeclineCookies() {
		WebElement decline_cookie= driver.findElement(ablehnen);
		action.clickOnElement(decline_cookie);
		
	}
	
	public void ClickOnBedarfSection() throws InterruptedException {
		BedarfPage bp= new BedarfPage(driver);
		WebElement Bedarf_Section= driver.findElement(bedarf);
		WebElement start_now= driver.findElement(jetzt_starten);
		action.clickOnElement(Bedarf_Section);
		Thread.sleep(3000);
		
		
	}
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
