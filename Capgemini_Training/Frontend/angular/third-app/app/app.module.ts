import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { from } from 'rxjs';
import { GitUsersComponent } from './git-users/git-users.component';
import { MoviesComponent } from './movies/movies.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { EmployeesComponent } from './employees/employees.component';
import { SamplePipe } from './sample.pipe';
import { FilterPipe } from './filter.pipe';
import { AddStudentComponent } from './add-student/add-student.component';
import { StudentsComponent } from './students/students.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    UsersComponent,
    GitUsersComponent,
    MoviesComponent,
    AddEmployeeComponent,
    EmployeesComponent,
    SamplePipe,
    FilterPipe,
    AddStudentComponent,
    StudentsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
