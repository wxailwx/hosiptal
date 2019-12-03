package cn.sfturing.entity;

public class Doctor {

	private String DID;
	private String name;
	private String faculty;
	private String profession;
	private String political;
	private String expertise;
	private String description;
	private String HID;
	private String status;
	private String pinying;
	private String full_surname;
	private String abbre_surname;
	private String full_firstname;
	private String abbre_firstname;

	public void setHID(String HID) {
		this.HID = HID;
	}

	public String getHID() {
		return HID;
	}

	public void setDID(String DID) {
		this.DID = DID;
	}

	public String getDID() {
		return DID;
	}

	public void setAbbre_surname(String abbre_surname) {
		this.abbre_surname = abbre_surname;
	}

	public String getAbbre_surname() {
		return abbre_surname;
	}

	public void setAbbre_firstname(String abbre_firstname) {
		this.abbre_firstname = abbre_firstname;
	}

	public String getAbbre_firstname() {
		return abbre_firstname;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFull_firstname(String full_firstname) {
		this.full_firstname = full_firstname;
	}

	public String getFull_firstname() {
		return full_firstname;
	}

	public void setFull_surname(String full_surname) {
		this.full_surname = full_surname;
	}

	public String getFull_surname() {
		return full_surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPinying(String pinying) {
		this.pinying = pinying;
	}

	public String getPinying() {
		return pinying;
	}

	public void setPolitical(String political) {
		this.political = political;
	}

	public String getPolitical() {
		return political;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}


