package model;

import java.sql.Time;

public class responseModel {

	private int responseId;
	
	private String response;

	private int complaintId;
	
	
	private String resDate;
	
	private String resTime;

	public responseModel() {

		this.responseId = 0;
		this.response = "";
		this.complaintId=0;
		this.resDate="";
		this.resTime="";
	}


	public responseModel(int responseId, String response, int complaintId, String resDate,String resTime) {

		this.responseId = responseId;
		this.response = response;
		this.complaintId=complaintId;
		this.resDate=resDate;
		this.resTime=resTime;
	}


	public int getResponseId() {
		return responseId;
	}


	public void setResponseId(int responseId) {
		this.responseId = responseId;
	}


	public String getResponse() {
		return response;
	}


	public void setResponse(String response) {
		this.response = response;
	}


	public int getComplaintId() {
		return complaintId;
	}


	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}




	public String getResDate() {
		return resDate;
	}


	public void setResDate(String resDate) {
		this.resDate = resDate;
	}


	public String getResTime() {
		return resTime;
	}


	public void setResTime(String resTime) {
		this.resTime = resTime;
	}
	
	

	
	
	
}
