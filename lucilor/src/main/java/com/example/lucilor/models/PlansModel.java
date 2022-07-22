package com.example.lucilor.models;

import javax.persistence.Column;

import com.example.lucilor.beans.Plans;

public class PlansModel {

	private int planNumber;
	private int cloudStorage;
	private String description;
	private int devices;
    private int mobileHotspotData;
    private int networkAccess;
    private double planCost;
    private String planName;
    

    public PlansModel() {
    	super();
    }
    
    public PlansModel(Plans plans) {
    	this.planNumber = plans.getPlanNumber();
    	this.cloudStorage = plans.getCloudStorage();
    	this.description = plans.getDescription();
    	this.devices = plans.getDevices();
    	this.mobileHotspotData = plans.getMobileHotspotData();
    	this.networkAccess = plans.getNetworkAccess();
    	this.planCost = plans.getPlanCost();
    	this.planName = plans.getPlanName();
    }

    public PlansModel(int cloudStorage, String description, int devices, int mobileHotspotData, int networkAccess,
            double planCost, String planName, int planNumber) {
        super();
        this.cloudStorage = cloudStorage;
        this.description = description;
        this.devices = devices;
        this.mobileHotspotData = mobileHotspotData;
        this.networkAccess = networkAccess;
        this.planCost = planCost;
        this.planName = planName;
        this.planNumber = planNumber;
    }
    
//    public PlansModel(int cloudStorage, String description, int devices, int mobileHotspotData, int networkAccess,
//            double planCost, String planName, int planNumber, Set<>) {
//        super();
//        this.cloudStorage = cloudStorage;
//        this.description = description;
//        this.devices = devices;
//        this.mobileHotspotData = mobileHotspotData;
//        this.networkAccess = networkAccess;
//        this.planCost = planCost;
//        this.planName = planName;
//        this.planNumber = planNumber;
//    }

    public int getCloudStorage() {
        return cloudStorage;
    }

    public void setCloudStorage(int cloudStorage) {
        this.cloudStorage = cloudStorage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDevices() {
        return devices;
    }

    public void setDevices(int devices) {
        this.devices = devices;
    }

    public int getMobileHotspotData() {
        return mobileHotspotData;
    }

    public void setMobileHotspotData(int mobileHotspotData) {
        this.mobileHotspotData = mobileHotspotData;
    }

    public int getNetworkAccess() {
        return networkAccess;
    }

    public void setNetworkAccess(int networkAccess) {
        this.networkAccess = networkAccess;
    }

    public double getPlanCost() {
        return planCost;
    }

    public void setPlanCost(double planCost) {
        this.planCost = planCost;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getPlanNumber() {
        return planNumber;
    }

    public void setPlanNumber(int planNumber) {
        this.planNumber = planNumber;
    }

	@Override
	public String toString() {
		return "Plans [planNumber=" + planNumber + ", cloudStorage=" + cloudStorage + ", description=" + description
				+ ", devices=" + devices + ", mobileHotspotData=" + mobileHotspotData + ", networkAccess="
				+ networkAccess + ", planCost=" + planCost + ", planName=" + planName + "]";
	}

    
}