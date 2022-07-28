import { Component, OnInit } from '@angular/core';
import { MyPlans } from 'src/app/Mock_Data/MyPlans';
import { MYPLANS } from 'src/app/Mock_Data/planData';

@Component({
  selector: 'app-my-plans',
  templateUrl: './my-plans.component.html',
  styleUrls: ['./my-plans.component.css']
})
export class MyPlansComponent implements OnInit {
  plans: MyPlans[] = MYPLANS;

  constructor() { }

  ngOnInit(): void {
  }

}
