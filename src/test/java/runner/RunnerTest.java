package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import support.DriverQA;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = {

		"src/test/resources/features/buscaDiretorFilme.feature",
		"src/test/resources/features/testeApi.feature"
		
		
}, plugin = {"json:target/reports/CucumberReport.json"},
        glue = "steps",
        snippets = SnippetType.CAMELCASE,
        monochrome = true)

public class RunnerTest {
		
   }
