package rimac.geo.util;

public class Constantes {

	// caracteres unicode
	public static final String a = "\u00e1";
	public static final String e = "\u00e9";
	public static final String i = "\u00ed";
	public static final String o = "\u00f3";
	public static final String u = "\u00fa";
	public static final String enie = "\u00f1";
	public static final String A = "\u00c1";
	public static final String E = "\u00c9";
	public static final String I = "\u00cd";
	public static final String O = "\u00d3";
	public static final String U = "\u00da";
	public static final String Enie = "\u00d1";
	public static final String pleca = "\u007C";

	// SAS
	public static final String sas = "SAS";
	public static final String sas2 = "SAS2";
	// SAS - modulos
	public static final String sasModAcuerdos = "Acuerdos";
	public static final String sasOptTransacciones = "Transacciones";
	public static final String sasOptCotizar = "Cotizar";
	public static final String sasOptPoliza = "Poliza";
	public static final String sasOptEmisionVidaLey = "EmisionVidaLey";
	public static final String sasPesRegistrarCotizacion = "RegistrarCotizacion";
	public static final String sasPesMantenimientoCotizacion = "MantenimientoCotizacion";
	public static final String sasPesMantenimientoPoliza = "MantenimientoPoliza";
	// SAS - base datos
	public static final String sasBdServer = "rsdce-scan.rimac.com.pe";
	public static final String sasBdPuerto = "1521";
	public static final String sasBdSid = "BDSAST3";
	public static final String sasBdUser1 = "JMENDOZA";
	public static final String sasBdPass1 = "sqa2015p";
	public static final String sasBdServer2 = "172.25.32.40";
	public static final String sasBdSid2 = "SRV_TEST";
	public static final String sasBdUser2 = "sandrade";
	public static final String sasBdPass2 = "sqa2020p";
	public static final String sasPreProd1 = "SASPREPROD";
	public static final String sasPreProd2 = "SAS_PRE";
	// AE
	public static final String ae = "AE";
	public static final String ae2 = "AE2";
	// AE - modulos
	public static final String aeModClienteI = "ClienteI";
	public static final String aeOptEstCue = "EstadosCuenta";
	public static final String aeModOperacion = "Operacion";
	public static final String aeOptCotSusEdi = "CotizacionSuscripcionEdicion";
	public static final String aeOptCotSusManEdi = "CotizacionSuscripcionMantenimientoEdicion";
	public static final String aeModMantenimiento = "Mantenimiento";
	public static final String aeOptOperacionesVida = "OperacionesVida";
	public static final String aeOptMostrarPrestamos = "MostrarPrestamos";
	public static final String aeOptAdmTareas = "AdministradorTareas";
	public static final String aeOptEjecTareas = "EjecucionTareas";
	public static final String aeOptSiniestros = "Siniestros";
	public static final String aeOptCrearSiniestro = "CreacionSiniestro";
	public static final String aeOptMantenimientoSiniestro = "MantenimientoSiniestro";
	public static final String aeOptMovimientoPolizas = "MovimientoPolizas";
	// AE - base datos
	public static final String aeBdServer = "rsdce-scan.rimac.com.pe";
	public static final String aeBdPuerto = "1521";
	public static final String aeBdSid = "BDVIDAD";
	public static final String aeBdUser1 = "APP_VIDA";
	public static final String aeBdPass1 = "ap$5342a";
	public static final String aeBdUser2 = "CONSULTA_AE";
	public static final String aeBdPass2 = "C$s8u2D5$b";

	// data driven y otros archivos
	public static final String usar = "X";
	private static final String res = "src/test/resources/dataDriven/";
	public static final String rutaPlantillas = res + "0_plantillas/";
	public static final String ruta = res + System.getProperty("user.name") + "/";

	// features
	public static final String featRuta = "src/test/resources/features/";
	public static final String featLlave = "###DATOS###@";

	// base datos
	public static final String bdOracle = "oracle";
	public static final String bdMysql = "mysql";
	// public static final String bdSqlServer = "sqlserver";
	
	//dataMobile
	public static final String featRutaMobile = "src/test/resources/dataDriven/dataMobile/DataForMobile.xlsx";
	

	// EPI constantes
	public static final String protocolo = "https";
	public static final String host = "ampdpka8l5.execute-api.us-east-1.amazonaws.com";
	public static final String accessKey = "AKIAW6L6BAXN6DVTJVEF";
	public static final String secretKey = "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";
	public static final String serviceName = "execute-api";
	public static final String region = "us-east-1";
	public static final String AhorroSeguro = "Ahorro Seguro";
	public static final String RentaGarantizada = "Renta Garantizada";
	public static final String RentaInversion = "Renta Inversion";
	public static final String MonedaSol = "S";
	public static final String MonedaDolar = "D";
	public static final String DPSY = "S";
	public static final String DPSN = "N";
	public static final String DNI = "DNI";
	public static final String CE = "CE";
	public static final String cod_DNI = "2";
	public static final String cod_CE = "1";

	// LOGGER
	public static final String strIniciando = ".:: Iniciando - {} ::.";
	public static final String strFinalizando = ".:: Finalizando - {} ::.";

	public static final String mensajeini = " comenzando la funcion {}";
	public static final String mensaje = " llamando a la funcion {}";
	public static final String parametros_left = " (";
	public static final String parametros_rigth = " )";
	public static final String mensajefin = " finalizando la funcion {} ";
	public static final String mensajeerror = " Ocurrio un error en la funcion {}:";
	// TAG NAMES
	public static final String div = "div";
	public static final String ta = "div";
	public static final String template = "template";
	public static final String span = "span";
	public static final String html = "html";
	public static final String body = "body";
	public static final String main = "main";
	public static final String article = "article";
	public static final String meta = "meta";
	public static final String p = "p";
	public static final String h1 = "h1";
	public static final String h2 = "h2";
	public static final String h3 = "h3";
	public static final String h4 = "h4";
	public static final String h5 = "h5";
	public static final String h6 = "h6";
	public static final String table = "table";
	public static final String tbody = "tbody";
	public static final String tr = "tr";
	public static final String td = "td";
	public static final String th = "th";
	public static final String code = "code";
	public static final String dl = "dl";
	public static final String ul = "ul";
	public static final String ol = "ol";
	public static final String li = "li";
	public static final String pre = "pre";
	public static final String form = "form";
	public static final String input = "input";
	public static final String section = "section";
	public static final String nav = "nav";
	public static final String aside = "aside";
	public static final String header = "header";
	public static final String footer = "footer";
	public static final String img = "img";
	public static final String video = "video";
	public static final String area = "area";
	public static final String button = "button";
	public static final String select = "select";
	public static final String textarea = "textarea";
	public static final String dialog = "dialog";
	public static final String slot = "slot";
	public static final String progress = "progress";
	public static final String canvas = "canvas";

	// sas preprod
	public static final String sasPre = "SASPREPROD";
	public static final String sas_pre = "SAS_PRE";
	public static final String sasBdPrePod = "BDSAST5";
	public static final String sasBdUser3 = "JMENDOZA";
	public static final String sasBdPass3 = "jm3031jm$";
	// SAS-PRE - base datos
	public static final String saspreBdServer = "rsdce-scan.rimac.com.pe";
	public static final String saspreBdPuerto = "1521";
	public static final String saspreBdSid = "BDSAST5";
	public static final String saspreBdUser1 = "JMENDOZA";
	public static final String saspreBdPass1 = "jm3031jm$";

	//PWE
	public static final String soLin = "Linux";
	public static final String soWin = "Windows";
	public static final String pwe="PWE";
	
	/**
	 * 
	 */
	public class saspreprod {

	}
}
