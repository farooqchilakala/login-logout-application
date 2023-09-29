 package Com.user.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.user.model.DAOService;
import Com.user.model.DAOServiceImpl;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Email = request.getParameter("Email");
		String Password = request.getParameter("Password");
		DAOService Service = new DAOServiceImpl ();
		Service.connectionDB();
		boolean status= Service.verifyCredentials( Email, Password) ;
		if(status==true) {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/new_Registration.jsp");
		rd.forward(request, response);
		}else {
		request.setAttribute("Error" ,"Invalid username/Password");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		}
	}

}
