import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { GitUsersComponent } from './git-users/git-users.component';
import { MoviesComponent } from './movies/movies.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { EmployeesComponent } from './employees/employees.component';
import { AddStudentComponent } from './add-student/add-student.component';
import { StudentsComponent } from './students/students.component';


const routes: Routes = [
  { path: '' , component:HomeComponent},
  { path: 'users' , component:UsersComponent},
  { path: 'git-users' , component:GitUsersComponent},
  { path: 'movies' , component:MoviesComponent},
  { path: 'add-employees', component:AddEmployeeComponent},
  { path : 'employees' , component:EmployeesComponent} ,
  { path: 'add-student' , component:AddStudentComponent},
  { path: 'students' , component:StudentsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
