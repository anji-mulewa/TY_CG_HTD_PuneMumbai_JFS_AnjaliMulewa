import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { CustomersComponent } from './customers/customers.component';
import { ProductsComponent } from './products/products.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';


const routes: Routes = [
  { path: '' , component: HomeComponent},
  { path: 'login' , component: LoginComponent},
  { path: 'customers' , component: CustomersComponent},
  { path: 'products' , component: ProductsComponent},
  { path: '**' , component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
