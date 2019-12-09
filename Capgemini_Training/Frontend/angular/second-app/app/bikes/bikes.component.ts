import { Component, OnInit } from '@angular/core';
import { Bike } from '../bike';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  bikes:Bike[]=[{
    brand:'BMW',
    imgURL:'https://cdn.pixabay.com/photo/2014/11/18/03/54/motorcycle-535595__480.jpg',
    model:'BMW S 1000 RR',
    price:299999,
    specs:'BMW Motorrad offers everything you need to start your own journey.With the increase in capacity to&nbsp;1254 ccm and 100 kW (136 hp), you have even more power.Three years warranty for you and your new bike for all 2019 models.'
  },
{
  brand:'TVS',
  imgURL:'https://cdn.pixabay.com/photo/2017/12/29/05/58/sport-3046819__480.jpg',
  model:'Apache',
  price:299999,
  specs:'BMW Motorrad offers everything you need to start your own journey.With the increase in capacity to&nbsp;1254 ccm and 100 kW (136 hp), you have even more power.Three years warranty for you and your new bike for all 2019 models.'

},
{
  brand:'Honda',
  imgURL:'https://cdn.pixabay.com/photo/2016/06/13/08/56/motorcycle-1453863__480.jpg',
  model:'Apache',
  price:299999,
  specs:'BMW Motorrad offers everything you need to start your own journey.With the increase in capacity to&nbsp;1254 ccm and 100 kW (136 hp), you have even more power.Three years warranty for you and your new bike for all 2019 models.'

},
{
  brand:'Royal Enfield',
  imgURL:'https://cdn.pixabay.com/photo/2019/05/24/16/38/bullet-ride-4226666__480.jpg',
  model:'Classic 300',
  price:299999,
  specs:'BMW Motorrad offers everything you need to start your own journey.With the increase in capacity to&nbsp;1254 ccm and 100 kW (136 hp), you have even more power.Three years warranty for you and your new bike for all 2019 models.'

}];

selectedBike:Bike =this.bikes[0];
selectBike(bike){
  this.selectedBike=bike;
}
  constructor() { }

  ngOnInit() {
  }

}
