package helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.responseModel;
import model.complaintModel;


public class responseHelper implements responseHelperInterface {

	private static String sql=null;
	private static ResultSet res = null;
	private static PreparedStatement ps = null;
	
	
	public responseHelper() {
		
	}
	
	public boolean addResponse(responseModel response) throws SQLException, ClassNotFoundException {
	
		if (DBConnect.getInstance() != null) {

			Connection con = DBConnect.getConnction();// getConnection details
			
	sql="INSERT INTO response(responseId,response,complaintId,resDate,resTime)"+"VALUES(?,?,?,?,?)";
	
			ps = con.prepareStatement(sql);
	
	ps.setInt(1, response.getResponseId());
	ps.setString(2, response.getResponse());
	ps.setInt(3, response.getComplaintId());
	ps.setString(4, response.getResDate());
	ps.setString(5, response.getResTime());
	
	int query = ps.executeUpdate();//returns boolean
	
	
	if (query == 1) {//successfully executed
		return true;
	} else {
		return false;
		}
		}

		return false;

		
		}
	
	public boolean updateResponse(responseModel response)throws SQLException, ClassNotFoundException {
	
            if (DBConnect.getInstance() != null) {
			
			Connection con = DBConnect.getConnction();
			
	sql="UPDATE response SET  response=?,resDate=?,resTime=? where responseId=?";
	ps= con.prepareStatement(sql);
	
	ps.setString(1, response.getResponse());	
	ps.setString(2, response.getResDate());
	ps.setString(3, response.getResTime());
	ps.setInt(4, response.getResponseId());
			
	int query = ps.executeUpdate();
	

	if (query == 1) {
		return true;
	} else {
		return false;
		}
	
            }

            return false;
            
            
            }		
	
	
	public boolean deleteResponse(responseModel response) throws SQLException,ClassNotFoundException {
		
		if(DBConnect.getInstance()!=null)
		{
			Connection con=DBConnect.getConnction();
			
			sql="DELETE FROM response WHERE responseId=?";
			
			ps = con.prepareStatement(sql);
		
			ps.setInt(1, response.getResponseId());

			int query=ps.executeUpdate();
			
			if(query==1)
			{
				return true;
			}
			else
				return false;
}
		return false;
	}
		
	public  ArrayList<responseModel> displayResponse(responseModel response ) throws SQLException,ClassNotFoundException{
		
		if(DBConnect.getInstance()!=null) {
			
			Connection con=DBConnect.getConnction();
			
			sql="SELECT * FROM response WHERE responseId=?";
			
			ps = con.prepareStatement(sql);    //Throws:SQLException - if a database access error occurs or this method is called on a closed connection
			
			ps.setInt(1, response.getResponseId());
			
			
			res=ps.executeQuery();

		ArrayList<responseModel> responseModelArrayList=new ArrayList<responseModel>();
		
		while(res.next())
		{
		responseModel rm=new responseModel();
			
			rm.setResponseId(res.getInt("responseId"));
			rm.setResponse(res.getString("response"));
		
			responseModelArrayList.add(rm);
		}
		return responseModelArrayList;
		}
		return null;
	}
	
	public ArrayList<responseModel> displayResponses( ) throws SQLException,ClassNotFoundException{
		
		if(DBConnect.getInstance()!=null) {
			
			Connection con=DBConnect.getConnction();
			
			sql="SELECT * FROM response";
			
			ps = con.prepareStatement(sql);    //Throws:SQLException - if a database access error occurs or this method is called on a closed connection
			
			res=ps.executeQuery();
			
			ArrayList<responseModel> responseArrayList=new ArrayList<responseModel>();
			while(res.next())
			{
				responseModel re =new responseModel();
				
				re.setResponseId(res.getInt("responseId"));
				re.setResponse(res.getString("response"));
				re.setResDate(res.getString("resDate"));
				re.setResTime(res.getString("resTime"));
				
				responseArrayList.add(re);
				
			}
			return responseArrayList; 	
		}
		return null;
	}

	
	
	public ArrayList<responseModel> displayResponsesR(complaintModel complaint ) throws SQLException,ClassNotFoundException{
		
		if(DBConnect.getInstance()!=null) {
			
			Connection con=DBConnect.getConnction();
			
			sql="SELECT * FROM response r,complaint c where c.complaintId=r.complaintId and c.userName=?";
			
			ps = con.prepareStatement(sql);    //Throws:SQLException - if a database access error occurs or this method is called on a closed connection
			
			ps.setString(1, complaint.getUserName());
			
			res=ps.executeQuery();
			
			ArrayList<responseModel> responseArrayList=new ArrayList<responseModel>();
			while(res.next())
			{
				responseModel re =new responseModel();
				
				re.setResponseId(res.getInt("responseId"));
				re.setResponse(res.getString("response"));
				re.setResDate(res.getString("resDate"));
				re.setResTime(res.getString("resTime"));
				responseArrayList.add(re);
				
			}
			return responseArrayList; 	
		}
		return null;
	}
	
	
	
	
	
	
	
		
		}
		
