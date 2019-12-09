import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { ProductsComponent } from './products/products.component';
import { AddProductsComponent } from './add-products/add-products.component';
import { EditProductsComponent } from './edit-products/edit-products.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';


const routes: Routes = [
  { path : '' , component: HomeComponent},
  { path : 'products' , component: ProductsComponent},
  { path : 'register' , component: RegisterComponent},
  { path : 'login' , component: LoginComponent},
  { path : 'add-products' , component : AddProductsComponent },
  { path: 'edit-products' , component: EditProductsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
