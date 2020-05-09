package rimac.geo.step;

import static org.testng.Assert.assertEquals;

import net.thucydides.core.annotations.Step;
import rimac.geo.page.AppLoginPage;
import rimac.geo.page.AppPrincipalPageCentProc;
import rimac.geo.page.AppRegistrarCaso;

public class AppCentralProcuracion {

	// page
	private AppLoginPage appLoginPage;
	private AppPrincipalPageCentProc appPrincipalPageCentProc;
	private AppRegistrarCaso appRegistrarCaso;

	@Step
	public void abrirGeo(String usuario, String password) {
		appLoginPage.inicializar();
		appLoginPage.ingresarUsuario(usuario, password);
	}
	

	@Step
	public void buscarPlaca(String placa) {
		appPrincipalPageCentProc.buscarPlaca(placa);
	}
	
	@Step
	public void seleccionaAsignarProcurador() {
		appPrincipalPageCentProc.seleccionaAsignarProcurador();
	}
	
	public void seleccionarProcurador(String procurador) {
		
		appPrincipalPageCentProc.seleccionarProcurador(procurador);
		
	}
	
	public void seleccionarAsignarProcuradorLista() {
		appPrincipalPageCentProc.seleccionarAsignarProcuradorLista();
	}
	
	public void validarCambioEstado(String estado) {
		String estadoMostrado = appPrincipalPageCentProc.validarCambioEstado();
		assertEquals(estado, estadoMostrado);
	}
}
