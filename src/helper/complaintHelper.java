package helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.complaintModel;




public class complaintHelper implements complaintHelperInterface {

	public complaintHelper() {
		
	}
	
	
	
	private static String sql=null;
	private static ResultSet res=null;
	private static PreparedStatement ps=null;
	
	public boolean addComplaint(complaintModel complaint) throws SQLException,ClassNotFoundException{
	
		if(DBConnect.getInstance()!=null) {
			
			Connection con=DBConnect.getConnction();
			
			sql="INSERT INTO complaint(complaintId,complaint,userName,date,time)"
			+"VALUES(?,?,?,?,?)";
			
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, complaint.getComplaintId());
			ps.setString(2, complaint.getComplaint());
			ps.setString(3, complaint.getUserName());
			ps.setString(4, complaint.getComDate());		
			ps.setString(5, complaint.getComTime());
			
			
			int query=ps.executeUpdate();
			
			if(query==1) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
					
		}
	
	
	public boolean deleteComplaint(complaintModel complaint) throws SQLException,ClassNotFoundException {
		
		if(DBConnect.getInstance()!=null)
		{
			Connection con=DBConnect.getConnction();
			
			sql="DELETE FROM complaint WHERE complaintId=?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, complaint.getComplaintId());
			
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
	
	
	public ArrayList<complaintModel> displayComplaint(complaintModel complaint) throws SQLException,ClassNotFoundException{
		
		if(DBConnect.getInstance()!=null) {
			
			Connection con=DBConnect.getConnction();
			
			sql="SELECT * FROM complaint WHERE complaintId=?";
			
			ps = con.prepareStatement(sql);    //Throws:SQLException - if a database access error occurs or this method is called on a closed connection
			
			ps.setInt(1, complaint.getComplaintId());
			
			res=ps.executeQuery();
			
			ArrayList<complaintModel> complaintModelArrayList=new ArrayList<complaintModel>();

			while(res.next())
			{
				complaintModel c=new complaintModel();
			
			c.setComplaintId(res.getInt("complaintId"));
			c.setComplaint(res.getString("complaint"));
			
			complaintModelArrayList.add(c);
			
			}
			return complaintModelArrayList;
	}
	return null;
	}

	
	public ArrayList<complaintModel> displayComplaints() throws SQLException,ClassNotFoundException{
		
		if(DBConnect.getInstance()!=null) {
			
			Connection con=DBConnect.getConnction();
			
			sql="SELECT * FROM complaint";
			
			ps = con.prepareStatement(sql);    //Throws:SQLException - if a database access error occurs or this method is called on a closed connection
			
			res=ps.executeQuery();
			
			ArrayList<complaintModel> complaintModelArrayList=new ArrayList<complaintModel>();

			while(res.next())
			{
				complaintModel c=new complaintModel();
				
				c.setComplaintId(res.getInt("complaintId"));
				c.setComplaint(res.getString("complaint"));
				c.setUserName(res.getString("userName"));
				c.setComDate(res.getString("date"));
				c.setComTime(res.getString("time"));
				
				complaintModelArrayList.add(c);
			}
			return complaintModelArrayList;
		}
		return null;
			}
	
}
