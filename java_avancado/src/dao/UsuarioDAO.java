package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.SingleConnection;
import model.Login;

public class UsuarioDAO {
	private Connection connection;

	public UsuarioDAO() {
		connection = SingleConnection.getConnection();
	}

	public void salvar(Login login) {
		try {
			String insertString = "insert into bd_java_avancado.login(usuario, senha) values (?,?)";
			PreparedStatement insert = connection.prepareStatement(insertString);
			insert.setString(1, login.getLogin());
			insert.setString(2, login.getSenha());
			insert.execute();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}