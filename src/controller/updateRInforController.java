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

import helper.rInforHelper;

import model.rInforModel;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class updateRInforController
 */
@WebServlet("/updateRInforController")
public class updateRInforController extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		try(PrintWriter out=response.getWriter())
		{
			SimpleDateFormat sdf3=new SimpleDateFormat("dd-MMM-yyy"); 
			SimpleDateFormat sdf4=new SimpleDateFormat("hh-mm-ss a"); 
			Date date=new Date();
			String rentDate3=sdf3.format(date);
			String rentTime4=sdf4.format(date);
			
			
			
			
			
			rInforModel rinfor=new rInforModel();
			

			rinfor.setrId(request.getParameter("rId"));
			rinfor.setrAmount(Double.parseDouble(request.getParameter("rAmount")));
			rinfor.setMonth(request.getParameter("month"));
			
			rinfor.setRentDate(rentDate3);
			rinfor.setRentTime(rentTime4);
			rinfor.setrInforId(Integer.parseInt(request.getParameter("rInforId")));
			 try {
				 
				 rInforHelper rIHelper=new rInforHelper(); 
				 
				 boolean executionStatus = rIHelper.updateRInformation(rinfor);
				 
				 if(executionStatus)
					 response.sendRedirect(request.getContextPath()+"/admin/rentInformation/viewRentInfor.jsp?update=true");
					 //use a message box 
				 else
					 response.sendRedirect(request.getContextPath()+"/admin/rentInformation/viewRentInfor.jsp?update=false");
					
			 }
			 
			 catch (ClassNotFoundException cnfe) {
				 out.print(cnfe);
			 }catch(SQLException se) {
				 out.print(se);
			 }
			 
			
			
		}
		

			
		
		
		
		
	
	}

}
