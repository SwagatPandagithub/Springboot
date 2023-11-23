package ineuron._1_SpringMavenProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class JDBC {

	private static Logger logger = Logger.getLogger(JDBC.class);
	static {
		SimpleLayout layout = new SimpleLayout();
		ConsoleAppender appender = new ConsoleAppender(layout);
		logger.addAppender(appender);
		logger.setLevel(Level.INFO);
		// debug--general steps
		// info-- important steps
		// error--while handling some errors and exceptions
		// warn--While working with depricated Apis
		// fatal--when the error is unknown
	}

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			logger.debug("Driver loaded Successfully..");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "system";
			String password = "sekhar";

			connection = DriverManager.getConnection(url, username, password);
			logger.info("Connection Established ....");

			if (connection != null)
				statement = connection.createStatement();
			logger.info("Statement object Established ....");

			String sqlquery = "select * from employee";
			resultset = statement.executeQuery(sqlquery);
			logger.info("ResultSet object Established ....");

			System.out.println();
			System.out.println("id\tname\t        empsal");
			if (resultset != null) {
				while (resultset.next()) {

					System.out.println(
							resultset.getInt(1) + "\t" + resultset.getString(2) + "\t        " + resultset.getInt(3));
				}
			}

		} catch (SQLException se) {
			se.printStackTrace();
			logger.error("SqlException occured..>" + se.getMessage() + "   " + se.getErrorCode());
		} catch (Exception e) {
			e.printStackTrace();
			logger.fatal("SqlException occured..>" + e.getMessage());
		}

	}

}
