import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  products = [];
  constructor(private http: HttpClient) {
    http.get<any>('../../assets/products.json').subscribe(data => {
      this.products = data;
      console.log(this.products);
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
