import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';

@Component({
  selector: 'app-employee-list',
  standalone: true,
  imports: [],
  templateUrl: './employee-list.component.html',
  styleUrl: './employee-list.component.css'
})
export class EmployeeListComponent implements OnInit{
  
  employees: Employee[];

  constructor(){};

  ngOnInit(): void {
    this.employees = [
      {
        "id": 1,
        "firstName": "Tanmay",
        "lastName": "Shreshth",
        "emailId": "tanmay@gmail.com"
      },
      {
        "id": 2,
        "firstName": "Anyone",
        "lastName": "Anonym",
        "emailId": "anyone@anyone.com"
      }
    ];
  }

}
