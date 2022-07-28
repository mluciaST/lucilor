import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-account-settings',
  templateUrl: './account-settings.component.html',
  styleUrls: ['./account-settings.component.css']
})
export class AccountSettingsComponent implements OnInit {
  hideAccountInfo: boolean = false;
  hideAccountForm: boolean = true;
  btnText: string = "Edit Account";
  constructor() { }

  ngOnInit(): void {
  }

  toggleForm(){
    this.hideAccountInfo = !this.hideAccountInfo;
    this.hideAccountForm = !this.hideAccountForm;
    this.btnText = this.hideAccountForm ? "Edit Account" : "Save Changes";
  }
}
