package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.BrowserUtil;

public class BPDMainHeaderPO {
	private WebDriver driver;
	
	public BPDMainHeaderPO() {
		driver = BrowserUtil.getDriver();
	}
	
	public void abrirTarjetas() {
		WebElement tarjetasTab = driver.findElement(By.xpath("//a[contains(text(), 'TARJETAS')]"));
		tarjetasTab.click();
	}
	
	public void desplegarInfoTarjeta(String nombreTarjeta) {
		WebElement tarjeta = driver.findElement(By.xpath("//a[contains(text(), '" + nombreTarjeta + "')]"));
		tarjeta.click();
	}

}
