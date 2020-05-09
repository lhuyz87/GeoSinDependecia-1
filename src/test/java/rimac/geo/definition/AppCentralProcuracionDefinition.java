package rimac.geo.definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import rimac.geo.step.AppCentralProcuracion;
import rimac.geo.util.ExcelUtilPropio;

public class AppCentralProcuracionDefinition {

	@Steps
	private AppCentralProcuracion appCentralProcuracion;

	// inout

	@Given("^copiar plantillas$")
	public void copiarPlantillas() {
		ExcelUtilPropio.getInstancia().copiarPlantillas();
	}
	
//	accedo al sistema Geolocalización Procurador Rimac con usuario "<usuario>" y password "<password>""
	@Given("^que accedo al sistema Geolocalización Procurador Rimac con usuario \"([^\"]*)\" y password \"([^\"]*)\"$")
	public void abrirGeo(String usuario, String password) {
		appCentralProcuracion.abrirGeo(usuario, password);
	}

//	realizo la busqueda de la placa "<placa>"  con atención en estado Solicitado
	@When("^realizo la busqueda de la placa \"([^\"]*)\"  con atención en estado Solicitado$")
	public void buscarPlaca(String placa) {
		appCentralProcuracion.buscarPlaca(placa);
	}
	
//	realizo la busqueda de la placa "<placa>"  con atención en estado Solicitado
	@And("^selecciona opción Asignar procurador$")
	public void seleccionaAsignarProcurador() {
		appCentralProcuracion.seleccionaAsignarProcurador();
	}
	
//	selecciono  de la lista el procurador "<procurador>"
	@Given("^selecciono  de la lista el procurador \"([^\"]*)\"$")
	public void seleccionarProcurador(String procurador) {
		appCentralProcuracion.seleccionarProcurador(procurador);
	}
	
//	And selecciono opción Asignar
	@And("^selecciono opción Asignar$")
	public void seleccionarAsignarProcuradorLista() {
		appCentralProcuracion.seleccionarAsignarProcuradorLista();
	}
	

	
//	la atención  seleccionada debe cambiar de estado "<estado>" a En camino
	@Then("^la atención  seleccionada debe cambiar de estado \"([^\"]*)\" a En camino$")
	public void validarCambioEstado(String estado) {
		appCentralProcuracion.validarCambioEstado(estado);
	}
}
