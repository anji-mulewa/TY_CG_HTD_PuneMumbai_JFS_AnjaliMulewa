import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {
  flag=true;
  name='Anjali';
  inputData;
  imgUrl="https://cdn.pixabay.com/photo/2019/10/18/05/51/mountain-4558300_1280.jpg";
  constructor() {
    setInterval(()=>{
      this.flag=!this.flag;
    },1000)
   }

   eventOccured(input) {
     console.log(input.value);
     console.log('Key Up Event Occured');
   }

  ngOnInit() {
  }

}
