package rimac.geo.page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ibm.icu.impl.InvalidFormatException;
import com.openhtmltopdf.pdfboxout.PagePosition;
import com.openhtmltopdf.util.GeneralUtil;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import rimac.geo.util.ExcelUtil;
import rimac.geo.util.PageObjectUtil;
import rimac.geo.xpath.XpathLogin;


@DefaultUrl("http://test-geo.rimac.com/geo/login")
public class AppLoginPage extends PageObject {

	// propios
	private WebDriverWait wdw = null;
	private long wdwTimeOut = 300L;

	// xpath
	protected XpathLogin xpathLogin = XpathLogin.getInstancia();

	// util
	protected PageObjectUtil pageObjectUtil = PageObjectUtil.getInstancia();

	protected ExcelUtil excelUtil = new ExcelUtil();

	public long getWdwTimeOut() {
		return wdwTimeOut;
	}

	public void inicializar() {
//		System.out.println("+++++++++++++++INICIALIZAR TEST +++++++++++++++++" );
//		String path = System.getProperty("src/test/resources/driver/chromedriver-79");
//		System.setProperty("webdriver.chrome.driver",path);
		
		open();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		// getDriver().manage().window().fullscreen();
		getDriver().manage().timeouts().implicitlyWait(1L, TimeUnit.SECONDS);
	}

	protected WebDriverWait getWDW() {
		// return new WebDriverWait(getDriver(), wdwTimeOut, wdwPollingEvery);
		if (wdw == null) {
			// wdw = new WebDriverWait(getDriver(), 300L, 1L);
			wdw = new WebDriverWait(getDriver(), wdwTimeOut, 1L);
		}

		return wdw;
	}

	
	public void ingresarUsuario(String usuario, String password) {
		
		// Escribir usuario y password
	
		pageObjectUtil.seleniumEscribirUntil(getDriver(), getWDW(), xpathLogin.usuario, usuario, Keys.ENTER);
		
		pageObjectUtil.seleniumEscribirUntil(getDriver(), getWDW(), xpathLogin.password, password, null);
		
		// Seleccionar opción ingresar
		
		pageObjectUtil.seleniumClickUntil(getDriver(), getWDW(), xpathLogin.ingresar);
		
		pageObjectUtil.sleep(3);
		
	}
	
	
}
