package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
	RequestDispatcher view;
	private UsuarioDAO usuarioDAO = new UsuarioDAO();

	public UsuarioServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");
		String user = request.getParameter("user");

		if (acao.equalsIgnoreCase("delete")) {
			
			usuarioDAO.delete(user);
			view = request.getRequestDispatcher("cadastroUsuario.jsp");
			request.setAttribute("usuarios", usuarioDAO.listar());
			view.forward(request, response);
		
		} else if (acao.equalsIgnoreCase("editar")) {
		
			Login login = usuarioDAO.consultar(user);
			view = request.getRequestDispatcher("cadastroUsuario.jsp");
			request.setAttribute("user", login);
			view.forward(request, response);
		
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * A variável login e senha todas do tipo String recebe o dado passado da view
		 * atráves do request.getParameter("parametroDaView")
		 */
		String id = request.getParameter("idLogin");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		Login usuario = new Login();
		usuario.setIdLogin(!id.isEmpty() ? Integer.parseInt(id) : 0);
		usuario.setLogin(login);
		usuario.setSenha(senha);

		/* usuarioDao.salvar recebe um objeto do tipo Login */
		if (id == null || id.isEmpty()) {
			usuarioDAO.salvar(usuario);
		} else {
			usuarioDAO.atualizar(usuario);
		}

		view = request.getRequestDispatcher("cadastroUsuario.jsp");
		request.setAttribute("usuarios", usuarioDAO.listar());
		view.forward(request, response);
	}

}
