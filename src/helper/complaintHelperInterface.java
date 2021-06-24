package helper;

import java.sql.SQLException;
import java.util.ArrayList;

import model.complaintModel;

public interface complaintHelperInterface {

	
	public boolean addComplaint(complaintModel complaint) throws SQLException,ClassNotFoundException;
		
	public boolean deleteComplaint(complaintModel complaint) throws SQLException,ClassNotFoundException;
		
	public ArrayList<complaintModel> displayComplaint(complaintModel complaint) throws SQLException,ClassNotFoundException;
	
	public ArrayList<complaintModel> displayComplaints() throws SQLException,ClassNotFoundException;
		
	
	
}
