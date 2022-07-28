import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-accounts',
  templateUrl: './accounts.component.html',
  styleUrls: ['./accounts.component.css']
})
export class AccountsComponent implements OnInit {
  hideMyPlans = true;
  hideDevices = true;
  hideBills = true;
  hideAccountSettings = true;

  constructor() { }

  ngOnInit(): void {}

  toggleMyPlans(){
    this.hideMyPlans = false;
    this.hideDevices = true;
    this.hideBills = true;
    this.hideAccountSettings = true;
  }
  toggleDevices(){
    this.hideMyPlans = true;
    this.hideDevices = false;
    this.hideBills = true;
    this.hideAccountSettings = true;
  }
  toggleBills(){
    this.hideMyPlans = true;
    this.hideDevices = true;
    this.hideBills = false;
    this.hideAccountSettings = true;
  }
  toggleAccountSettings(){
    this.hideMyPlans = true;
    this.hideDevices = true;
    this.hideBills = true;
    this.hideAccountSettings = false;
  }

}
