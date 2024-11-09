package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:./target/report/BPD.html"},
				 features = "src/test/resources/features",
				 glue = "stepDef",
				 tags = "@BPD"
				 )
public class BPDRunner {

}
