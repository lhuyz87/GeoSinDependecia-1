package rimac.geo.xpath;

import rimac.geo.util.Constantes;

public class XpathPagPrincipalAtenVeh {

	// singleton
	private static XpathPagPrincipalAtenVeh obj = null;

	private XpathPagPrincipalAtenVeh() {
	}

	public static XpathPagPrincipalAtenVeh getInstancia() {
		instanciar();
		return obj;
	}

	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathPagPrincipalAtenVeh();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

		
	public final String btnNuevoCaso ="//span[text()='Nuevo caso']";
	public final String msjRegistroExito="//div[contains(text(),'Registro')]";
	public final String msjPlacaDuplicada="//div[contains(text(),'El caso no puede ser registrado')]";
	public final String msjRegistroPlacaExis="//div[contains(text(),'Registrado')]";
	public final String txtPlaca="//input[@name='form_search']";
	public final String lblEstadoFiltrado="//td[@class='red']";
	public final String btnBuscar="//input[@name='form_submit']";
	
	
}
