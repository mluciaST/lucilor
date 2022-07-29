import { Component, OnInit } from '@angular/core';
import { plans } from '../mock-data/PLANS';
import { my_plans} from '../mock-data/my-plans';

@Component({
  selector: 'app-my-plans',
  templateUrl: './my-plans.component.html',
  styleUrls: ['./my-plans.component.css']
})
export class MyPlansComponent implements OnInit {
  plans: plans[] = my_plans;
  hideDevices: boolean = true;
  constructor() { }

  ngOnInit(): void {
  }

  toggleDevices(){
    this.hideDevices = !this.hideDevices;
  }

  removePlan(){
    console.log("remove");
  }
}
