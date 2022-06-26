package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import utilities.ActionClass;

public class StayPage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//p/span[text()='Wo wohnst du?']");
	By in_rented_apartment=By.xpath("//label[text()='In einer gemieteten Wohnung']");
	By in_my_apartment=By.xpath("//label[text()='In meiner eigenen Wohnung']");
	By in_rented_house=By.xpath("//label[text()='In einem gemieteten Haus']");
	By in_my_house= By.xpath("//label[text()='In meinem eigenen Haus']");
	By none_of_these=By.xpath("//label[text()='Nichts davon']");
	
	public StayPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void SelectHouseType(String stayType) throws InterruptedException {
		WebElement rented_apartment=driver.findElement(in_rented_apartment);
		WebElement my_apartement= driver.findElement(in_my_apartment);
		WebElement rented_house= driver.findElement(in_rented_house);
		WebElement my_house= driver.findElement(in_my_house);
		WebElement none= driver.findElement(none_of_these);
		
		ActionClass action = new ActionClass(driver);
		
		
		ActionClass.VerifyHeading("Wo wohnst du?");
		if(stayType.equalsIgnoreCase("rented_apartment")) {
			action.clickOnElement(rented_apartment);
		}
		else if(stayType.equalsIgnoreCase("my_apartment")) {
			action.clickOnElement(my_apartement);
		}
		else if(stayType.equalsIgnoreCase("rented_house")) {
			action.clickOnElement(rented_house);
		}
		else if(stayType.equalsIgnoreCase("my_house")) {
			action.clickOnElement(my_house);
		}
		
		else if(stayType.equalsIgnoreCase("none")) {
			action.clickOnElement(none);
		}
		
		else {
			System.out.println("Invalid input");
		}
		
		
	}
	
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
