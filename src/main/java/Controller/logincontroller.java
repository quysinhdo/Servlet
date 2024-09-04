package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/login", "/dangnhap" })

public class logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public logincontroller() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String uname = request.getParameter("uname");
		String psw = request.getParameter("psw");
		PrintWriter writer = response.getWriter();
		writer.append("<p>Username: " + uname + "</p>");
		writer.append("<p>Password: " + psw + "</p>");
	}
}