package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.BrowserUtil;

public class BPDTarjetasPO {

	private WebDriver driver;

	public BPDTarjetasPO() {
		driver = BrowserUtil.getDriver();
	}

	public void impresionDeBeneficios() {
		List<WebElement> beneficios = driver.findElements(By.xpath("//div[contains(@class, 'beneficiosCuadro')]"));
		for (int i = 0; i < beneficios.size(); i++) {
			WebElement beneficio = beneficios.get(i);
			WebElement p = beneficio.findElement(By.tagName("p"));
			WebElement span;
			try {
				span = beneficio.findElement(By.tagName("span"));
			} catch (Exception e) {
				span = beneficio.findElement(By.tagName("h4"));
				System.out.print("ESTOY IGNORANDO -> " + e.getMessage());
			}
			System.out.println("BENEFICIO: " + span.getText() + " " + p.getText());
		}
	}
}
