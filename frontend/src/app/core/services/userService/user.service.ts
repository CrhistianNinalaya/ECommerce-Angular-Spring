import { Injectable } from '@angular/core';
import { User } from '../../models/user';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private baseURL = "http://localhost:8080/api/v1/register";

  constructor(private httpClient: HttpClient) { }

  registerUser(user: User): Observable<User> {
    return this.httpClient.post<User>(`${this.baseURL}`, user);
    // return this.httpClient.post(`${this.baseURL}`, user);
  }
}