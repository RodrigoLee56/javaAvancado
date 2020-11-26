package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/bd_java_avancado?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "toor";
	private static Connection connection = null;
	
	static {
		conectar();
	}
	
	public SingleConnection() {
		conectar();		
	}
	
	private static void conectar() {
		try {
			
			if (connection == null) {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(URL, USER, PASSWORD);
				connection.setAutoCommit(false);
				System.out.println("Conectou");
			}
			
		} catch (Exception e) {
			throw new RuntimeException("Erro ao conectar com o banco de dados!");
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
}
