import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
// import { MyPlans } from 'src/app/Mock_Data/MyPlans';
// import { MYPLANS } from 'src/app/Mock_Data/planData';
import { Plans } from 'src/app/models/plans.model';
import { PlansService } from 'src/app/services/plans.service';
import { individual_plans } from '../mock-data/individual-plans';
import { plans } from '../mock-data/PLANS';

@Component({
  selector: 'app-individual-plans',
  templateUrl: './individual-plans.component.html',
  styleUrls: ['./individual-plans.component.css']
})
export class IndividualPlansComponent implements OnInit {
  plans: plans[] = individual_plans;

  constructor() { }

  ngOnInit(): void {
  }
}
