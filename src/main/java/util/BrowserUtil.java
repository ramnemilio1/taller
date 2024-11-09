package util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtil {
 private static WebDriver driver;
 private static WebDriverWait wait;
 private static WebDriverWait waitLonger;
	
	public static void initChrome() {
		driver = new ChromeDriver();
		initWaits();
	}
	
	public static void initEdge() {
		driver = new EdgeDriver();
		initWaits();
	}
	
	public static WebDriver getDriver() {
		System.out.println("Devolviendo Driver");
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void closeDriver() {
		System.out.println("Cerrando Driver");
		driver.quit();
	}
	
	public static void initWaits() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitLonger = new WebDriverWait(driver, Duration.ofSeconds(45));		
	}
	
	public static WebDriverWait getWait() {
		return wait;
	}
	
	public static WebDriverWait getWaitLonger() {
		return waitLonger;
	}
}
