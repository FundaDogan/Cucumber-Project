package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)// bunu ekleyince class runnable oldu
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },

        monochrome=false,  // makes the gherkin code green on console.
        features = "./src/test/resources/features",
        glue = {"stepdefinitions","hooks"},
        dryRun = false,
        tags = "@MedunnaRoom"
)
public class Runner {
}

/*
 features = "./src/test/resources/features",//PATH OF FEATURES FOLDER
 glue = "stepdefinitions", //PATH OF STEP DEFINITIONS
 dryRun = false //IF dryRun = true. RUN DRY. JUST GIVE ME THE MISSING STEP DEFINITIONS. DON'T RUN THE TEST CASES.
 dryRun= false when we are doing test execution. dryRun=true when we are generation missing step definitions
*/
