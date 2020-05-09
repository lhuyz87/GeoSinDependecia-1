package rimac.geo.inout;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import rimac.geo.util.ExcelUtilPropio;
import rimac.geo.util.Variables;
import rimac.geo.util.Constantes;
import rimac.geo.util.Inout;

public class ConsultarPolizaInout implements Inout {

	private ExcelUtilPropio excelUtilPropio = ExcelUtilPropio.getInstancia();

	// singleton
	private static ConsultarPolizaInout obj = null;

	private ConsultarPolizaInout() {
	}

	public static ConsultarPolizaInout getInstancia() {
		instanciar();
		return obj;
	}

	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new ConsultarPolizaInout();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	// singleton

	@Override
	public List<List<String>> leerDD(String hoja) throws Exception {
		List<List<String>> data = new ArrayList<List<String>>();
		List<String> reg = null;
		List<String> cabecera = null;
		String usar = "";
		String res = "";
		System.out.println("HOJAS " + hoja);
		File file = new File(Variables.file_01);

		if (file.isFile()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook = WorkbookFactory.create(fileInputStream);
			Sheet sheet = !hoja.isEmpty() ? workbook.getSheet(hoja) : workbook.getSheetAt(0);
			int ultimaFilaAfectada = sheet.getLastRowNum();
			int ultimaColumanaAfectada= sheet.getRow(0).getLastCellNum();
//			System.out.println("NOMBRE DE HOJA " + hoja);
//			System.out.println("ULTIMA FILA " + ultimaFilaAfectada);
//			System.out.println("Columna Afectada " + ultimaColumanaAfectada);
			for (int i = 0; i <= ultimaFilaAfectada; i++) {
				usar = sheet.getRow(i).getCell(0, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
				reg = new ArrayList<String>();
				reg.add(String.valueOf(i));
				if (usar.toUpperCase().equals(Constantes.usar)||usar.compareToIgnoreCase("USAR")==0) {
					
//					System.out.println("ROW  " + i + "USAR:    " + usar);
					for(int j=1; j<ultimaColumanaAfectada;j++) {
//					System.out.println("columna  " + j);	
					reg.add(sheet.getRow(i).getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue());
				
					}
					data.add(reg);
				}else {}
				
			}	
				
			excelUtilPropio.cerrarIn(fileInputStream);
			excelUtilPropio.cerrarWb(workbook);
		}

		return data;
	}

	@Override
	public void escribirDD(List<String> listaString, String id) throws Exception {
	}

	@Override
	public void escribirDD(String string, String id) throws Exception {
	}

	@Override
	public void escribirNuevoDD(List<String> listaString, int dataDriven) throws Exception {
	}

	@Override
	public void escribirNuevoDD(String string, int dataDriven) throws Exception {
	}
}
