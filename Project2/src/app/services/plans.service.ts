import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Plans } from '../models/plans.model';

@Injectable({
  providedIn: 'root'
})
export class PlansService {
  url: string = "http://localhost:8080/plans/v1";

  constructor(private http: HttpClient) { }

  getPlans(): Observable<HttpResponse<Plans[]>> {
    return this.http.get<Plans[]>(this.url, { observe: 'response' });
  }

  findById(id: number): Observable<HttpResponse<Plans>> {
    return this.http.get<Plans>(this.url + `/${id}`, { observe: 'response' });
  }
}
