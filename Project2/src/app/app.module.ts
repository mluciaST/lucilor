import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { OAuthModule } from 'angular-oauth2-oidc';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PhonePlansComponent } from './components/phone-plans/phone-plans.component';
import { AccountSettingsComponent } from './components/account-settings/account-settings.component';
import { BillsComponent } from './components/bills/bills.component';
import { AccountsComponent } from './components/accounts/accounts.component';
import { FooterComponent } from './components/footer/footer.component';
import { DevicesComponent } from './components/devices/devices.component';
import { HomeComponent } from './components/home/home.component';
import { AccountContentComponent } from './components/account-content/account-content.component';
import { AccountSettingsFormComponent } from './components/account-settings-form/account-settings-form.component';

@NgModule({
  declarations: [
    AppComponent,
    PhonePlansComponent,
    AccountSettingsComponent,
    BillsComponent,
    AccountsComponent,
    FooterComponent,
    DevicesComponent,
    HomeComponent,
    AccountContentComponent,
    AccountSettingsFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    OAuthModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
