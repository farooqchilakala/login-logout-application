package Com.user.Controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.user.model.DAOService;
import Com.user.model.DAOServiceImpl;
@WebServlet("/Update")
public class UpdateRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateRegController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	String Email = request.getParameter("Email");
	String Mobile  = request.getParameter("Mobile");
	request.setAttribute("Email",Email);
	request.setAttribute("Mobile",Mobile);
	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/UpdateReg.jsp");
	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		String Email = request.getParameter("Email");
		String Mobile  = request.getParameter("Mobile");
		
		DAOService service = new DAOServiceImpl();
		service.connectionDB();
		service.UpdateReg( Email, Mobile);
		ResultSet result = service.listRegistration();
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/list_all.jsp");
		rd.forward(request, response);
	
	}

}
