package com.caresoftinterfaces;
import java.util.Date;
import java.util.ArrayList;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	
	private String role;
	private Integer employeeId;
	private ArrayList<String> securityIncidents = new ArrayList<String>();
	
	public AdminUser(Integer Id, String role) {
		super(Id);
		this.setRole(role);
	}

	public ArrayList<String> reportSecurityIncidents() {
		return securityIncidents;
	}

	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(this.getId() == confirmedAuthID ) {
			return true;
		}
		authIncident();
		return false;
	}


	public boolean assignPin(int pin) {
		int length = 0;
		while(pin != 0) {
			pin = pin / 10;
			length++;
		}
		System.out.println(length);
		if(length != 6) {
			return false;
		}
		else{
			return true;
		}
	}
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
}