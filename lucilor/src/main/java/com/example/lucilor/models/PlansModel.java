package com.example.lucilor.models;

import com.example.lucilor.beans.Plans;

public class PlansModel {

	private int plansNumber;
	private int cloudStorage;
	private String description;
    private int mobileHotspotData;
    private int networkAccess;
    private double planCost;
    private String planName;
    

    public PlansModel() {
    	super();
    }
    
    public PlansModel(Plans plans) {
    	this.plansNumber = plans.getPlansNumber();
    	this.cloudStorage = plans.getCloudStorage();
    	this.description = plans.getDescription();
    	this.mobileHotspotData = plans.getMobileHotspotData();
    	this.networkAccess = plans.getNetworkAccess();
    	this.planCost = plans.getPlanCost();
    	this.planName = plans.getPlanName();
    }

    public PlansModel(int cloudStorage, String description, int mobileHotspotData, int networkAccess,
            double planCost, String planName, int plansNumber) {
        super();
        this.cloudStorage = cloudStorage;
        this.description = description;
        this.mobileHotspotData = mobileHotspotData;
        this.networkAccess = networkAccess;
        this.planCost = planCost;
        this.planName = planName;
        this.plansNumber = plansNumber;
    }

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

    public int getPlansNumber() {
        return plansNumber;
    }

    public void setPlansNumber(int plansNumber) {
        this.plansNumber = plansNumber;
    }

	@Override
	public String toString() {
		return "Plans [plansNumber=" + plansNumber + ", cloudStorage=" + cloudStorage + ", description=" + description
				+ ", mobileHotspotData=" + mobileHotspotData + ", networkAccess="
				+ networkAccess + ", planCost=" + planCost + ", planName=" + planName + "]";
	}
}
