import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
// import { MyPlans } from 'src/app/Mock_Data/MyPlans';
// import { MYPLANS } from 'src/app/Mock_Data/planData';
import { Plans } from 'src/app/models/plans.model';
import { PlansService } from 'src/app/services/plans.service';

@Component({
  selector: 'app-family-plans',
  templateUrl: './family-plans.component.html',
  styleUrls: ['./family-plans.component.css']
})
export class FamilyPlansComponent implements OnInit {
  //plans: MyPlans[] = MYPLANS;

  plans: Plans = new Plans(1000, "Share everything with up to 4 family members", 100, 80, 99.99, "Family Plan", 3)
  
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
