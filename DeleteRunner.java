package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features= "C:/Users/SKH/eclipse-workspace/SeleniumProject/src/test/java/feature/DeleteLead.feature"
, glue = "delete_Steps"
, monochrome = true
, dryRun = false
, snippets = SnippetType.CAMELCASE)
public class DeleteRunner extends AbstractTestNGCucumberTests
{

}
