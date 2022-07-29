import { Component, OnInit } from '@angular/core';
import { accounts } from '../mock-data/savedAccounts';

@Component({
  selector: 'app-account-info',
  templateUrl: './account-info.component.html',
  styleUrls: ['./account-info.component.css']
})
export class AccountInfoComponent implements OnInit {
  myAccount = accounts[1];
  constructor() { }

  ngOnInit(): void {
    console.log(this.myAccount);
  }


}
