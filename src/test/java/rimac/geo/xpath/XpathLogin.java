package rimac.geo.xpath;

import rimac.geo.util.Constantes;

public class XpathLogin {

	// singleton
	private static XpathLogin obj = null;

	private XpathLogin() {
	}

	public static XpathLogin getInstancia() {
		instanciar();
		return obj;
	}

	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathLogin();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	
	public final String usuario ="//*[@name='login_nro_documento']";
	public final String password="//*[@name='login_contrasena']";
	public final String ingresar="//*[@value='Ingresar']";
}
