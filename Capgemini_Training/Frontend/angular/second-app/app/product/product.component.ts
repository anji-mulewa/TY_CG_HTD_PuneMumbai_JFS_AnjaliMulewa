import { Component, OnInit } from '@angular/core';
import { Product } from '../product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  constructor() { }
  products: Product[] = [{
    name: 'MacBook Air',
    imageURL: "https://cdn.pixabay.com/photo/2014/05/02/21/50/home-office-336377__480.jpg",
    price: 54678,
    details: 'Very Good laptop'
  },
  {
    name: 'SmartPhone',
    imageURL: "https://cdn.pixabay.com/photo/2016/12/09/11/33/smartphone-1894723__480.jpg",
    price: 37890,
    details: 'Very Good Phone'
  },
  {
    name: 'Dog',
    imageURL: "https://cdn.pixabay.com/photo/2016/01/05/17/51/dog-1123016__480.jpg",
    price: 72000,
    details: 'Very Good dog'
  },
  {
    name: 'Washing Machine',
    imageURL: "https://image.shutterstock.com/image-photo/interior-real-laundry-room-washing-260nw-1054231892.jpg",
    price: 26810,
    details: 'Very Good washing machine'
  },
  {
    name: 'Smart watch',
    imageURL: "https://cdn.pixabay.com/photo/2015/06/25/17/23/smart-watch-821567__480.jpg",
    price: 18000,
    details: 'Very Good watch'
  },
  ];
  ngOnInit() {
  }

}
