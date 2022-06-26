package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.ActionClass;

public class FreeTimePage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//p/span[text()='Was machst du in deiner Freizeit?']");
	By travelalot= By.xpath("//label[text()='Ich reise sehr viel']");
	By dangerousSport= By.xpath("//label[text()='Ich betreibe eine gefährliche Sportart']");
	By timeWithFamily= By.xpath("//label[text()='Ich verbringe sehr viel Zeit mit meiner Familie']");
	By houseAndGarden= By.xpath("//label[text()='Ich arbeite gerne in Haus und Garten']");
	By weiterButton=By.xpath("//button//span[text()='Weiter']");
	
	
	public FreeTimePage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void SelectFreeTime() throws InterruptedException {
		WebElement p_heading= driver.findElement(page_heading);
		WebElement travelalot_option= driver.findElement(travelalot);
		WebElement dangerousSport_option=driver.findElement(dangerousSport);
		WebElement timeWithFamily_option= driver.findElement(timeWithFamily);
		WebElement houseAndGarden_option=driver.findElement(houseAndGarden);
		
		ActionClass.VerifyHeading("Was machst du in deiner Freizeit?");
		ActionClass action = new ActionClass(driver);
		action.clickOnElement(houseAndGarden_option);
		action.clickOnElement(travelalot_option);
		
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
