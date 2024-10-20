package co.com.example.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/example.feature",
        tags = "@stories",
        glue = "co.com.example.certification.stepdefiinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {

}
