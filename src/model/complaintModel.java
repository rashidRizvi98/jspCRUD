package model;

public class complaintModel {

	private int complaintId;
	
	private String complaint;

	private String userName;
	
	private String comDate;
	
	private String comTime;
	
	public complaintModel() {
	
	this.complaintId=0;	
	this.complaint="";
	this.userName="";
	this.comDate="";
	this.comTime="";
	}

	public complaintModel(int complaintId,String complaint,String userName,String comDate,String comTime) {
		
		this.complaintId=complaintId;
		this.complaint = complaint;
		this.userName=userName;
		this.comDate=comDate;
		this.comTime=comTime;

	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getComDate() {
		return comDate;
	}

	public void setComDate(String comDate) {
		this.comDate = comDate;
	}

	public String getComTime() {
		return comTime;
	}

	public void setComTime(String comTime) {
		this.comTime = comTime;
	}

	
	
	
}
