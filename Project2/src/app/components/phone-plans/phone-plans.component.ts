import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-phone-plans',
  templateUrl: './phone-plans.component.html',
  styleUrls: ['./phone-plans.component.css']
})
export class PhonePlansComponent implements OnInit {
  hideMyPlans = true;
  hideIndividualPlans = true;
  hideCouplesPlans = true;
  hideFamilyPlans = true;

  constructor() { }

  ngOnInit(): void {}

  toggleMyPlans(){
    this.hideMyPlans = false;
    this.hideIndividualPlans = true;
    this.hideCouplesPlans = true;
    this.hideFamilyPlans = true;
  }
  toggleIndividualPlans(){
    this.hideMyPlans = true;
    this.hideIndividualPlans = false;
    this.hideCouplesPlans = true;
    this.hideFamilyPlans = true;
  }
  toggleCouplesPlans(){
    this.hideMyPlans = true;
    this.hideIndividualPlans = true;
    this.hideCouplesPlans = false;
    this.hideFamilyPlans = true;
  }
  toggleFamilyPlans(){
    this.hideMyPlans = true;
    this.hideIndividualPlans = true;
    this.hideCouplesPlans = true;
    this.hideFamilyPlans = false;
  }

}
