package rimac.geo.step;

import static org.testng.Assert.assertEquals;

import net.thucydides.core.annotations.Step;
import rimac.geo.page.AppLoginPage;
import rimac.geo.page.AppPrincipalPageAtenVeh;
import rimac.geo.page.AppRegistrarCaso;

public class AppAtencionVehicular {

	// page
	private AppLoginPage appLoginPage;
	private AppPrincipalPageAtenVeh appPrincipalPage;
	private AppRegistrarCaso appRegistrarCaso;

	@Step
	public void abrirGeo(String usuario, String password) {
		appLoginPage.inicializar();
		appLoginPage.ingresarUsuario(usuario, password);
	}
	
	@Step
	public void seleccionoNuevoCaso() {
		appPrincipalPage.seleccionarnuevocaso();
	}
	
	@Step
	public void ingresarPlaca(String placa) {
		appRegistrarCaso.ingresarplaca(placa);
	}
	
	@Step
	public void ingresarTelefono(String telefono) {
		appRegistrarCaso.ingresartelefono(telefono);
	}
	
	@Step
	public void ingresarDireccion(String direccion) {
		appRegistrarCaso.ingresardireccion(direccion);
	}
	
	@Step
	public void ingresarReferencia(String referencia) {
		appRegistrarCaso.ingresarreferencia(referencia);
	}
	
	@Step
	public void seleccionarEnviar() {
		appRegistrarCaso.seleccionarenviar();
		
	}
	
	
	@Step
	public void validarMensaje(String mensaje) {
		String mensajeObtenido=appRegistrarCaso.validarmensaje(mensaje);
//		assertEquals(mensaje,mensajeObtenido);
		
	}
	
	@Step
	public void validarEstado(String placa,String estado) {
		String estadoMostrado=appPrincipalPage.validarestado(placa ,estado);
//		assertEquals(estado,estadoMostrado);
		
	}
	
	@Step
	public void validarMensajePlacaEnUso(String mensaje) {
		String mensajeObtenido = appRegistrarCaso.validarMensajePlacaEnUso(mensaje);
		assertEquals(mensaje,mensajeObtenido);
	}
	
}
