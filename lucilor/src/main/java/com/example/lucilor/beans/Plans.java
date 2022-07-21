package com.example.lucilor.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Plans {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planNumber;
	@Column
    private int cloudStorage;
	@Column
    private String description;
	@Column
    private int devices;
    @Column
    private int mobileHotspotData;
    @Column
    private int networkAccess;
    @Column
    private double planCost;
    @Column
    private String planName;
    

    public Plans() {
    }

    public Plans(int cloudStorage, String description, int devices, int mobileHotspotData, int networkAccess,
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
