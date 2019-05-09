package bd;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnexionBD {
	
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/shop_dk";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	public static Connection cnx;
	
	public static Connection getCnx(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver charg� avec succes");
			cnx = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("connexion reusie!!!");
		}
		catch(SQLException se){
			System.out.println("Echec de connexion avec la BD: "+se.getMessage());
		}
		catch (ClassNotFoundException e){
			System.out.println("Classe Driver introuvable");
		}
		return cnx;
	}
}