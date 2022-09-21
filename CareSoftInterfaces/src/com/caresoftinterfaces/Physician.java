package com.caresoftinterfaces;

import java.sql.Date;
import java.util.ArrayList;

public class Physician extends User implements HIPAACompliantUser {

	public Physician(Integer id) {
		super(id);
//		System.out.println("test");
	}
	
	
    private ArrayList<String> patientNotes;

    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }


	public boolean assignPin(int pin) {
		int length = 0;
		while(pin != 0) {
			pin = pin / 10;
			length++;
		}
//		System.out.println(length);
		if(length != 4) {
			return false;
		}
		else{
			return true;
		}
	}


	public boolean accessAuthorized(Integer confirmedAuthID) {
		
		if(this.getId() == confirmedAuthID ) {
		return true;
		}
		return false;
	}

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

}
