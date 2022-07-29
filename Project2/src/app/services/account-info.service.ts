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


    findAll(): Observable<HttpResponse<AccountInfo>> {
      return this.http.get<AccountInfo>(this.url, { observe: 'response' });
    }

    findByEmail(email: string): void {
      this.http.get<AccountInfo>(this.url + `/${email}`, { observe: 'response'})
    }

    save(accountInfo: AccountInfo): Observable<HttpResponse<AccountInfo>> {
      return this.http.post<AccountInfo>(this.url, accountInfo, { observe: 'response'});
    }

    updateAccount(accountInfo: AccountInfo): Observable<HttpResponse<AccountInfo>> {
      return this.http.put<AccountInfo>(this.url, accountInfo, { observe: 'response' });
    }

    deleteAccount(id: number): void {
      this.http.delete<AccountInfo>(this.url + `/${id}`, { observe: 'response'})
    }
}
