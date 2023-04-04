package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.model.Feature;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

  features = "C:\\Users\\rajiv\\IdeaProjects\\BDDFrameworkRegister\\src\\test\\resources\\Features\\Register.feature",

   glue = { "StepDefinitions"},
   format = {"pretty","html:htmlReport","json:json/cucumber.json","junit:junit/cucumber.xml"}



)
public class TestRunner
{

}
