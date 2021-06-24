package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import helper.responseHelper;
import model.responseModel;

/**
 * Servlet implementation class deleteResponseController
 */
@WebServlet("/deleteResponseController")
public class deleteResponseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

try (PrintWriter out = response.getWriter()) {
			
			responseModel resp = new responseModel();
			
			
			resp.setResponseId(Integer.parseInt(request.getParameter("responseId")));
			try {
				responseHelper reh=new responseHelper();
				
				boolean executionStatus = reh.deleteResponse(resp);//returns boolean
				
				if(executionStatus) 
					response.sendRedirect(request.getContextPath()+"/admin/complaintResponse/viewResponse.jsp?responseId="+resp.getResponseId());
				
	
								
				else
								response.sendRedirect(request.getContentType()+"/admin/complaintResponse/viewResponse.jsp");
				
			} catch (ClassNotFoundException cnfe) {
				out.print(cnfe);
			} catch (SQLException se) {
				out.print(se);
			}catch(NumberFormatException ex) {
				out.print(ex);
			}
			
			
			
		}
		
		
		
		
		

	
	
	
	
	}

}
