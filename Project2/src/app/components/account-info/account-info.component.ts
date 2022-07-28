import { Component, OnInit } from '@angular/core';
import { MyAccount } from 'src/app/Mock_Data/MyAccount';
import { ACCOUNTINFO } from 'src/app/Mock_Data/accountData';
@Component({
  selector: 'app-account-info',
  templateUrl: './account-info.component.html',
  styleUrls: ['./account-info.component.css']
})
export class AccountInfoComponent implements OnInit {
  accounts: MyAccount[] = ACCOUNTINFO;
  constructor() { }

  ngOnInit(): void {
  }

}
