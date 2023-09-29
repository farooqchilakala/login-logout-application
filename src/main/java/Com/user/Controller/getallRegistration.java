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



@WebServlet("/listall")
public class getallRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public getallRegistration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	DAOService service = new DAOServiceImpl();
	service.connectionDB();
	ResultSet result = service.listRegistration();
	request.setAttribute("result", result);
	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/list_all.jsp");
	rd.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}