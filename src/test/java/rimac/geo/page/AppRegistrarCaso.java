package rimac.geo.page;

import java.io.IOException;

import org.jruby.RubyProcess.Sys;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ibm.icu.impl.InvalidFormatException;

import net.serenitybdd.core.Serenity;
import junit.framework.TestCase;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.waits.Wait;
import net.sourceforge.htmlunit.corejs.javascript.regexp.SubString;
import net.thucydides.core.annotations.DefaultUrl;
import rimac.geo.util.Constantes;

import rimac.geo.util.PageObjectUtil;
import rimac.geo.xpath.XpathNuevoCaso;
import rimac.geo.xpath.XpathPagPrincipalAtenVeh;
import rimac.geo.util.ExcelUtil;


public class AppRegistrarCaso extends PageObject {

	// propios
	private WebDriverWait wdw = null;
	private long wdwTimeOut = 300L;

	// xpath
	protected XpathNuevoCaso xpathNuevoCaso = XpathNuevoCaso.getInstancia();
	protected XpathPagPrincipalAtenVeh xpathPagPrincipal = XpathPagPrincipalAtenVeh.getInstancia();
	// util
	protected PageObjectUtil pageObjectUtil = PageObjectUtil.getInstancia();
	protected ExcelUtil excelUtil = new ExcelUtil();

	
	public static String GlobalPlaca="";
	public static int  GlobalFila=1;


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

	
	public void ingresarplaca(String placa) {
		
		pageObjectUtil.seleniumUntil(getDriver(), getWDW(), xpathNuevoCaso.txtPlaca);
		pageObjectUtil.sleep(5);
		pageObjectUtil.seleniumEscribirUntil(getDriver(), getWDW(), xpathNuevoCaso.txtPlaca, placa, null);
		
		//almacen la placa en variable global
		GlobalPlaca=placa;
		
	}
	
	public void ingresartelefono(String telefono) {
		pageObjectUtil.sleep(4);
		pageObjectUtil.seleniumEscribirUntil(getDriver(), getWDW(), xpathNuevoCaso.txtTelefono, telefono, null);
	}
	
	public void ingresardireccion(String direccion) {
		
		pageObjectUtil.seleniumEscribirUntil(getDriver(), getWDW(), xpathNuevoCaso.txtDireccion, direccion, Keys.DOWN);
		pageObjectUtil.insertarKey(getDriver(),xpathNuevoCaso.txtDireccion ,Keys.ENTER);
		pageObjectUtil.sleep(2);
		
		
		
	}
	
	public void ingresarreferencia(String referencia) {
		
		pageObjectUtil.seleniumEscribirUntil(getDriver(), getWDW(), xpathNuevoCaso.txtReferencia, referencia, Keys.TAB);
	}
	
	public void seleccionarenviar() {
		
		String Coordenadas=pageObjectUtil.obtenerAtributo(getDriver(), getWDW(), xpathNuevoCaso.lblCoordenadas, "value");

		try {
			excelUtil.inciarExcel(Constantes.featRutaMobile, "Mobile");
			excelUtil.WriteCell(0, GlobalFila, Coordenadas);
			excelUtil.WriteCell(1, GlobalFila, GlobalPlaca);
			excelUtil.CloseExcel();
		} catch (IOException e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		GlobalFila = GlobalFila +1;

		
		
		
		pageObjectUtil.seleniumClickUntil(getDriver(), getWDW(), xpathNuevoCaso.btnEnviar);
		}
	
	public String  validarmensaje(String mensaje) {
		
		pageObjectUtil.esperar_visibilidad_elemento(getDriver(), 10, xpathPagPrincipal.msjRegistroExito);
		Serenity.takeScreenshot();
		String mensajeObtenido =pageObjectUtil.seleniumGetTexto(getDriver(), xpathPagPrincipal.msjRegistroExito, 0);
		
		return mensajeObtenido;
		

	}
	
	public String validarMensajePlacaEnUso(String mensaje) {
		
		
		
		pageObjectUtil.esperar_visibilidad_elemento(getDriver(), 5, xpathPagPrincipal.msjPlacaDuplicada);
		Serenity.takeScreenshot();
		String mensajeObtenido =pageObjectUtil.seleniumGetTexto(getDriver(), xpathPagPrincipal.msjPlacaDuplicada, 0).substring(0,82);
		
		System.out.println("MENSAJE "  + mensajeObtenido);	

		return mensajeObtenido;
		
	}
	

	
}
