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

import helper.rInforHelper;
import model.rInforModel;


@WebServlet("/addRInforController")
public class addRInforController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public addRInforController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

try(PrintWriter out=response.getWriter()){
		
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyy"); 
	SimpleDateFormat sdf2=new SimpleDateFormat("hh-mm-ss a"); 
	Date date=new Date();
	String rentDate=sdf.format(date);
	String rentTime=sdf2.format(date);
	
	

	
	
			rInforModel rinfor=new rInforModel();
			
		
			rinfor.setrId(request.getParameter("rId"));
			rinfor.setrAmount(Double.parseDouble(request.getParameter("rAmount")));
			rinfor.setMonth(request.getParameter("month"));
			rinfor.setRentDate(rentDate);
			rinfor.setRentTime(rentTime);
			
		try {
			rInforHelper rh=new rInforHelper();
			
			boolean executionStatus=rh.addRInformation(rinfor);
	
			
		
			 if(executionStatus)
					response.sendRedirect(request.getContextPath()+"/admin/rentInformation/viewRentInfor.jsp?add=true");
				
			 else
					response.sendRedirect(request.getContextPath()+"/admin/rentInformation/viewRentInfor.jsp?add=false");
		
			
			
			
			
			
		}catch (ClassNotFoundException cnfe) {
				out.print(cnfe);
		}catch (SQLException se) {
			out.print(se);
		}
			
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
