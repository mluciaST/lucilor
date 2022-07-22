package com.example.lucilor.models;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;

import com.example.lucilor.beans.AccountInformation;

public class AccountInformationModel {
	private int accountNumber;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private LocalDate dateOfBirth;
	private String email;
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String state;
	private int zip;

    public AccountInformationModel() {
    	super();
    }
    
    public AccountInformationModel(AccountInformation accountInfo) {
    	this.accountNumber = accountInfo.getAccountNumber();
    	this.addressLine1 = accountInfo.getAddressLine1();
    	this.addressLine2 = accountInfo.getAddressLine2();
    	this.city = accountInfo.getCity();
    	this.dateOfBirth = accountInfo.getDateOfBirth();
    	this.email = accountInfo.getEmail();
    	this.firstName = accountInfo.getFirstName();
    	this.lastName = accountInfo.getLastName();
    	this.phoneNumber = accountInfo.getPhoneNumber();
    	this.state = accountInfo.getState();
    	this.zip = accountInfo.getZip();
    }

    public AccountInformationModel(int accountNumber, String addressLine1, String addressLine2, String city,
            LocalDate dateOfBirth, String email, String firstName, String lastName, int phoneNumber,
            String state, int zip) {
        super();
        this.accountNumber = accountNumber;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.state = state;
        this.zip = zip;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

	@Override
	public String toString() {
		return "AccountInformation [accountNumber=" + accountNumber + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", city=" + city + ", dateOfBirth=" + dateOfBirth + ", email="
				+ email + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", state=" + state + ", zip=" + zip + "]";
	}

    
}
