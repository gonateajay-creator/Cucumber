package Stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Cucumber_features/demoblaze.feature",glue="Stepdefination",
tags="@smoke and @regression",monochrome=true,
plugin= {"pretty","html:target\\cucumberreport2.html",
		"pretty","json:target\\cucumberreport2.json"}
)
public class runner {

}
