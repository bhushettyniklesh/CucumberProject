package Stepsdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//TDD class last from 2nd class page 91 in sharepoint 
@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome= true,
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},  //to generate html report we use this html:target
	features="src/test/java/features",
	glue="Stepsdefs",
	tags= {"@Sanity"}
		//tags = {"@WIP"}  // to run a work in progress scenario
				//tags = {"@Sanity"} // to run all the sanity scenarios
				//tags= {"@Regression or @Sanity"} // either Regression or sanity
				//tags= {"@Regression and @Sanity"} // both the tags should be there
				//tags = {"@Calculator"} // feature level tag
				//tags = {"not @WIP"} // run all the scenarios except WIP
				//tags = {"@Browser and not @WIP"} // run all the browser scenarios except WIP
         // to run command in promt we use mvn clean test before that add build in pom.xml
)

public class TestRunner {

}
