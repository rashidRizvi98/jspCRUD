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

import helper.responseHelper;
import model.responseModel;
import javax.servlet.annotation.WebServlet;
/**
 * Servlet implementation class updateResponseController
 */
@WebServlet("/updateResponseController")
public class updateResponseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateResponseController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	
		
		try(PrintWriter out=response.getWriter())
		{
			SimpleDateFormat sdf7=new SimpleDateFormat("dd-MMM-yyy"); 
			SimpleDateFormat sdf8=new SimpleDateFormat("hh-mm-ss a"); 
			Date date=new Date();
			String resDate=sdf7.format(date);
			String resTime=sdf8.format(date);
			
			
			
			
			
			
			responseModel resp=new responseModel();
			
			resp.setResponse(request.getParameter("response"));
			resp.setResDate(resDate);
			resp.setResTime(resTime);
			resp.setResponseId(Integer.parseInt(request.getParameter("responseId")));
		
			 try {
				 
				 responseHelper reh=new responseHelper(); 
				 
				 boolean executionStatus = reh.updateResponse(resp);
				 
				 if(executionStatus)
						response.sendRedirect(request.getContextPath()+"/admin/complaintResponse/viewResponse.jsp?update=true");
					
				 else
					 response.sendRedirect(request.getContextPath()+"/admin/complaintResponse/viewResponse.jsp?update=false");
					
			 }
			 
			 catch (ClassNotFoundException cnfe) {
				 out.print(cnfe);
			 }catch(SQLException se) {
				 out.print(se);
			 }
			 
			
			
		}
		


		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
	}

}
