package helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.RRegistration;
import model.complaintModel;

public class RLoginHelper implements RLoginHelperInt {
	
	public RLoginHelper() {
		
	}
	
	
	private static String sql = null;
	private static ResultSet res = null;
	private static PreparedStatement ps = null;

	
	
	

	public boolean loginResident(RRegistration reg) throws SQLException, ClassNotFoundException {
	
		if (DBConnect.getInstance() != null) {

			Connection con = DBConnect.getConnction();// getConnection details
			// type corresponds to login type
			sql = "SELECT * FROM rregistration WHERE userName=? AND password=? ";

			ps = con.prepareStatement(sql);// returns statement that is editable for custom values

			// set values to the query

			ps.setString(1, reg.getUserName());
			ps.setString(2, reg.getPassword());

			res = ps.executeQuery();// returns boolean

			if (res.next()) {// successfully executed
				return true;
			} else {
				return false;
			}
		}

		return false;
	}





public ArrayList<RRegistration> displayUserNames() throws SQLException,ClassNotFoundException{
		
		if(DBConnect.getInstance()!=null) {
			
			Connection con=DBConnect.getConnction();
			
			sql="SELECT * FROM rregistration";
			
			ps = con.prepareStatement(sql);    //Throws:SQLException - if a database access error occurs or this method is called on a closed connection
			
			res=ps.executeQuery();
			
			ArrayList<RRegistration> UserNamesArrayList=new ArrayList<RRegistration>();

			while(res.next())
			{
				RRegistration rre=new RRegistration();
				
				rre.setUserName(res.getString("userName"));
				
				
				UserNamesArrayList.add(rre);
			}
			return UserNamesArrayList;
		}
		return null;
			}





}
