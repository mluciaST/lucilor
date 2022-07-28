import { Component, OnInit } from '@angular/core';
import { MyPlans } from 'src/app/Mock_Data/MyPlans';
import { MYPLANS } from 'src/app/Mock_Data/planData';

@Component({
  selector: 'app-couples-plans',
  templateUrl: './couples-plans.component.html',
  styleUrls: ['./couples-plans.component.css']
})
export class CouplesPlansComponent implements OnInit {
  plans: MyPlans[] = MYPLANS;
  constructor() { }

  ngOnInit(): void {
  }

}
