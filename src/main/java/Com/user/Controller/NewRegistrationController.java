package Com.user.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.user.model.DAOService;
import Com.user.model.DAOServiceImpl;


@WebServlet("/NewRegistrationController")
public class NewRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NewRegistrationController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/new_Registration.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name = request.getParameter("Name");
		String Email = request.getParameter("Email");
		String Mobile = request.getParameter("Mobile");
		String City = request.getParameter("City");
		DAOService service = new DAOServiceImpl();
		service .connectionDB();
		service.saveReg(Name,Email,Mobile,City);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/new_Registration.jsp");
		rd.forward(request, response);//It will hold the same web page after save the data in web

	}

}
