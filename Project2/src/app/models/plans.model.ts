export class Plans {
    cloudStorage: number;
    description: String;
    mobileHotspotData: number;
    networkAccess: number;
    planCost: number;
    planName: String;
    plansNumber: number;

    constructor (cloudStorage: number,
        description: String,
        mobileHotspotData: number,
        networkAccess: number,
        planCost: number,
        planName: String,
        plansNumber: number) {
            this.cloudStorage = cloudStorage;
            this.description = description;
            this.mobileHotspotData = mobileHotspotData;
            this.networkAccess = networkAccess;
            this.planCost = planCost;
            this.planName = planName;
            this.plansNumber = plansNumber;
    }
}
