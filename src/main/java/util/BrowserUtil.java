package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserUtil {
 private static WebDriver driver;
	
	public static void initChrome() {
		driver = new ChromeDriver();
	}
	
	public static void initEdge() {
		driver = new EdgeDriver();
	}
	
	public static WebDriver getDriver() {
		System.out.println("Devolviendo Driver");
		return driver;
	}
	
	public static void closeDriver() {
		System.out.println("Cerrando Driver");
		driver.close();
	}
}
