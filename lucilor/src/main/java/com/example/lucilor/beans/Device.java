package com.example.lucilor.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.example.lucilor.models.DeviceModel;

@Entity
@Table
public class Device {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int phoneNumber;
	@Column
    private String phoneModel;
	@Column
    private String phoneNickname;

    public Device() {}

    public Device(int phoneNumber, String phoneModel, String phoneNickname) {
        super();
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
        this.phoneNickname = phoneNickname;
    } 

    public DeviceModel(DeviceModel device) {
        this.plansNumber = device.getPlansNumber();
    	this.phoneNumber = device.getPhoneNumber();
    	this.phoneModel = device.getPhoneModel();
    	this.phoneNickname = device.getPhoneNickname();
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
		return "Device [phoneNumber=" + phoneNumber + ", phoneModel=" + phoneModel + ", phoneNickname=" + phoneNickname
				+ "]";
	}

}

