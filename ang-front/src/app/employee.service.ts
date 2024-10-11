import { Injectable } from '@angular/core';
import { from, Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  
  constructor() { }

  getEmployeesList() : Observable<any>{
    return from(fetch('http://localhost:8080/employee/get').then(response => response.json()));
  }

  
}
