package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.SingleConnection;

public class LoginDAO {
	private Connection connection;

	public LoginDAO() {
		connection = SingleConnection.getConnection();
	}

	public boolean validarLogin(String login, String senha) throws SQLException {
		String select = "SELECT * FROM bd_java_avancado.login where login ='" + login + "'and senha ='" + senha + "'";
		PreparedStatement preparedStatement = connection.prepareStatement(select);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}
}