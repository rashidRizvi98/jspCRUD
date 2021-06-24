package model;

public class RRegistration {

	private String userName;
	private String password;
	private String confirmPassword;
	
	
	
	public RRegistration() {
		
		userName =" ";
		password ="";
		confirmPassword =" ";
	}
	
	
	
	
	
	public RRegistration(String userName, String password, String confirmPassword) {
		super();
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}





	public String getConfirmpassword() {
		return confirmPassword;
	}
	public void setConfirmpassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
