package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="blood_Details")

public class bloodBank {
	
	@Id
	@Column(name="bankId")
	private int bankId;
	@Column(name="bankName")
	private String bankName;
	@Column(name="bankEmail")
	private String bankEmail;
	@Column(name="bloodGroup")
	private String bloodGroup;
	@Column(name="availability")
	private String availability;
	@Column(name="password")
	private String password;
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankEmail() {
		return bankEmail;
	}
	public void setBankEmail(String bankEmail) {
		this.bankEmail = bankEmail;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}

	public bloodBank(int bankId, String bankName, String bankEmail, String bloodGroup, String availability, String password) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankEmail = bankEmail;
		this.bloodGroup = bloodGroup;
		this.availability = availability;
		this.password=password;
	}
	public bloodBank()
	{
		
	}
	public String toString()
	{
		return "bankId="+bankId+"bankName="+bankName+"bankEmail"+
				bankEmail+"bloodGroup"+bloodGroup+"availability"+
				availability+"password="+password;
	}
	
}
