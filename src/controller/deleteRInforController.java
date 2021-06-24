package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import helper.rInforHelper;

import model.rInforModel;

@WebServlet("/deleteRInforController")
public class deleteRInforController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
try (PrintWriter out = response.getWriter()) {
			
			rInforModel rinfor = new rInforModel();
			
			
			rinfor.setrInforId(Integer.parseInt(request.getParameter("rInforId")));
			try {
				rInforHelper rh=new rInforHelper();
				
				boolean executionStatus = rh.deleteRInformation(rinfor);//returns boolean
				
				if(executionStatus) 
					response.sendRedirect(request.getContextPath()+"/admin/rentInformation/viewRentInfor.jsp?rInforId="+rinfor.getrInforId());
				
	
								
				else
								response.sendRedirect(request.getContentType()+"/admin/rentInformation/viewRentInfor.jsp");

				
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
