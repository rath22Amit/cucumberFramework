package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PrivateAltersPage {
	
	WebDriver driver;
	
	By page_heading= By.xpath("//h1[text()='Pri­vate Alters­vor­sorge']");
	
	
	public PrivateAltersPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void Verify_the_Heading()  {
		
		
		try {
			if(driver.getPageSource().contains("Pri­vate Alters­vor­sorge")) {
				System.out.println("Landing to the Private Altersvorsorge Description Page");
			}
			else {
				System.out.println("Did not land to Private Altersvorsorge Description page");
			}
		}
		catch(Exception e) {
			System.out.print("We are unable to land to the Description Page as "+ e.getCause() +e.getMessage());
		}
		
		
	}
	
	
	
//	public void VerifyBefardHeading() {
//		WebElement Bedarf_Heading=driver.findElement(dein_bedarfscheck_heading);
//		String bed_heading=Bedarf_Heading.getText();
//		if()
//	}
	
	
}
