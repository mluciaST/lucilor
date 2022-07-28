import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountsComponent } from './components/accounts/accounts.component';
import { DevicesComponent } from './components/devices/devices.component';
import { HomeComponent } from './components/home/home.component';
import { PhonePlansComponent } from './components/phone-plans/phone-plans.component';

const routes: Routes = [
  {path:'', component: HomeComponent},
  {path: 'phone-plans', component: PhonePlansComponent},
  {path:'devices', component: DevicesComponent},
  {path: 'accounts', component: AccountsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
