package Stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Cucumber_features",glue="Stepdefination",tags="not @smoke",monochrome=true,plugin= {"pretty","html:target\\cucumberreport.html",
		"pretty","json:target\\cucumberreport.json"}
)
public class runner {
	
}
