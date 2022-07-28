import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FamilyPlansComponent } from './family-plans.component';

describe('FamilyPlansComponent', () => {
  let component: FamilyPlansComponent;
  let fixture: ComponentFixture<FamilyPlansComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FamilyPlansComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FamilyPlansComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
