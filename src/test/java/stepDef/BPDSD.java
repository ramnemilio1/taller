package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.BPDMainHeaderPO;
import pageObjects.BPDTarjetasPO;
import util.BrowserUtil;

public class BPDSD {

	@Then("I go to BPD")
	public void goToBPD() {
		BrowserUtil.getDriver().get("https://popularenlinea.com/personas/Paginas/Home.aspx");
	}
	
	@And("I click Tarjetas {string}")
	public void clickTarjeta(String tarjeta) {
		BPDMainHeaderPO po = new BPDMainHeaderPO();
		po.abrirTarjetas();
		po.desplegarInfoTarjeta(tarjeta);
	}
	
	@Then("I print the benefits")
	public void imprimirBeneficios() {
		BPDTarjetasPO po = new BPDTarjetasPO();
		po.impresionDeBeneficios();
	}
}
