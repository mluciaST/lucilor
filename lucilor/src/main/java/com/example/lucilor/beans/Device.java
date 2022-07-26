package com.example.lucilor.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.example.lucilor.models.DeviceModel;

@Entity
@Table
public class Device {
	@Id
    @Column
    private String phoneNumber;
	@Column
    private String phoneModel;
	@Column
    private String phoneNickname;
    @Column
    private int plansNumber;

    public Device() {}

    public Device(int plansNumber, String phoneNumber, String phoneModel, String phoneNickname) {
        super();
        this.plansNumber = plansNumber;
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
        this.phoneNickname = phoneNickname;
    } 

    public Device(DeviceModel device) {
        this.plansNumber = device.getPlansNumber();
    	this.phoneNumber = device.getPhoneNumber();
    	this.phoneModel = device.getPhoneModel();
    	this.phoneNickname = device.getPhoneNickname();
    }

    public int getPlansNumber() {
        return plansNumber;
    }

    public void setPlansNumber(int plansNumber) {
        this.plansNumber = plansNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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

