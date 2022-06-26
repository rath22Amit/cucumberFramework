package stepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectManager.PageObjectManager;
import pageObjects.BedarfPage;
import pageObjects.DateOfBirthPage;
import pageObjects.DienBedarfPage;
import pageObjects.FamilySituationPage;
import pageObjects.FreeTimePage;
import pageObjects.GenderSelectionPage;
import pageObjects.HealthInsurancePage;
import pageObjects.InsurancePensionPage;
import pageObjects.JobTitlePage;
import pageObjects.KinderInformationPage;
import pageObjects.LandingPage;
import pageObjects.LoginPageObject;
import pageObjects.PetAnimalPage;
import pageObjects.ProfessionPage;
import pageObjects.RecommendationReadyPage;
import pageObjects.SaveYourProgressPage;
import pageObjects.StayPage;
import pageObjects.UberBlickPage;
import pageObjects.VehicleOwnPage;
import pageObjects.YearlyIncome;
import utilities.ActionClass;
import utilities.BaseClass;


public class InsuranceStepDef extends BaseClass{
	
//	WebDriver driver=null;
//	public static String browsername=null;
//	public static String url=null;
	
	
	public static String browser;
	PropertiesFile pf= new PropertiesFile();
	
	@Given("User is in the landing page of the application")
	public void user_is_in_the_landing_page_of_the_application() {
		
		pf.getUrl();
		ActionClass action= new ActionClass(driver);
		action.LaunchApplication(driver,url);
	   
	}

	@When("User clicks on Bedarf Section and starts the application")
	public void user_clicks_on_bedarf_section_and_starts_the_application() {
		
		try{
			
			
			pom= new PageObjectManager(driver);
			landingpage= pom.landingpage();
			bedarfpage=pom.bedarfpage();
			dobpage= pom.dobpage();
			landingpage.AcceptCookies();
			landingpage.ClickOnBedarfSection();
			bedarfpage.ClickOnStartbutton();
			
		}
		catch(Exception e) {
			System.out.println(e.getCause());
		}
	    
	}

	
	@And("User should be able to verify the insurance cards")
	public void user_should_be_able_to_verify_the_insurance_cards() {
		
		recommendationreadypage= pom.recommendationreadypage();
		dienbedarfpage= pom.dienbedarfpage();
		uberblickpage= pom.uberblickpage();
		
		try {
			recommendationreadypage.clickOnNextButton();
			dienbedarfpage.SelectUberBlick();
			
		}
		catch(Exception e) {
			System.out.println(e.getCause());
		}
		
		
	}

	
	
	@When("User selects {string}")
	public void user_selects(String string) throws InterruptedException {
		uberblickpage= pom.uberblickpage();
		uberblickpage.SelectCard();
	    
	}
	@Then("User should be able to see details of the {string} insurance")
	public void user_should_be_able_to_see_details_of_the_insurance(String string) {
		try {
			privatealterspage=pom.privatealterspage();
			privatealterspage.Verify_the_Heading();
			
			System.out.println("User is able to view the details");
			
		}
		catch(Exception e) {
			System.out.println("The page cannot be launched as it recieved "+ e.getCause());
			
		}
		
	}
	
	@Before
	public void BrowserSetup() throws IOException {

		try {
			pf.getBrowser();
			
			if(browsername.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
			}

			else if(browsername.equalsIgnoreCase("edge")){
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			
			else if(browsername.equalsIgnoreCase("chrome-incognito")) {
				WebDriverManager.chromedriver().setup();
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--incognito");
				driver = new ChromeDriver(options);
			}
			else {
				System.out.println("Invalid browser name");
			}
			
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().deleteAllCookies();
			System.out.println("Browser setup is done successfully");
		}
		catch(Exception e) {
			System.out.println("Invalid browser setup because it recieved "+e.getMessage() +"/n " + e.getCause());
		}
		
	}
	
	@And("User fill the form and navigate to Insurance recommendation funnel : {string},{string},{string},{string},{string}")
	public void user_fill_the_form_and_navigate_to_insurance_recommendation_funnel(String dateofbirth, String gender, String stay, String vehicleOwn,String emailid) {
		
		try{
			pom= new PageObjectManager(driver);
			bedarfpage= pom.bedarfpage();
			dobpage= pom.dobpage();
			dienbedarfpage= pom.dienbedarfpage();
			familysituationpage= pom.familysituationpage();
			freetimepage= pom.freetimepage();
			genderselectionpage = pom.genderselectionpage();
			healthinsurancepage= pom.healthinsurancepage();
			insurancepensionpage= pom.insurancepensionpage();
			jobtitlepage= pom.jobtitlepage();
			kinderinformationpage= pom.kinderinformationpage();
//			LandingPage landingpage= pom.landingpage();
			landingpageobject= pom.loginpage();
			petanimalpage= pom.petanimalpage();
			professionpage=pom.professionpage();
			recommendationreadypage= pom.recommendationreadypage();
			saveyourprogresspage= pom.saveyourprogresspage();
			staypage=pom.staypage();
			uberblickpage= pom.uberblickpage();
			vehicleownpage = pom.vehicleownpage();
			yearlyincomepage= pom.yearlyincomepage();
			
			
			dobpage.setDateOfBirth(dateofbirth);
			dobpage.clickOnNextButton();
			genderselectionpage.SelectGender(gender);
			staypage.SelectHouseType(stay);
			vehicleownpage.SelectVehicleOwned();
			familysituationpage.SelectFamilySituation();
			kinderinformationpage.SelectKinderInformation();
			professionpage.Select_Profession();
			insurancepensionpage.SelectPensionInsurance();
			jobtitlepage.EnterJobTitle();
			jobtitlepage.clickOnNextButton();
			healthinsurancepage.SelectHealthInsurance();
			freetimepage.SelectFreeTime();
			freetimepage.clickOnNextButton();
			petanimalpage.SelectPetAnimal();
			petanimalpage.clickOnNextButton();
			yearlyincomepage.EnterYearlyIncome();
			yearlyincomepage.clickOnNextButton();
			saveyourprogresspage.FillupPage(emailid);
			saveyourprogresspage.ClickOnNextbutton();
			

			
		}
		catch(Exception e) {
			System.out.println("The process cannot be done as it recieved "+e.getCause());
		}
	}
	

	@After
	public void Teardown() {
		
		driver.close();
		System.out.println("Browsers closed");
		
	}

}
