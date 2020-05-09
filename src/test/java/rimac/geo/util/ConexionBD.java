package rimac.geo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionBD {

	// singleton
	private static ConexionBD obj = null;

	private ConexionBD() {
	}

	public static ConexionBD getInstancia() {
		instanciar();
		return obj;
	}

	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new ConexionBD();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	// singleton

	public Connection conexionOracle(String aplicativo) {
		Connection conexion = null;
		String url = "";
		String user = "";
		String pass = "";

		switch (aplicativo) {
		case Constantes.sas:
			url = "jdbc:oracle:thin:@//" + Constantes.sasBdServer + ":" + Constantes.sasBdPuerto + "/"
					+ Constantes.sasBdSid;
			user = Constantes.sasBdUser1;
			pass = Constantes.sasBdPass1;
			break;
		case Constantes.sas2:
			url = "jdbc:oracle:thin:@//" + Constantes.sasBdServer2 + ":" + Constantes.sasBdPuerto + "/"
					+ Constantes.sasBdSid2;
			user = Constantes.sasBdUser2;
			pass = Constantes.sasBdPass2;
			break;
		case Constantes.ae:
			url = "jdbc:oracle:thin:@//" + Constantes.aeBdServer + ":" + Constantes.aeBdPuerto + "/"
					+ Constantes.aeBdSid;
			user = Constantes.aeBdUser1;
			pass = Constantes.aeBdPass1;
			break;
		case Constantes.ae2:
			url = "jdbc:oracle:thin:@//" + Constantes.aeBdServer + ":" + Constantes.aeBdPuerto + "/"
					+ Constantes.aeBdSid;
			user = Constantes.aeBdUser2;
			pass = Constantes.aeBdPass2;
			break;
		case Constantes.sasPre:
			url = "jdbc:oracle:thin:@//" + Constantes.aeBdServer + ":" + Constantes.sasBdPuerto + "/"
					+ Constantes.sasBdPrePod;
			user = Constantes.sasBdUser3;
			pass = Constantes.sasBdPass3;
			break;
		case Constantes.sas_pre:
			url = "jdbc:oracle:thin:@//" + Constantes.saspreBdServer + ":" + Constantes.saspreBdPuerto + "/"
					+ Constantes.saspreBdSid;
			user = Constantes.saspreBdUser1;
			pass = Constantes.saspreBdPass1;
			break;
		case Constantes.pwe:
			url = "jdbc:oracle:thin:@//" + Constantes.saspreBdServer + ":" + Constantes.saspreBdPuerto + "/"
					+ Constantes.saspreBdSid;
			user = Constantes.sasBdUser3;
			pass = Constantes.sasBdPass3;
			break;
		default:
			break;
		}

		if (!url.isEmpty()) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println(url + "\t\t" + user + "\t\t" + pass);
				conexion = DriverManager.getConnection(url, user, pass);
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				ex.printStackTrace();
			}
		}

		return conexion;
	}

	public Connection conexionMysql(String aplicativo) {
		return null;
	}

	public void cerrarConnection(Connection connection) throws Exception {
		if (connection != null) {
			connection.close();
		}
	}

	public void cerrarStatement(Statement statement) throws Exception {
		if (statement != null) {
			statement.close();
		}
	}
	
	public void cerrarPreparedStatement(PreparedStatement preparedStatement) throws Exception {
		if (preparedStatement != null) {
			preparedStatement.close();
		}
	}

	public void cerrarResultSet(ResultSet resultSet) throws Exception {
		if (resultSet != null) {
			resultSet.close();
		}
	}
}
