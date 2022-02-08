package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
@CucumberOptions(features= "C:/Users/SKH/eclipse-workspace/SeleniumProject/src/test/java/feature/Login.feature"
                , glue="steps",
                monochrome=true,
                dryRun = true,
                snippets = SnippetType.CAMELCASE
                  )
public class Runner extends AbstractTestNGCucumberTests{

}
