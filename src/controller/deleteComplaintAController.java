package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import helper.complaintHelper;
import model.complaintModel;

/**
 * Servlet implementation class deleteComplaintAController
 */
@WebServlet("/deleteComplaintAController")
public class deleteComplaintAController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteComplaintAController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
try (PrintWriter out = response.getWriter()) {
			
			complaintModel complaint = new complaintModel();
			
			
			complaint.setComplaintId(Integer.parseInt(request.getParameter("complaintId")));
			try {
				complaintHelper ch=new complaintHelper();
				
				boolean executionStatus = ch.deleteComplaint(complaint);//returns boolean
				
				if(executionStatus) 
					response.sendRedirect(request.getContextPath()+"/admin/complaintResponse/viewComplaintAdmin.jsp?complaintId="+complaint.getComplaintId());
				
	
								
				else
								response.sendRedirect(request.getContentType()+"/admin/complaintResponse/viewComplaintAdmin.jsp");
				
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
