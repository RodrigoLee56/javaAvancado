package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import model.Login;

@WebServlet("/salvarUsuarioServlet")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UsuarioDAO usuarioDAO = new UsuarioDAO();

	public UsuarioServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * A variável login e senha todas do tipo String recebe o dado passado 
		 * da view atráves do request.getParameter("parametroDaView")
		 */
		String login = request.getParameter("login");
		String senha = request.getParameter("password");

		Login usuario = new Login();
		usuario.setLogin(login);
		usuario.setSenha(senha);

		/* usuarioDao.salvar recebe um objeto do tipo Login */
		usuarioDAO.salvar(usuario);
	}

}
