package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import helper.responseHelper;
import model.responseModel;

/**
 * Servlet implementation class addResponseController
 */
@WebServlet("/addResponseController")
public class addResponseController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public addResponseController() {
		
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try (PrintWriter out = response.getWriter()) {

			SimpleDateFormat sdf5=new SimpleDateFormat("dd-MMM-yyy"); 
			SimpleDateFormat sdf6=new SimpleDateFormat("hh-mm-ss a"); 
			Date date=new Date();
			String resDate=sdf5.format(date);
			String resTime=sdf6.format(date);
			
			
			
			
			
			
			
			responseModel resp=new responseModel();
	
	
		resp.setResponse(request.getParameter("response"));
		resp.setComplaintId(Integer.parseInt(request.getParameter("complaintId")));
		
		resp.setResDate(resDate);
		resp.setResTime(resTime);
		
		
	try {
		responseHelper reh=new responseHelper();
		
		boolean executionStatus=reh.addResponse(resp);
	
		
		
		
		
		 if(executionStatus)
				response.sendRedirect(request.getContextPath()+"/admin/complaintResponse/viewResponse.jsp?add=true");
			
		 else
				response.sendRedirect(request.getContextPath()+"/admin/complaintResponse/viewResponse.jsp?add=false");
	
		
	}catch (ClassNotFoundException cnfe) {
		out.print(cnfe);
	}catch (SQLException se) {
		out.print(se);
	}

		
		
	}
			
			
	}

}
