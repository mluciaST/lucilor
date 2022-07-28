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
import { AccountSettingsFormComponent } from './components/account-settings-form/account-settings-form.component';
import { MyPlansComponent } from './components/my-plans/my-plans.component';
import { IndividualPlansComponent } from './components/individual-plans/individual-plans.component';
import { CouplesPlansComponent } from './components/couples-plans/couples-plans.component';
import { FamilyPlansComponent } from './components/family-plans/family-plans.component';
import { ButtonComponent } from './components/button/button.component';
import { DeviceTableComponent } from './components/device-table/device-table.component';
import { DecimalPipe } from '@angular/common';
import { AccountInfoComponent } from './components/account-info/account-info.component';

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
    AccountSettingsFormComponent,
    MyPlansComponent,
    IndividualPlansComponent,
    CouplesPlansComponent,
    FamilyPlansComponent,
    ButtonComponent,
    DeviceTableComponent,
    AccountInfoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    OAuthModule.forRoot()
  ],
  providers: [DecimalPipe],
  bootstrap: [AppComponent]
})
export class AppModule { }
