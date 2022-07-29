import { plans } from "./PLANS";

export const family_plans: plans[] = [
  {
    plansNumber: 7,
    plansName: "Family Plan Low ",
    planCost: 89.99,
    description: "Share everything with up to 3 family members",
    networkAccess: 150,
    mobileHotspotData: 100,
    cloudStorage: 150
  },
  {
    plansNumber: 8,
  plansName: "Family Plan Regular",
  planCost: 99.99,
  description: "Share everything with up to 3 family members with more data",
  networkAccess: 200,
  mobileHotspotData: 200,
  cloudStorage: 250
  },
  {
    plansNumber: 9,
    plansName: "Family Plan High",
    planCost: 109.99,
    description: "Share everything with up to 3 family members with the most data",
    networkAccess: 300,
    mobileHotspotData: 250,
    cloudStorage: 350
  }
]
