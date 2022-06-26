package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.ActionClass;

public class FamilySituationPage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//p/span[text()='Wie ist deine Familiensituation?']");
	By inPatnership= By.xpath("//label[text()='Ich bin in einer Partnerschaft']");
	By married= By.xpath("//label[text()='Ich bin verheiratet']");
	By single= By.xpath("//label[text()='Ich bin Single']");
	
	public FamilySituationPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void SelectFamilySituation() throws InterruptedException {
		WebElement p_heading= driver.findElement(page_heading);
		WebElement inPatnership_option= driver.findElement(inPatnership);
		WebElement married_option=driver.findElement(married);
		WebElement single_option=driver.findElement(single);
		ActionClass.VerifyHeading("Wie ist deine Familiensituation?");
		
		ActionClass action= new ActionClass(driver);
		action.clickOnElement(single_option);
		
		
	}
	
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
