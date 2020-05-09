package rimac.geo.xpath;

import rimac.geo.util.Constantes;

public class XpathNuevoCaso {

	// singleton
	private static XpathNuevoCaso obj = null;

	private XpathNuevoCaso() {
	}

	public static XpathNuevoCaso getInstancia() {
		instanciar();
		return obj;
	}

	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathNuevoCaso();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

		
	public final String txtPlaca ="//*[@name='form_caso_placa']";
	public final String txtTelefono ="//*[@name='form_caso_telephone']";
	public final String txtDireccion ="//*[@name='Demo__input']";
	public final String txtSelDireccion ="//*[@name='Demo__input']//following :: input[1]";
	public final String lstDistrito ="//div[text()='Selecciona un distrito']";
	public final String btnDepartamente ="//div[text()='Selecciona un Departamento']";
	public final String txtReferencia ="//textarea[@name='form_caso_referencia']";
	public final String chkCasoespecial ="//label[text()='Caso especial']//following :: input[1]";
	public final String btnCasoBBVA ="//label[@style='width: 28%;']//following :: input[1]";
	public final String btnEnviar ="//input[@value='Enviar']";
	public final String btnNuevoCaso ="//span[text()='Nuevo caso']";
	public final String lblCoordenadas = "//input[@name='form_caso_coordenadas']";
	
	
}
