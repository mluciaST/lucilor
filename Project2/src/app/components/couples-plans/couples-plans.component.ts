import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { plans } from '../mock-data/PLANS';
import { couples_plans } from '../mock-data/couple-plans';

@Component({
  selector: 'app-couples-plans',
  templateUrl: './couples-plans.component.html',
  styleUrls: ['./couples-plans.component.css']
})
export class CouplesPlansComponent implements OnInit {
  plans: plans[] = couples_plans;

  constructor() { }

  ngOnInit(): void {
  }
}
