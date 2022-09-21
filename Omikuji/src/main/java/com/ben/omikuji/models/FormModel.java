package com.ben.omikuji.models;

public class FormModel {
	int luckyNumber;
	String city;
	String person;
	String hobby;
	String livingThing;
	String niceMessage;
	
	public FormModel() {}
	
	public FormModel(int luckyNumber, String city, String person, String hobby, String livingThing, String niceMessage) {
		this.luckyNumber = luckyNumber;
		this.city = city;
		this.person = person;
		this.hobby = hobby;
		this.livingThing = livingThing;
		this.niceMessage = niceMessage;
	}

	public int getNumber() {
		return luckyNumber;
	}

	public void setNumber(int number) {
		this.luckyNumber = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getLivingThing() {
		return livingThing;
	}

	public void setLivingThing(String livingThing) {
		this.livingThing = livingThing;
	}

	public String getNiceMessage() {
		return niceMessage;
	}

	public void setNiceMessage(String niceMessage) {
		this.niceMessage = niceMessage;
	}
	
}
