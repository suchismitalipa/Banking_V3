package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/Customer.feature",
		//features=".//Features/",
		//features= {".//Features/Customer.feature",".//Features/Login.feature"},
		glue="Step_Defination",
		dryRun=false,
		monochrome=true,//display console output in proper format
		plugin= {"pretty","html:test-output"},
		tags = {"@sanity,@regression"} //it depicts OR","
		//tags = {"@sanity","@regression"} it depicts AND"","" 
		
		)

public class TestRun {

}
