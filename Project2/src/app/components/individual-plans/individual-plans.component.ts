import { Component, OnInit } from '@angular/core';
import { MyPlans } from 'src/app/Mock_Data/MyPlans';
import { MYPLANS } from 'src/app/Mock_Data/planData';

@Component({
  selector: 'app-individual-plans',
  templateUrl: './individual-plans.component.html',
  styleUrls: ['./individual-plans.component.css']
})
export class IndividualPlansComponent implements OnInit {
  plans: MyPlans[] = MYPLANS;
  constructor() { }

  ngOnInit(): void {
  }

}
