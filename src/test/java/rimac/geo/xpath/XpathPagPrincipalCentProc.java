package rimac.geo.xpath;

import rimac.geo.util.Constantes;

public class XpathPagPrincipalCentProc {

	// singleton
	private static XpathPagPrincipalCentProc obj = null;

	private XpathPagPrincipalCentProc() {
	}

	public static XpathPagPrincipalCentProc getInstancia() {
		instanciar();
		return obj;
	}

	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathPagPrincipalCentProc();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

		
	
	public final String msjRegistroExito="//div[contains(text(),'Registro')]";
	public final String msjRegistroPlacaExis="//div[contains(text(),'Registrado')]";
	
	
	public final String txtPlaca="//input[@name='form_search']";
	public final String lblEstadoFiltrado="//td[text()='En camino']";
	public final String btnBuscar="//input[@name='form_submit']";
	public final String btnDerivarFiltrado="//div[@class='c-table visible-md-block visible-lg-block tb-procurador' ]//*[@type='button'and @title='Seleccionar Procurador' ]";
	public final String lstSelAgrupador="//select[@name='form_caso_proveedor']";
	public final String btnAsignar ="//input[@value='Asignar']";
}
