import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Users } from './users';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmphttpserviceService {

  constructor(private http: HttpClient) {}

  getEmployees() : Observable<Users[]> {
    return this.http.get<Users[]>('http://backend:8080/employees');
  }
}