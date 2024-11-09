package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.BrowserUtil;

public class DLNoticiasPO {

	private WebDriver driver;
	private WebDriverWait wait;
	
	public DLNoticiasPO() {
		driver = BrowserUtil.getDriver();
		wait = BrowserUtil.getWait();
	}
	
	public void imprimirNoticias() {
		WebElement noticia = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2/a)[1]")));
		System.out.print(noticia.getText());
	}
}
