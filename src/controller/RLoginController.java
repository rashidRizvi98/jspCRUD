package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

import helper.RLoginHelper;
import model.RRegistration;

/**
 * Servlet implementation class RLoginController
 */
@WebServlet("/RLoginController")
public class RLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
try (PrintWriter out = response.getWriter()) {
			
			
			// Add user
			
			RRegistration reg=new RRegistration();
		
			
			reg.setUserName(request.getParameter("userName"));
			reg.setPassword(request.getParameter("password"));

			String userName=request.getParameter("userName");
			
			//request.setAttribute("userName",request.getParameter("userName"));
			
			//getServletContext().setAttribute("msg",userName);
			HttpSession session = request.getSession(); 
			session.setAttribute("userName",userName);
			
			
		
			    
			{
			      try {
				RLoginHelper rlh=new RLoginHelper();
			     	boolean executionStatus = rlh.loginResident(reg);
				
				   if(executionStatus) 
				   {	   
					out.print("true");
				    response.sendRedirect(request.getContextPath()+"/ownerTenant/home/home.jsp?userName="+reg.getUserName()+",Password="+reg.getPassword());
				   }
				   else {
					   
					out.print("false");
				   response.sendRedirect(request.getContextPath()+"/ownerTenant/login/login.jsp");
				   }
			}
			
			          catch (ClassNotFoundException cnfe) {
				      out.print(cnfe);
			   }    catch (SQLException se) {
				       out.print(se);
			 
		//}
				      
	
			}		         

		}		         
		
		
}	

	
	
	}

}
