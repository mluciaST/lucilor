package com.example.lucilor.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Devices {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int planNumber;
	@Column
    private int devicesID;
	@Column
    private int phoneNumber;

    public Devices() {
    }

    public Devices(int planNumber, int devicesID, int phoneNumber) {
        super();
        this.planNumber = planNumber;
        this.devicesID = devicesID;
        this.phoneNumber = phoneNumber;
    }

    public int getplanNumber() {
        return planNumber;
    }

    public void setplanNumber(int planNumber) {
        this.planNumber = planNumber;
    }

    public int getDevicesID() {
        return devicesID;
    }

    public void setDevicesID(int devicesID) {
        this.devicesID = devicesID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

	@Override
	public String toString() {
		return "Devices [planNumber=" + planNumber + ", devicesID=" + devicesID + ", phoneNumber=" + phoneNumber + "]";
	}
    
    
}
