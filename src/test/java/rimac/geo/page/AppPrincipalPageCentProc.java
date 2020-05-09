package rimac.geo.page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ibm.icu.impl.InvalidFormatException;
import com.openhtmltopdf.util.GeneralUtil;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import rimac.geo.util.Constantes;
import rimac.geo.util.ExcelUtil;
import rimac.geo.util.PageObjectUtil;
import rimac.geo.xpath.XpathPagPrincipalCentProc;


public class AppPrincipalPageCentProc extends PageObject {

	// propios
	private WebDriverWait wdw = null;
	private long wdwTimeOut = 300L;

	// xpath
	protected XpathPagPrincipalCentProc xpathPagPrincipal = XpathPagPrincipalCentProc.getInstancia();

	// util
	protected PageObjectUtil pageObjectUtil = PageObjectUtil.getInstancia();
	protected ExcelUtil excelUtil = new ExcelUtil();
	public long getWdwTimeOut() {
		return wdwTimeOut;
	}
	
	public static String GlobalPlaca="";
	public static int  GlobalFila=1;

	

	protected WebDriverWait getWDW() {
		// return new WebDriverWait(getDriver(), wdwTimeOut, wdwPollingEvery);
		if (wdw == null) {
			// wdw = new WebDriverWait(getDriver(), 300L, 1L);
			wdw = new WebDriverWait(getDriver(), wdwTimeOut, 1L);
		}

		return wdw;
	}

	
	public void buscarPlaca(String placa) {
		pageObjectUtil.sleep(3);
		pageObjectUtil.seleniumEscribirUntil(getDriver(), getWDW(), xpathPagPrincipal.txtPlaca, placa, null);
		pageObjectUtil.seleniumClickUntil(getDriver(), getWDW(), xpathPagPrincipal.btnBuscar);
		
		GlobalPlaca=placa;
	}
	
	
	
	
	public void seleccionaAsignarProcurador() {
		pageObjectUtil.sleep(3);
		pageObjectUtil.seleniumClickUntil(getDriver(), getWDW(), xpathPagPrincipal.btnDerivarFiltrado);
		
	}
	
	public void seleccionarProcurador(String procurador) {
		pageObjectUtil.sleep(3);
		pageObjectUtil.seleniumComboSelect(getDriver(), xpathPagPrincipal.lstSelAgrupador, procurador);
//		pageObjectUtil.seleniumClickUntil(getDriver(), getWDW(), xpathPagPrincipal.lstSelAgrupador);
//		pageObjectUtil.sleep(1);
//		pageObjectUtil.insertarKey(getDriver(),xpathPagPrincipal.lstSelAgrupador ,Keys.DOWN);
//		pageObjectUtil.sleep(1);
//		pageObjectUtil.insertarKey(getDriver(),xpathPagPrincipal.lstSelAgrupador ,Keys.ENTER);
//		

		try {
			excelUtil.inciarExcel(Constantes.featRutaMobile, "Mobile");
			int fila = excelUtil.buscar_valor( 1,GlobalPlaca);
			System.out.println("************   " + fila);
			excelUtil.WriteCell(2, fila, procurador);
			excelUtil.CloseExcel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		
		
	}
	
	public void seleccionarAsignarProcuradorLista() {
		pageObjectUtil.sleep(2);
		pageObjectUtil.seleniumClickUntil(getDriver(), getWDW(), xpathPagPrincipal.btnAsignar);
		pageObjectUtil.sleep(3);
	}
	
	public String validarCambioEstado() {
		
		
		pageObjectUtil.waitForPageLoad(getDriver());
		pageObjectUtil.seleniumUntil(getDriver(), getWDW(),  xpathPagPrincipal.lblEstadoFiltrado);
//		pageObjectUtil.sleep(15);
		Serenity.takeScreenshot();	
		String estadoMostrado= pageObjectUtil.seleniumGetTexto(getDriver(), xpathPagPrincipal.lblEstadoFiltrado, 0);
		System.out.println("MENSAJE MOSTRADO  "  + estadoMostrado );
			
		return estadoMostrado;
	}
	
}
