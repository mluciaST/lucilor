import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { GoogleApiService, UserInfo } from './google-api.service';
import { AccountInfo } from './models/account-info.model';
import { AccountInfoService } from './services/account-info.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  userInfo?: UserInfo
  email?: string =  this.userInfo?.info.email;
  accounts : AccountInfo[] = [];
  selectedAccount ?: AccountInfo;

  title = 'Project2';
  constructor(private readonly googleApi: GoogleApiService, private accountService: AccountInfoService, private router: Router){
    googleApi.userProfileSubject.subscribe((info: UserInfo | undefined) => {
      this.userInfo = info
    })
  }

  isLoggedIn(): boolean {
    return this.googleApi.isLoggedIn()
  }

  signOut() {
    this.googleApi.signOut()
  }
}
