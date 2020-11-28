package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.SingleConnection;
import model.Login;

public class UsuarioDAO {
	private Connection connection;

	public UsuarioDAO() {
		connection = SingleConnection.getConnection();
	}

	public void salvar(Login login) {
		String insertString = "insert into bd_java_avancado.login(usuario, senha) values (?,?)";
		try {
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

	public List<Login> listar() {

		List<Login> usuarios = new ArrayList<Login>();
		String select = "select * from login";
		try {
			/* Esse objeto leva a instrução sql até o banco */
			PreparedStatement preparedStatement = connection.prepareStatement(select);
			/*
			 * Esse objeto do tipo ResultSet trás a nós o resultado da query, ele vai trazer
			 * todos os dados que a instução que foi passada mandar.
			 */
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Login login = new Login();
				login.setLogin(resultSet.getString("usuario"));
				login.setSenha(resultSet.getString("senha"));

				usuarios.add(login);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return usuarios;
	}
}