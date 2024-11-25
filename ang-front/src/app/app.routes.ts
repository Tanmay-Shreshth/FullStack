import { Routes } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';

export const routes: Routes = [
    {path: 'employees', component: EmployeeListComponent},
    {path: 'createEmployee', component: CreateEmployeeComponent},
    {path: '', redirectTo : 'employees', pathMatch: 'full'}
];
