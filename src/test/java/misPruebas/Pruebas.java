package misPruebas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import codigo.MiPrimerAuto;
import util.BrowserUtil;

public class Pruebas {
	private WebDriver driver;

//	@Test
//	public void testCase1() {
//		MiPrimerAuto objeto = new MiPrimerAuto(driver);
//		objeto.google("JAVA");
//	}
//	
//	@Test
//	public void testCase2() {
//		MiPrimerAuto objeto = new MiPrimerAuto(driver);
//		objeto.google("-1");
//	}
//	
//	@Test
//	public void testCase12() {
//		MiPrimerAuto objeto = new MiPrimerAuto(driver);
//		objeto.google2();
//	}
	
	@Test
	public void testBPD() {
		MiPrimerAuto objeto = new MiPrimerAuto(driver);
		objeto.bpd();
	}
	
	@Before
	public void initBrowser() {
		BrowserUtil.initChrome();
		driver = BrowserUtil.getDriver();
	}
	
	@After
	public void tearDown() {
		BrowserUtil.closeDriver();
	}
}
