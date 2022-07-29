import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AccountInfo } from '../models/account-info.model';

@Injectable({
  providedIn: 'root'
})
export class AccountInfoService {
  url: string = "http://localhost:8080/accountinfo/v1";

  constructor(private http: HttpClient) { }

 
    findAll(email: String): Observable<HttpResponse<AccountInfo>> {
      return this.http.get<AccountInfo>(this.url + `/${email}`, { observe: 'response' });
    }

    save(accountInfo: AccountInfo): Observable<HttpResponse<AccountInfo>> {
      return this.http.post<AccountInfo>(this.url, accountInfo, { observe: 'response'});
    }

    updateAccount(accountPlans: AccountInfo): Observable<HttpResponse<AccountInfo>> {
      return this.http.put<AccountInfo>(this.url, accountPlans, { observe: 'response' });
    }

    deletAccount(email: String): void {
      this.http.delete<AccountInfo>(this.url + `/${email}`, { observe: 'response'})
    }
}
