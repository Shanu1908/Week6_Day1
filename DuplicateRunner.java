package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features= "C:/Users/SKH/eclipse-workspace/SeleniumProject/src/test/java/feature/Duplicate.feature"
, glue = "duplicate_Steps"
, monochrome = true
, dryRun = false
, snippets = SnippetType.CAMELCASE)
public class DuplicateRunner extends AbstractTestNGCucumberTests
{

}
