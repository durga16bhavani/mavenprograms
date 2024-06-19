package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//test//java//features//OrangeHRM.feature",
		glue="stepDef",
		plugin= {"pretty","html:target/OrangeLogin_Reports.html"},
		monochrome=true
        )
public class OrangeLoginRunner {

}
