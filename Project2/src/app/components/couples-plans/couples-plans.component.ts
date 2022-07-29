import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
// import { MyPlans } from 'src/app/Mock_Data/MyPlans';
// import { MYPLANS } from 'src/app/Mock_Data/planData';
import { Plans } from 'src/app/models/plans.model';
import { PlansService } from 'src/app/services/plans.service';

@Component({
  selector: 'app-couples-plans',
  templateUrl: './couples-plans.component.html',
  styleUrls: ['./couples-plans.component.css']
})
export class CouplesPlansComponent implements OnInit {
  //plans: MyPlans[] = MYPLANS;

  plans: Plans = new Plans(200, "Share everything with a partner", 60, 30, 69.99, "Couple Plan", 2)
  constructor(private plansService: PlansService, private router: Router) { }

  ngOnInit(): void {
    let resp = this.plansService.getPlans().subscribe((data) => {
      if(data.body != null) {
        //this.plans = data.body;
      }
    });
  }

  public save(): void {
    this.plansService.save(this.plans).subscribe(data => {
      let route = this.router.config.find(r => r.path === 'plans');
      if (route) {
        this.router.navigateByUrl('/plans');
      }
    });
  }
  
  deletePlan(id: number): void {
    let resp = this.plansService.deletePlan(id);
    //resp.subscribe((data) => this.plans = data);
  }

}
