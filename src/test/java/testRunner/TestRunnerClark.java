package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Clark/Insurance.feature",glue= {"stepDefinition"},
		monochrome=true,
		plugin= {"pretty","html:target/HtmlReports"}, tags="@test",publish = true
				)

public class TestRunnerClark {

}
