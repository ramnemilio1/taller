package stepDef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;
import util.BrowserUtil;

public class CommonSD {
	
	@When("I open CHROME")
	public void openChrome() {
		BrowserUtil.initChrome();
	}
	
	@When("I open EDGE")
	public void openEDGE() {
		BrowserUtil.initEdge();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		//TIRAR UN SCREENSHOT SI FALLA
		if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) BrowserUtil.getDriver())
                        .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot"); 
    }
		//CERRAR EL BROWSER
		BrowserUtil.closeDriver();
;	}

}
