import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Plans } from 'src/app/models/plans.model';
import { PlansService } from 'src/app/services/plans.service';
// import { MyPlans } from 'src/app/Mock_Data/MyPlans';
// import { MYPLANS } from 'src/app/Mock_Data/planData';

@Component({
  selector: 'app-my-plans',
  templateUrl: './my-plans.component.html',
  styleUrls: ['./my-plans.component.css']
})
export class MyPlansComponent implements OnInit {
  //plans: MyPlans[] = MYPLANS;
  plans: Plans = new Plans(0, "", 0, 0, 0, "", 0);

  constructor(private plansService: PlansService, private router: Router) { }

  ngOnInit(): void {
    let resp = this.plansService.getPlans().subscribe((data) => {
      if(data.body != null) {
        //this.plans = data.body;
      }
    });
  }

}
