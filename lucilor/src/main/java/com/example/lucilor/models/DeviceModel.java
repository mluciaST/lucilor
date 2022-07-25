package com.example.lucilor.models;

import com.example.lucilor.beans.Device;

public class DeviceModel {
    private int plansNumber; // placeholder for the id
	private int phoneNumber;
	private String phoneModel;
	private String phoneNickname;

    public DeviceModel() {
    	super();
    }

    public DeviceModel(Device device) {
        this.plansNumber = device.getPlansNumber();
    	this.phoneNumber = device.getPhoneNumber();
    	this.phoneModel = device.getPhoneModel();
    	this.phoneNickname = device.getPhoneNickname();
        
    }
    
    public DeviceModel(int plansNumber, int phoneNumber, String phoneModel, String phoneNickname) {
        super();
        this.plansNumber = plansNumber;
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
        this.phoneNickname = phoneNickname;
    } 

    public int getPlansNumber() {
        return plansNumber;
    }

    public void setPlansNumber(int plansNumber) {
        this.plansNumber = plansNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getPhoneNickname() {
        return phoneNickname;
    }

    public void setPhoneNickname(String phoneNickname) {
        this.phoneNickname = phoneNickname;
    }

	@Override
	public String toString() {
		return "Device [plansNumber="+ plansNumber +", phoneNumber=" + phoneNumber + ", phoneModel=" + phoneModel + ", phoneNickname=" + phoneNickname
				+ "]";
	}

	
}
