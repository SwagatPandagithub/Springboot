package in.ineuron;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCApp {
	
	public static void main(String[] args) {

		Connection connection = null;
		ResultSet resultset = null;
		Statement statement = null;
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			// create connection
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "system";
			String password = "sekhar";

			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection created successfully");
			System.out.println("implimentation class of connection: " + connection.getClass().getName());
			if (connection != null)
				System.out.println("connection done successfully...");

			// creating statement

			statement = connection.createStatement();
			System.out.println("implimentation class of statement: " + statement.getClass().getName());

			String sqlquery = "select * from employee";
			resultset = statement.executeQuery(sqlquery);
			System.out.println("implimentation class of statement: " + resultset.getClass().getName());

			System.out.println();
			System.out.println("id\tname\t        empsal");
			if (resultset != null) {
				while (resultset.next()) {

					System.out.println(
							resultset.getInt(1) + "\t" + resultset.getString(2) + "\t        " + resultset.getInt(3));
				}
			} else {
				System.out.println("data not found");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
