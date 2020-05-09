package rimac.geo.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import rimac.geo.util.ExcelUtilPropio;

@RunWith(RunPersonalizar.class)

//@CucumberOptions(features = { "src/test/resources/features/" }, tags = { "@CopiarPlantillas" }, glue = { "rimac" })
//@CucumberOptions(features = { "src/test/resources/features/" }, tags = {"@RegistrarNuevoCaso"}, glue = { "rimac" })
//@CucumberOptions(features = { "src/test/resources/features/" }, tags = {"@CopiarPlantillas"}, glue = { "rimac.test.definition" })
//@CucumberOptions(features = { "src/test/resources/features/" }, tags = {"@RegistrarPlacaEnUso"}, glue = { "rimac" })
//@CucumberOptions(features = { "src/test/resources/features/" }, tags = {"@AsignarProcurador"}, glue = { "rimac" })
public class RunRimac {

//	@RunBefore
	public static void previo() {
		ExcelUtilPropio.getInstancia().escribirFeatures();
	}
}
