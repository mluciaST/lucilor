import { Component, OnInit } from '@angular/core';
import { plans } from '../mock-data/PLANS';
import { family_plans } from '../mock-data/family-plans';

@Component({
  selector: 'app-family-plans',
  templateUrl: './family-plans.component.html',
  styleUrls: ['./family-plans.component.css']
})
export class FamilyPlansComponent implements OnInit {
  plans: plans[] = family_plans;

  constructor() { }

  ngOnInit(): void {
  }

}
