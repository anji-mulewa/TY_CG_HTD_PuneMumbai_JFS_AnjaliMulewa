import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-add-products',
  templateUrl: './add-products.component.html',
  styleUrls: ['./add-products.component.css']
})
export class AddProductsComponent implements OnInit {

  constructor(private productService: ProductService) { }
  submitForm(form: NgForm) {
    console.log(form.value);
    this.productService.postData(form.value).subscribe(res => {
      console.log(form.value);
      form.reset();
    }, err => {
      console.log(err);
    });
  }
  ngOnInit() {
  }

}
