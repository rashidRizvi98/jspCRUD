package helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.RRegistration;

public class RRegistrationHelper implements RRegistrationHelperInt {

	public RRegistrationHelper() {
		
	}

	private static String sql=null;
	private static ResultSet res=null;
	private static PreparedStatement ps=null;
	
	
	public boolean addRegistration(RRegistration reg) throws SQLException, ClassNotFoundException {
	
		if (DBConnect.getInstance() !=null) {
			
			Connection con=DBConnect.getConnction();
			
			sql = "INSERT INTO rregistration(userName,password)"
					+ "VALUES(?,?)";
			
			ps=con.prepareStatement(sql);
			
			ps.setString(1, reg.getUserName());
			ps.setString(2, reg.getPassword());
			
			int query=ps.executeUpdate();
			
			if(query==1) {
				return true;
			
			}else {
				return false;
				}
	}
			return false;
}

}
