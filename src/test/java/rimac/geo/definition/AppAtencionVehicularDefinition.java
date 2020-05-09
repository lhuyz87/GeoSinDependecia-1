package rimac.geo.definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import rimac.geo.step.AppAtencionVehicular;



public class AppAtencionVehicularDefinition {

	@Steps
	private AppAtencionVehicular appGeoStep;

	// inout


//	accedo al sistema Geolocalización Rimac con usuario "<usuario>" y password "<password>"
	@Given("^que accedo al sistema Geolocalización Rimac con usuario \"([^\"]*)\" y password \"([^\"]*)\"$")
	public void abrirGeo(String usuario, String password) {
		appGeoStep.abrirGeo(usuario, password);
	}

//	selecciono opción Nuevo Caso
	
	@And("^selecciono opción Nuevo Caso$")
	public void nuevoCaso() {
		appGeoStep.seleccionoNuevoCaso();
	}
	
//	ingreso placa "<placa>" valida
	@And("^ingreso placa \"([^\"]*)\"$")
	public void ingresarPlaca(String placa) {
		appGeoStep.ingresarPlaca(placa);
	}
	
//	ingreso número de telefono "<telefono>"
	@And("^ingreso número de telefono \"([^\"]*)\"$")
	public void ingresarTelefono(String telefono) {
		appGeoStep.ingresarTelefono(telefono);
	}
	
//	ingreso la  dirección "<direccion>"
	@And("^ingreso la  dirección \"([^\"]*)\"$")
	public void ingresarDireccion(String direccion) {
		appGeoStep.ingresarDireccion(direccion);
	}
	
//	ingreso la referencia "<referencia>"
	@And("^ingreso la referencia \"([^\"]*)\"$")
	public void ingresarReferencia(String referencia) {
		appGeoStep.ingresarReferencia(referencia);
	}
	//selecciono opción Enviar
	@Given("^selecciono opción Enviar$")
	public void seleccionarEnviar() {
		appGeoStep.seleccionarEnviar();
	}
	
	//se muestra mensaje "<mensaje>" de generación de caso exitoso
	@Then("^se muestra mensaje \"([^\"]*)\" de generación de caso exitoso$")
	public void validarMensaje(String mensaje) {
		appGeoStep.validarMensaje(mensaje);
	}
	
	//al filtrar la placa "<placa>" en la pantalla principal se muestra el caso creado con estado "<estado>" Solicitado
	@And("^al filtrar la placa \"([^\"]*)\" en la pantalla principal se muestra el caso creado con estado \"([^\"]*)\" Solicitado$")
	public void validarEstadoAtencion(String placa ,String estado) {
		appGeoStep.validarEstado(placa,estado);
	}
	
	//se muestra mensaje "<mensaje>" restrictivo relacionado a que ya se encuetra la placa ingreada en atención.
	@Then("^se muestra mensaje \"([^\"]*)\" restrictivo relacionado a que ya se encuetra la placa ingreada en atención.$")
	public void validarMensajePlacaEnUso(String mensaje) {
		appGeoStep.validarMensajePlacaEnUso(mensaje);
	}
}
