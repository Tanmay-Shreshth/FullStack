import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-list',
  standalone: true,
  imports: [],
  templateUrl: './employee-list.component.html',
  styleUrl: './employee-list.component.css'
})
export class EmployeeListComponent implements OnInit{
  
  employees: Employee[];

  constructor(private employeeService : EmployeeService){};

  ngOnInit(): void {
    this.getEmployeeList();
  }

  private getEmployeeList(){
    this.employeeService.getEmployeesList().subscribe(employee=> {
      this.employees = employee;
    });
  }

}
