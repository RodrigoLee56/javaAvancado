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
			insert.executeUpdate();

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

	public void delete(String login) {
		String deleteString = "delete from login where usuario = ?";
		try {
			PreparedStatement delete = connection.prepareStatement(deleteString);
			delete.setString(1, login);
			delete.execute();
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

	public Login consultar(String login) {
		String consultarString = "select * from login where usuario ='" + login + "'";
		try {
			PreparedStatement consultar = connection.prepareStatement(consultarString);
			ResultSet resultSet = consultar.executeQuery();
			if (resultSet.next()) {
				Login usuario = new Login();
				usuario.setIdLogin(resultSet.getInt("idLogin"));
				usuario.setLogin(resultSet.getString("usuario"));
				usuario.setSenha(resultSet.getString("senha"));
				return usuario;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

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
				login.setIdLogin(resultSet.getInt("idLogin"));
				login.setLogin(resultSet.getString("usuario"));
				login.setSenha(resultSet.getString("senha"));

				usuarios.add(login);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuarios;
	}

	public void atualizar(Login usuario) {
		String updateString = "update login set usuario = ?, senha = ? where idLogin = ?";
		try {
			PreparedStatement update = connection.prepareStatement(updateString);
			update.setString(1, usuario.getLogin());
			update.setString(2, usuario.getSenha());
			update.setInt(3, usuario.getIdLogin());
			update.executeUpdate();
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}