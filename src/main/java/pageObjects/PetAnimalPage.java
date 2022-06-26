package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.ActionClass;

public class PetAnimalPage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//p/span[text()='Hast du Tiere?']");
	By dog= By.xpath("//div/label[text()='Hund']");
	By cat= By.xpath("//div/label[text()='Katze']");
	By horse= By.xpath("//div/label[text()='Pferd']");
	By small_animal= By.xpath("//div/label[text()='Kleintiere']");
	By weiterButton=By.xpath("//button//span[text()='Weiter']");
	
	
	
	public PetAnimalPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void SelectPetAnimal() throws InterruptedException {
		WebElement p_heading= driver.findElement(page_heading);
		WebElement dog_option= driver.findElement(dog);
		WebElement cat_option=driver.findElement(cat);
		WebElement horse_option= driver.findElement(horse);
		WebElement small_animal_option=driver.findElement(small_animal);
		
		ActionClass.VerifyHeading("Hast du Tiere?");
		ActionClass action = new ActionClass(driver);
		action.clickOnElement(horse_option);
		action.clickOnElement(cat_option);
		
		
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
