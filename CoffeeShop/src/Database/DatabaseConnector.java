package Database;

import java.sql.*;

import Utils.AppLogger;

//import AppLogger;

public class DatabaseConnector {

	private static Connection con;
	private static boolean hasData = false;
	private static PreparedStatement prep;
	private static ResultSet res;
	private static Statement statement;
	
	public DatabaseConnector() throws ClassNotFoundException, SQLException {
		getConnection(true);
	}
	
	public void getConnection(boolean initial) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.sqlite.JDBC");
		con = DriverManager.getConnection("jdbc:sqlite:coffeeshop.db");
		if(initial)
			initialise();
	}
	
	private void initialise() throws SQLException {
		
		if(!hasData) {
			hasData = true;
		}
		
		statement = con.createStatement();
		ResultSet res = statement.executeQuery("SELECT * from sqlite_master where type='table' and name='users'");
		
		// sqlite_master columns type, name
		// 						 table, user
		
		//If there is not value which means the table is not exist
		if(!res.next()) {
			System.out.println("Building the Users table with prepoluated values.");
			
			Statement create_table = con.createStatement();
			create_table.execute("CREATE TABLE users(id INTEGER PRIMARY KEY AUTOINCREMENT, "
					+ "name varchar(191), "
					+ "address varchar(191),"
					+ "city varchar(191),"
					+ "telno varchar(191),"
					+ "email varchar(191),"
					+ "username varchar(191),"
					+ "password varchar(191),"
					+ "creditcard varchar(16),"
					+ "security_code varchar(3),"
					+ "user_type integer);");
			
			AppLogger.setLog("Succesfully Created");
			
			prep = con.prepareStatement("INSERT INTO users values(null,?,?,?,?,?,?,?,?,?,?);");
			prep.setString(1, "John Doe");
			prep.setString(2, "haspolat yolu no:16");
			prep.setString(3, "nicosia");
			prep.setString(4, "05338712345");
			prep.setString(5, "jdoe@gmail.com");
			prep.setString(6, "johndoe");
			prep.setString(7, "123456");
			prep.setString(8, "2424242424242424");
			prep.setString(9, "452");
			prep.setInt(10, 1);
			prep.execute();
			
		} else {
			//AppLogger.setLog("Users table is already exist");
		}
	}
	
	
	public ResultSet displayUsers() throws ClassNotFoundException, SQLException {
		
		if(con == null)
			getConnection(false);
		
		Statement state = con.createStatement();
		res = state.executeQuery("SELECT * from users");
		return res;
	}
	
	public boolean login(String email, String password) throws ClassNotFoundException, SQLException {
		
		
		if(con == null)
			getConnection(false);
		
		statement = con.createStatement();
		String query = "SELECT * from users where username = ? and password = ?;";
		prep = con.prepareStatement(query);
		prep.setString(1, email);
		prep.setString(2, password);
		res = prep.executeQuery();
		
		AppLogger.setLog("Username: " + email + " Password: " + password);
		
		//If there is value 
		if(res.next())
			return true;
		
		return false;
	}

}
