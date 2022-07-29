import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Device } from '../models/device.model';

@Injectable({
  providedIn: 'root'
})
export class DeviceService {
  url: string = "http://localhost:8080/accountplans/v1";

  constructor(private http:HttpClient) { }

  findAll(): Observable<HttpResponse<Device[]>> {
    return this.http.get<Device[]>(this.url, { observe: 'response' });
  }

  findById(id: number): Observable<HttpResponse<Device>> {
    return this.http.get<Device>(this.url + `/${id}`, { observe: 'response' });
  }

  updateDevice(accountPlans: Device): Observable<HttpResponse<Device>> {
    return this.http.post<Device>(this.url, accountPlans, { observe: 'response' });
  }

  deletDevice(id: number): void {
    this.http.delete<Device>(this.url + `/${id}`, { observe: 'response'})
  }
}
