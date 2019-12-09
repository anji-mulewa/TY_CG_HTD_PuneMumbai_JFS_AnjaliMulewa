import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './auth.guard';
import { MoviesComponent } from './movies/movies.component';


const routes: Routes = [
  { path: '' , component: HomeComponent},
  { path: 'about' , component: AboutComponent , canActivate: [AuthGuard]},
  { path: 'register' , component: RegisterComponent},
  { path: 'login' , component: LoginComponent}, 
  { path: 'movies' , component: MoviesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
