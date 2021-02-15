package com.Reports.web.Model;

//Getter & Setters for Incident Tickets

public class Incidents {
	
	private int incidentID;
	private String Category;
	private String ContactType;
	private String Priority;
	private String Status;
	private String Heading;
	private String Description;
	
	
	
	public int getIncidentID() {
		return incidentID;
	}
	public void setIncidentID(int incidentID) {
		this.incidentID = incidentID;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getContactType() {
		return ContactType;
	}
	public void setContactType(String contactType) {
		ContactType = contactType;
	}
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getHeading() {
		return Heading;
	}
	public void setHeading(String heading) {
		Heading = heading;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

}
