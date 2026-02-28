package Stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Cucumber_features/Fblogin.feature",glue="Stepdefination")
public class runner {
	
}
