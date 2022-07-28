package com.example.lucilor.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.example.lucilor.models.PlansModel;

@Entity
@Table
public class Plans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int plansNumber;
    @Column
    private int cloudStorage;
    @Column
    private String description;
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

    public Plans(int cloudStorage, String description, int mobileHotspotData, int networkAcces,
            double plansCost, String plansName, int plansNumber) {
        super();
        this.cloudStorage = cloudStorage;
        this.description = description;
        this.mobileHotspotData = mobileHotspotData;
        this.networkAccess = networkAcces;
        this.planCost = plansCost;
        this.planName = plansName;
        this.plansNumber = plansNumber;
    }

    public Plans(PlansModel plans) {
        this.plansNumber = plans.getPlansNumber();
        this.cloudStorage = plans.getCloudStorage();
        this.description = plans.getDescription();
        this.mobileHotspotData = plans.getMobileHotspotData();
        this.networkAccess = plans.getNetworkAccess();
        this.planCost = plans.getPlanCost();
        this.planName = plans.getPlanName();
    }

    public int getPlansNumber() {
        return plansNumber;
    }

    public void setPlansNumber(int plansNumber) {
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

    public void setNetworkAcces(int networkAcces) {
        this.networkAccess = networkAcces;
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

    public int getNetworkAccess() {
        return networkAccess;
    }

}

    

