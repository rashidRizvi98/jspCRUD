package model;

public class rInforModel {

	private int rInforId;
	private String rId;
	private double rAmount;
	private String month;
	private String rentDate;
	private String rentTime;
	
	public rInforModel() {
		
		this.rInforId=0;
		this.rId="";
		this.rAmount=0;
		this.month="";
		this.rentDate="";
		this.rentTime="";
	}

	public rInforModel(int rInforId, String rId, double rAmount, String month,String rentDate,String rentTime) {
		
		this.rInforId=rInforId;
		this.rId = rId;
		this.rAmount = rAmount;
		this.month = month;
		this.rentDate=rentDate;
		this.rentTime=rentTime;

	}

	public int getrInforId() {
		return rInforId;
	}

	public void setrInforId(int rInforId) {
		this.rInforId = rInforId;
	}

	public String getrId() {
		return rId;
	}

	public void setrId(String rId) {
		this.rId = rId;
	}

	public double getrAmount() {
		return rAmount;
	}

	public void setrAmount(double rAmount) {
		this.rAmount = rAmount;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	public String getRentTime() {
		return rentTime;
	}

	public void setRentTime(String rentTime) {
		this.rentTime = rentTime;
	}
	

	
	
	
	
}
