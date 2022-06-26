package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

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
import pageObjects.PrivateAltersPage;
import pageObjects.ProfessionPage;
import pageObjects.RecommendationReadyPage;
import pageObjects.SaveYourProgressPage;
import pageObjects.StayPage;
import pageObjects.UberBlickPage;
import pageObjects.VehicleOwnPage;
import pageObjects.YearlyIncome;

public class BaseClass {
	public static WebDriver driver=null;
	public static String browsername=null;
	public static String url=null;
//	public WebDriver driver;
	public PageObjectManager pom;
	public LandingPage landingpage;
	public BedarfPage bedarfpage;
	public DateOfBirthPage dobpage;
	public DienBedarfPage dienbedarfpage;
	public FamilySituationPage familysituationpage;
	public FreeTimePage freetimepage;
	public GenderSelectionPage genderselectionpage;
	public HealthInsurancePage healthinsurancepage;
	public InsurancePensionPage insurancepensionpage;
	public JobTitlePage jobtitlepage;
	public KinderInformationPage kinderinformationpage;
//	LandingPage landingpage= pom.landingpage();
	public LoginPageObject landingpageobject;
	public PetAnimalPage petanimalpage;
	public ProfessionPage professionpage;
	public RecommendationReadyPage recommendationreadypage;
	public SaveYourProgressPage saveyourprogresspage;
	public StayPage staypage;
	public UberBlickPage uberblickpage;
	public VehicleOwnPage vehicleownpage ;
	public YearlyIncome yearlyincomepage;
	public PrivateAltersPage privatealterspage;
	
	
	
	
	 public static void takeSnapShot(WebDriver driver, String filename) {
         try{
//         	this.driver=driver;
         	File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         	FileUtils.copyFile(file, new File("C:/Users/ASUS/Desktop/Clark Interview/FrameworkBDD/ScreenShot-Failed Scenario/"+filename+".png"));
             
         }
         catch (Exception e){
             System.out.println("Could not capture screenshot as " + e.getCause());
             e.printStackTrace();
         }
 }
}
