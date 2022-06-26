package pageObjectManager;

import org.openqa.selenium.WebDriver;

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

public class PageObjectManager {
	private WebDriver driver;
	private BedarfPage bedarfpage;
	private DateOfBirthPage dateofbirthpage;
	private DienBedarfPage dienbedarfpage;
	private FamilySituationPage familysituationpage;
	private FreeTimePage freetimepage;
	private GenderSelectionPage genderselectionpage;
	private HealthInsurancePage healthinsurancepage;
	private InsurancePensionPage insurancepensionpage;
	private JobTitlePage jobtitlepage;
	private KinderInformationPage kinderinformationpage;
	private LandingPage landingpage;
	private LoginPageObject loginpage;
	private PetAnimalPage petanimalpage;
	private ProfessionPage professionpage;
	private RecommendationReadyPage recommendationreadypage;
	private SaveYourProgressPage saveyourprogresspage;
	private StayPage staypage;
	private UberBlickPage uberblickpage;
	private VehicleOwnPage vehicleownpage;
	private YearlyIncome yearlyincomepage;
	private PrivateAltersPage privatealterspage;
	
	
	public  PageObjectManager(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public BedarfPage bedarfpage() {
		return (bedarfpage == null) ? bedarfpage = new BedarfPage(driver) : bedarfpage;
	}
	
	public DateOfBirthPage dobpage() {
		return (dateofbirthpage== null) ? dateofbirthpage= new DateOfBirthPage(driver): dateofbirthpage;
	}
	
	public DienBedarfPage dienbedarfpage() {
		return (dienbedarfpage==null) ? dienbedarfpage= new DienBedarfPage(driver): dienbedarfpage;
	}
	
	public FamilySituationPage familysituationpage() {
		return (familysituationpage == null) ? familysituationpage = new FamilySituationPage(driver) : familysituationpage;
	}
	
	public FreeTimePage freetimepage() {
		return (freetimepage == null) ? freetimepage= new FreeTimePage(driver) : freetimepage;
	}
	
	public GenderSelectionPage genderselectionpage() {
		return (genderselectionpage ==null) ? genderselectionpage= new GenderSelectionPage(driver) : genderselectionpage;
	}
	
	public HealthInsurancePage healthinsurancepage() {
		return (healthinsurancepage ==null )? healthinsurancepage= new HealthInsurancePage(driver) : healthinsurancepage;
	}
	
	public InsurancePensionPage insurancepensionpage() {
		return (insurancepensionpage ==null) ? insurancepensionpage= new InsurancePensionPage(driver) :insurancepensionpage;
	}
	
	public JobTitlePage jobtitlepage() {
		return (jobtitlepage== null) ? jobtitlepage= new JobTitlePage(driver) : jobtitlepage;
	}
	
	public KinderInformationPage kinderinformationpage() {
		return (kinderinformationpage == null) ? kinderinformationpage= new KinderInformationPage(driver) : kinderinformationpage;
	}
	
	public LandingPage landingpage() {
		return (landingpage ==null ) ? landingpage= new LandingPage(driver): landingpage;
	}
	
	public LoginPageObject loginpage() {
		return (loginpage ==null) ? loginpage= new LoginPageObject(driver) : loginpage;
	}
	
	public PetAnimalPage petanimalpage() {
		return (petanimalpage == null)? petanimalpage = new PetAnimalPage(driver) : petanimalpage;
	}
	
	public ProfessionPage professionpage() {
		return (professionpage== null)? professionpage= new ProfessionPage(driver) : professionpage;
	}
	
	public RecommendationReadyPage recommendationreadypage() {
		return (recommendationreadypage== null)? recommendationreadypage= new RecommendationReadyPage(driver) : recommendationreadypage;
	}
	
	public SaveYourProgressPage saveyourprogresspage() {
		return (saveyourprogresspage == null) ? saveyourprogresspage= new SaveYourProgressPage(driver) : saveyourprogresspage;
	}
	
	public StayPage staypage() {
		return (staypage== null)? staypage= new StayPage(driver): staypage;
	}
	
	public UberBlickPage uberblickpage() {
		return (uberblickpage == null)? uberblickpage= new UberBlickPage(driver) : uberblickpage;
	}
	
	public VehicleOwnPage vehicleownpage() {
		return (vehicleownpage== null) ? vehicleownpage = new VehicleOwnPage(driver) : vehicleownpage;
	}
	
	public YearlyIncome  yearlyincomepage() {
		return (yearlyincomepage == null)? yearlyincomepage = new YearlyIncome(driver) : yearlyincomepage;
	}
	
	public PrivateAltersPage  privatealterspage() {
		return (privatealterspage == null)? privatealterspage = new PrivateAltersPage(driver) : privatealterspage;
	}
	
}
