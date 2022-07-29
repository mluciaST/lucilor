import { Component, OnInit } from '@angular/core';
// import { MyAccount } from 'src/app/Mock_Data/MyAccount';
// import { ACCOUNTINFO } from 'src/app/Mock_Data/accountData';
import { AppComponent } from 'src/app/app.component';

@Component({
  selector: 'app-account-info',
  templateUrl: './account-info.component.html',
  styleUrls: ['./account-info.component.css']
})
export class AccountInfoComponent implements OnInit {
  //accounts: MyAccount[] = ACCOUNTINFO;
   
  //email: String ;
  constructor(private email: String) { }

  ngOnInit(): void {
  }

}
