import { Component, OnInit } from '@angular/core';
import { MyPlans } from 'src/app/Mock_Data/MyPlans';
import { MYPLANS } from 'src/app/Mock_Data/planData';

@Component({
  selector: 'app-family-plans',
  templateUrl: './family-plans.component.html',
  styleUrls: ['./family-plans.component.css']
})
export class FamilyPlansComponent implements OnInit {
  plans: MyPlans[] = MYPLANS;
  constructor() { }

  ngOnInit(): void {
  }

}
