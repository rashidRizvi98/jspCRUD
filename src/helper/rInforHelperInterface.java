package helper;

import java.sql.SQLException;
import java.util.ArrayList;

import model.rInforModel;


public interface rInforHelperInterface {

	
	public boolean addRInformation(rInforModel rinfor)throws SQLException,ClassNotFoundException;
	
	
	public boolean updateRInformation(rInforModel rinfor) throws SQLException,ClassNotFoundException;
	
	
	public boolean deleteRInformation(rInforModel rinfor) throws SQLException,ClassNotFoundException;
	
	public  ArrayList<rInforModel> displayRInformation(rInforModel rinfor )throws SQLException,ClassNotFoundException;
	
	
	public  ArrayList<rInforModel> displayRInformations( ) throws SQLException,ClassNotFoundException;
	
	
	
	
	
	
}
