package report;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 * Servlet implementation class rInforReport
 */
@WebServlet("/rInforReport")
public class rInforReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rInforReport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	

	
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sunshine_lk","root" ,"");
					
					JasperReport jasperReport=null;
					JasperDesign jasperDesign=null;
					Map parameters=new HashMap();
					
					String path=getServletContext().getRealPath("/WEB-INF/");
					jasperDesign=JRXmlLoader.load(path+"/RentInformation.jrxml");
					jasperReport=JasperCompileManager.compileReport(jasperDesign);
					byte[] byteStream=JasperRunManager.runReportToPdf(jasperReport, parameters,con);
					OutputStream outStream=response.getOutputStream();
					response.setContentType("application/pdf");
					response.setContentLength(byteStream.length);
					outStream.write(byteStream, 0, byteStream.length);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (JRException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		
	
	
	
	
	
	
	
	}

}
