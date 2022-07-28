import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CouplesPlansComponent } from './couples-plans.component';

describe('CouplesPlansComponent', () => {
  let component: CouplesPlansComponent;
  let fixture: ComponentFixture<CouplesPlansComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CouplesPlansComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CouplesPlansComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
