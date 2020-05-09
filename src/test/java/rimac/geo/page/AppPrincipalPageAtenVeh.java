package rimac.geo.page;

//import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.openhtmltopdf.util.GeneralUtil;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import rimac.geo.util.PageObjectUtil;
import rimac.geo.xpath.XpathPagPrincipalAtenVeh;



public class AppPrincipalPageAtenVeh extends PageObject {

	// propios
	private WebDriverWait wdw = null;
	private long wdwTimeOut = 300L;

	// xpath
	protected XpathPagPrincipalAtenVeh xpathPagPrincipal = XpathPagPrincipalAtenVeh.getInstancia();

	// util
	protected PageObjectUtil pageObjectUtil = PageObjectUtil.getInstancia();


	public long getWdwTimeOut() {
		return wdwTimeOut;
	}

	

	protected WebDriverWait getWDW() {
		// return new WebDriverWait(getDriver(), wdwTimeOut, wdwPollingEvery);
		if (wdw == null) {
			// wdw = new WebDriverWait(getDriver(), 300L, 1L);
			wdw = new WebDriverWait(getDriver(), wdwTimeOut, 1L);
		}

		return wdw;
	}

	
	public void seleccionarnuevocaso() {
		pageObjectUtil.sleep(3);
		pageObjectUtil.seleniumClickUntil(getDriver(), getWDW(), xpathPagPrincipal.btnNuevoCaso);
		
	}
	
	public String validarestado(String placa,String estado) {
		
		pageObjectUtil.seleniumEscribirUntil(getDriver(), getWDW(), xpathPagPrincipal.txtPlaca, placa, null);
		pageObjectUtil.seleniumClickUntil(getDriver(), getWDW(), xpathPagPrincipal.btnBuscar);
		pageObjectUtil.sleep(4);
		Serenity.takeScreenshot();
		String estadoMostrado=pageObjectUtil.seleniumGetTexto(getDriver(), xpathPagPrincipal.lblEstadoFiltrado, 0);
		
		return estadoMostrado;
		}
	
}
