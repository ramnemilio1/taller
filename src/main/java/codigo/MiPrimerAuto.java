package codigo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MiPrimerAuto {
	private WebDriver driver;
	
	public MiPrimerAuto(WebDriver driver) {
		this.driver = driver;
	}
	
	public void google(String str) {		
		driver.get("https://www.google.com/");
		WebElement barraBusqueda = driver.findElement(By.name("q"));
		barraBusqueda.sendKeys(str + Keys.ENTER);
	}
	
	public void google2() {
		driver.get("https://www.google.com/");
		WebElement barraBusqueda = driver.findElement(By.name("q"));
		barraBusqueda.sendKeys("SELENIUM JAVA");
		WebElement boton = driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));
		boton.click();
	}
	
	public void bpd() {
		driver.get("https://popularenlinea.com/");
		driver.manage().window().maximize();
		
		//CLick en tab tarjetas
		WebElement tarjetasTab = driver.findElement(By.xpath("//a[contains(text(), 'TARJETAS')]"));
		tarjetasTab.click();
		
		//CLick en tarjeta
		WebElement tarjeta = driver.findElement(By.xpath("//a[contains(text(), 'Visa ISI')]"));
		tarjeta.click();
		
		//Imprimir beneficios
		List<WebElement> beneficios = driver.findElements(By.xpath("//div[contains(@class, 'beneficiosCuadro')]"));
		for(int i=0; i< beneficios.size(); i++) {
			WebElement beneficio = beneficios.get(i);
			WebElement p = beneficio.findElement(By.tagName("p"));
			WebElement span = beneficio.findElement(By.tagName("span"));
			System.out.println("BENEFICIO: "+ span.getText() + " " +p.getText() );			
		}
	}
}

