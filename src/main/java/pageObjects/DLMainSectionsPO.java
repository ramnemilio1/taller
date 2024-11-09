package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.BrowserUtil;

public class DLMainSectionsPO {

	private WebDriver driver;
	private WebDriverWait wait;
	
	public DLMainSectionsPO() {
		driver = BrowserUtil.getDriver();
		wait = BrowserUtil.getWait();
	}
	
	public void abrirSeccionDeportes() {
		WebElement deportesTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/a[@title='Deportes' and @class='event']")));
		deportesTab.click();
	}
}
