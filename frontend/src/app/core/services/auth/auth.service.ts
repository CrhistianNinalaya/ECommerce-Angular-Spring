import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private baseURL = "http://localhost:8080/api/v1/login";

  constructor(private http:HttpClient) { }

  login(email: string, password: string) {
    return this.http.post(`${this.baseURL}`, { email, password });
  }
}
