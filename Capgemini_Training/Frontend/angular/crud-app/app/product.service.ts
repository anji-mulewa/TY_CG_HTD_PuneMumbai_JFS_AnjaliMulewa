import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
 api = 'https://products1-99fd0.firebaseio.com/';
 products: Product[] = [];
  constructor(private http: HttpClient ) { }

  postData(data) {
   return this.http.post(`${this.api}products.json` , data);
  }

  getData() {
    this.http.get(`${this.api}products.json`).subscribe(res => {
      console.log(res);
      const productArray = [];
      for (const key in res) {
      if (res.hasOwnProperty(key)) {
        productArray.push({ ...res[key], pk: key });
      }
      }
      this.products = productArray;
      console.log(this.products);
    });


  }
  deleteData(data) {
   return this.http.delete(`${this.api}products/${data.pk}.json`);
  }

  putData(data) {
    return this.http.put(`${this.api}products/${data.pk}.json` , data);
  }
}
