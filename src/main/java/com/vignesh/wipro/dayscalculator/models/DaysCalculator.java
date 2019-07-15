package com.vignesh.wipro.dayscalculator.models;

public class DaysCalculator {
	
	private String startDate;
	private String endDate;
	private long dateDifference;
	private String errorMessage;
	
	public DaysCalculator() {
		super();
		this.dateDifference = 0;
		this.errorMessage = "";
	}
	
	public DaysCalculator(String startDate, String endDate, int dateDifference, String errorMessage) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.dateDifference = dateDifference;
		this.errorMessage = errorMessage;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public long getDateDifference() {
		return dateDifference;
	}

	public void setDateDifference(long dateDifference) {
		this.dateDifference = dateDifference;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
	
}
