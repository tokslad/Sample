package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepdefs", "utilities"},
        features = {"src/test/resources/features"},
        plugin = {"json:target/cucumber/cucumber.json"},
        tags = "@test")

public class CucumberRunner{

}
