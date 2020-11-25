package model;

public class Login {

	private String login;
	private String senha;

	public Login() {
		super();
	}

	public Login(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public boolean validarLoginSenha(String login, String senha) {
		if (login.equalsIgnoreCase("Admin") && senha.equalsIgnoreCase("123")) {
			return true;
		} else {
			return false;
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
