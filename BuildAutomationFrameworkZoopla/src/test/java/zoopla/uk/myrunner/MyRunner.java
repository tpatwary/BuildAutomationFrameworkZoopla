package zoopla.uk.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" },		 	
		features = {".//Features/"}, 
        glue = {"zoopla.uk.stepdefinations",}, 	
		dryRun = false, 
		monochrome = true, 
		strict = false,
		tags = "@Sanity")   
public class MyRunner extends AbstractTestNGCucumberTests {

}