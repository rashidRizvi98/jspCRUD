package helper;

import java.sql.SQLException;

import model.RRegistration;

public interface RLoginHelperInt {

	public boolean loginResident(RRegistration reg) throws SQLException, ClassNotFoundException; 

	
	
}
