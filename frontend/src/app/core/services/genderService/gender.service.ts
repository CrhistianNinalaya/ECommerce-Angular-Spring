import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Gender } from '../../models/gender';

@Injectable({
  providedIn: 'root'
})
export class GenderService {

  private baseURL = "http://localhost:8080/api/v1/register";

  constructor(private httpClient: HttpClient) { }

  fetchGenders(): Observable<Gender[]> {
    return this.httpClient.get<Gender[]>(`${this.baseURL}`);
  }  
}