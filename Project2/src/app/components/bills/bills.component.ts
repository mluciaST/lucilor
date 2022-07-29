import { Component, OnInit } from '@angular/core';
import { my_plans } from '../mock-data/my-plans';
import { plans } from '../mock-data/PLANS';

@Component({
  selector: 'app-bills',
  templateUrl: './bills.component.html',
  styleUrls: ['./bills.component.css']
})
export class BillsComponent implements OnInit {
  plans: plans[] = my_plans;
  total_cost!: number;
  constructor() { }

  ngOnInit(): void {

  }

}
