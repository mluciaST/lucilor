import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AccountPlans } from '../models/account-plans.model';

@Injectable({
  providedIn: 'root'
})
export class AccountPlansService {
  url: string = "http://localhost:8080/accountplans/v1";

  constructor(private http:HttpClient) { }

  findAll(): Observable<HttpResponse<AccountPlans[]>> {
    return this.http.get<AccountPlans[]>(this.url, { observe: 'response' });
  }

  findById(id: number): Observable<HttpResponse<AccountPlans>> {
    return this.http.get<AccountPlans>(this.url + `/${id}`, { observe: 'response' });
  }

  save(accountPlans: AccountPlans): Observable<HttpResponse<AccountPlans>> {
    return this.http.post<AccountPlans>(this.url, accountPlans, { observe: 'response' });
  }

  deletAccountPlan(id: number): void {
    this.http.delete<AccountPlans>(this.url + `/${id}`, { observe: 'response'})
  }

}
