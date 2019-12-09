import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-edit-products',
  templateUrl: './edit-products.component.html',
  styleUrls: ['./edit-products.component.css']
})
export class EditProductsComponent implements OnInit {

  constructor(public productService: ProductService) {
    this.productService.getData();
  }
  selectedProduct: Product = {
    pname: null,
    category: null,
    price: null,
    details: null,
    imgURL: null,
  };

  deleteProduct(product: Product) {
    this.productService.deleteData(product).subscribe(res => {
      console.log(res);
      console.log('deleted one product');
      this.productService.getData();
    }, err => {
      console.log(err);
    });
  }
  selectProduct(product) {
    this.selectedProduct = product;
  }

  submitForm(form: NgForm) {
    this.productService.putData(form.value).subscribe(res => {
      console.log(res);
      form.reset();
    }, err => {
      console.log(err);
    });
  }
  ngOnInit() {
  }

}
