package rimac.geo.util;

import java.util.List;

public interface Inout {

	List<List<String>> leerDD(String hoja) throws Exception;

	void escribirDD(List<String> listaString, String id) throws Exception;

	void escribirDD(String string, String id) throws Exception;

	void escribirNuevoDD(List<String> listaString, int dataDriven) throws Exception;

	void escribirNuevoDD(String string, int dataDriven) throws Exception;
}
