package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import helper.complaintHelper;
import model.complaintModel;

/**
 * Servlet implementation class deleteComplaintController
 */
@WebServlet("/deleteComplaintController")
public class deleteComplaintController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
try (PrintWriter out = response.getWriter()) {
			
			complaintModel complaint = new complaintModel();
			
			
			complaint.setComplaintId(Integer.parseInt(request.getParameter("complaintId")));
			try {
				complaintHelper ch=new complaintHelper();
				
				boolean executionStatus = ch.deleteComplaint(complaint);//returns boolean
				
				if(executionStatus) 
					response.sendRedirect(request.getContextPath()+"/ownerTenant/complaint/viewComplaint.jsp?complaintId="+complaint.getComplaintId());
				
	
								
				else
								response.sendRedirect(request.getContentType()+"/ownerTenant/complaint/viewComplaint.jsp");
				
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
