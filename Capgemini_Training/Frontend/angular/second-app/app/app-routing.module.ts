import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BindingComponent } from './binding/binding.component';
import { HomeComponent } from './home/home.component';
import { TwoWayDatabindingComponent } from './two-way-databinding/two-way-databinding.component';
import { StructuralDirectivesComponent } from './structural-directives/structural-directives.component';
import { ProductComponent } from './product/product.component';
import { ParentComponent } from './parent/parent.component';
import { BikesComponent } from './bikes/bikes.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';


const routes: Routes = [
  { path:'data-binding',component:BindingComponent},
  { path:'home',component:HomeComponent},
  { path:'two-way', component:TwoWayDatabindingComponent},
  { path: 'structural-directives' , component:StructuralDirectivesComponent},
  { path: 'product' , component:ProductComponent},
  { path: 'parent' , component:ParentComponent},
  { path: 'bikes' , component:BikesComponent},
  { path: 'login', component:LoginComponent},
  {path: 'register' , component:RegisterComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
