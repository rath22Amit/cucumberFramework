package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ActionClass;

public class LoginPageObject {
	WebDriver driver;
	By usernameField= By.id("name");
	By passwordField=By.id("password");
	By loginButton=By.id("login");
	
	ActionClass action= new ActionClass(driver);
	By accept_all_cookies= By.xpath("//form[@class='_cookie-banner-inner_1hvnco']//button[text()='Alle Cookies akzeptieren']");
	By ablehnen= By.xpath("//form[@class='_cookie-banner-inner_1hvnco']//button[text()='Ablehnen']");
	By bedarf= By.xpath("//a[text()='Bedarf']");
	By dein_bedarfscheck_heading= By.xpath("//div/h1[text()='Dein ' ]");
	By jetzt_starten= By.xpath("//span[text()='Jetzt starten']");
	
	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void AcceptCookies(String username) {
		driver.findElement(accept_all_cookies).click();
	}
	
	public void fillPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	
	

}
